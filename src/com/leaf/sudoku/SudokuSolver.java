package com.leaf.sudoku;

public class SudokuSolver {
    //表尺寸
    private final int SIZE = 9;
    //9个块的坐标
    //[x][y][z]
    //x(0-8):块编号
    //y(0-8):块中格子编号
    //z(0-1):格子横纵坐标
    private final int[][][] BLOCK_COORDINATE =
            {{{0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}},
                    {{0, 3}, {0, 4}, {0, 5}, {1, 3}, {1, 4}, {1, 5}, {2, 3}, {2, 4}, {2, 5}},
                    {{0, 6}, {0, 7}, {0, 8}, {1, 6}, {1, 7}, {1, 8}, {2, 6}, {2, 7}, {2, 8}},
                    {{3, 0}, {3, 1}, {3, 2}, {4, 0}, {4, 1}, {4, 2}, {5, 0}, {5, 1}, {5, 2}},
                    {{3, 3}, {3, 4}, {3, 5}, {4, 3}, {4, 4}, {4, 5}, {5, 3}, {5, 4}, {5, 5}},
                    {{3, 6}, {3, 7}, {3, 8}, {4, 6}, {4, 7}, {4, 8}, {5, 6}, {5, 7}, {5, 8}},
                    {{6, 0}, {6, 1}, {6, 2}, {7, 0}, {7, 1}, {7, 2}, {8, 0}, {8, 1}, {8, 2}},
                    {{6, 3}, {6, 4}, {6, 5}, {7, 3}, {7, 4}, {7, 5}, {8, 3}, {8, 4}, {8, 5}},
                    {{6, 6}, {6, 7}, {6, 8}, {7, 6}, {7, 7}, {7, 8}, {8, 6}, {8, 7}, {8, 8}}};
    //表的内容
    //[x][y]
    //x(0-8):横轴
    //y(0-8):纵轴
    private int[][] sudu_base = new int[SIZE][SIZE];
    private int[][] sudu;
    //每个格子的可能值
    //[x][y][z]
    //x(0-8):横轴
    //y(0-8):纵轴
    //z(0-9):0-可能值的个数
    //z(0-9):(1-9)-是否有可能为该值
    private int[][][] sudu_FLAG = new int[SIZE][SIZE][SIZE + 1];
    //构造函数，初始化sudu和sudu_FLAG
    SudokuSolver(int[][] sudu){
        for(int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                sudu_base[i][j] = sudu[i][j];
            }
        }
        this.sudu = sudu;
        for(int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(this.sudu[i][j] == 0){//格子空
                    sudu_FLAG[i][j][0] = 9; //9个值都有可能
                    for(int k = 1; k <= SIZE; k++){
                        sudu_FLAG[i][j][k] = 1; //坐标i,j的值可能为k
                    }
                }else{//格子非空
                    sudu_FLAG[i][j][0] = 1; //一个可能值
                    sudu_FLAG[i][j][this.sudu[i][j]] = 1; //可能值为sudu[i][j]
                    for (int k = 1; k <= SIZE; k++) {
                        if(k != this.sudu[i][j])
                            sudu_FLAG[i][j][k] = 0; //坐标i,j的值不可能为k
                    }
                }
            }
        }
    }
    //    根据坐标确定块编号
//    | 0 | 1 | 2 |
//    | 3 | 4 | 5 |
//    | 6 | 7 | 8 |
    private int findBlock(int x, int y){
        if(x<0 || x>8 || y<0 || y>8){
            System.out.println("函数findBlock中的参数错误.");
            return -1;
        }
        if(x>=0 && x<=2){ //0 1 2
            switch(y){
                case 0 : case 1 : case 2 : return 0;
                case 3 : case 4 : case 5 : return 1;
                case 6 : case 7 : case 8 : return 2;
            }
        }else if(x>= 3 && x<=5){ //3 4 5
            switch(y){
                case 0 : case 1 : case 2 : return 3;
                case 3 : case 4 : case 5 : return 4;
                case 6 : case 7 : case 8 : return 5;
            }
        }else{ //6 7 8
            switch(y){
                case 0 : case 1 : case 2 : return 6;
                case 3 : case 4 : case 5 : return 7;
                case 6 : case 7 : case 8 : return 8;
            }
        }
        System.out.println("函数findBlock中的未知错误.");
        return -1;
    }
    //按块排除可能值
    private Boolean updateProbValBlock(int x, int y, int k) {
        Boolean FLAG_Updated = false;
        int blockId = findBlock(x, y);
        for(int i = 0; i < 9; i++){ //一个块内有9个格子
            int xx = BLOCK_COORDINATE[blockId][i][0];
            int yy = BLOCK_COORDINATE[blockId][i][1]; //块内当前格子坐标
            if(!(xx == x && yy == y)){ //跳过自己
                if(sudu_FLAG[xx][yy][k] == 1){
                    sudu_FLAG[xx][yy][k] = 0; //排除可能值k
                    sudu_FLAG[xx][yy][0] -= 1; //可能值个数减1
                    FLAG_Updated = true;
                }
            }
        }
        return FLAG_Updated;
    }
    //按行、列排除可能值
    private Boolean updateProbValColAndRow(int x, int y, int k) {
        Boolean FLAG_Updated = false;
        //column
        int count = 1;
        while(count < 9 ){
            int xx = (x + count) % 9; //0-8
            if(sudu_FLAG[xx][y][k] == 1){
                sudu_FLAG[xx][y][k] = 0;//排除可能值k
                sudu_FLAG[xx][y][0] -= 1;
                FLAG_Updated = true;
            }
            count++;
        }
        //row
        count = 1;
        while(count < 9){
            int yy = (y + count) % 9;
            if(sudu_FLAG[x][yy][k] == 1){
                sudu_FLAG[x][yy][k] = 0;
                sudu_FLAG[x][yy][0] -= 1;
                FLAG_Updated = true;
            }
            count ++;
        }
        return FLAG_Updated;
    }
    //solver
    void solve(){
        //对表的一轮遍历是否有更新，无更新即处理完毕
        Boolean FLAG_UPDATED = true;
        //根据已确定值的格子来更新其他格子的可能值
        while(FLAG_UPDATED){
            FLAG_UPDATED = false;
            for(int i = 0; i < SIZE; i++){
                for(int j = 0; j < SIZE; j++){
                    if(sudu_FLAG[i][j][0] == 1){//该格子的值已确定，可用来更新其他格子的可能值
                        //找出该确定值k
                        int k = 1;
                        for(; sudu_FLAG[i][j][k] != 1 && k <= 9; k++);
                        sudu[i][j] = k;
                        //按行和列更新，返回是否有更新
                        Boolean FLAG_RowColUpdated = updateProbValColAndRow(i, j, k);
                        //按块更新，返回是否有更新
                        Boolean FLAG_BlockUpdated = updateProbValBlock(i, j, k);
                        if(FLAG_RowColUpdated || FLAG_BlockUpdated)//有更新
                            FLAG_UPDATED = true;
                    }
                }
            }
        }
        System.out.println("完毕");
        //打印结果
        print();
    }
    //打印
    /*打印效果(中括号内为后填入的数字)
     8  [0] [0] | [0]  5   9  | [0] [0] [0]
    [0]  4   5  | [0]  8   7  |  9   6  [0]
    [0]  9  [0] |  2  [0]  4  |  5   8   7
    ---------------------------------------
    [0] [0]  9  | [0] [0]  6  |  8   4   1
     4   1  [0] | [0] [0] [0] |  6  [0] [0]
     6   2   8  |  4  [0] [0] |  3   7   5
    ---------------------------------------
    [0]  7   1  |  9   6   2  |  4   3   8
    [0]  8   4  |  7  [0]  3  |  2   5  [0]
    [0] [0]  2  |  8  [0]  5  |  7  [0]  9
    */
    private void print() {
        /*for(int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(sudu_base[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(sudu[i][j]);
            }
            System.out.println();
        }*/
        //先格式化打印原始表
        System.out.println(" ----------------------------------------- ");
        for(int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                if(sudu_base[i][j] != 0){//初始值打印时不带中括号
                    System.out.print(" ");
                    System.out.print(sudu[i][j]);
                    System.out.print("  ");
                }else{
                    System.out.print("    ");
                }
                if((j % 3 == 2) && (j != 8))
                    System.out.print("| ");
            }
            System.out.println("|");
            if((i % 3 == 2) && (i != 8)) {
                System.out.println(" ----------------------------------------- ");
            }
        }
//        System.out.println("                    |");
        System.out.println(" ----------------------------------------- ");
        System.out.println("                    ↓");
        //打印处理完毕的表
        System.out.println(" ----------------------------------------- ");
        for(int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                if(sudu_base[i][j] != 0){//初始值打印时不带中括号
                    System.out.print(" ");
                    System.out.print(sudu[i][j]);
                    System.out.print("  ");
                }else{
                    System.out.print("[");
                    System.out.print(sudu[i][j]);
                    System.out.print("] ");
                }
                if((j % 3 == 2) && (j != 8))
                    System.out.print("| ");
            }
            System.out.println("|");
            if((i % 3 == 2) && (i != 8)) {
                System.out.println(" ----------------------------------------- ");
            }
        }
        System.out.println(" ----------------------------------------- ");
    }
}


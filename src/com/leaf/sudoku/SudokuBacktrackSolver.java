package com.leaf.sudoku;

public class SudokuBacktrackSolver {

    //表尺寸
    private final int SIZE = 9;
    //9个块的坐标
    //[x][y][z]
    //x(0-8):块编号
    //y(0-8):块中格子编号
    //z(0-1):格子横纵坐标
    private final int[][][] BLOCK_COORDINATE = {{{0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}},
            {{0, 3}, {0, 4}, {0, 5}, {1, 3}, {1, 4}, {1, 5}, {2, 3}, {2, 4}, {2, 5}},
            {{0, 6}, {0, 7}, {0, 8}, {1, 6}, {1, 7}, {1, 8}, {2, 6}, {2, 7}, {2, 8}},
            {{3, 0}, {3, 1}, {3, 2}, {4, 0}, {4, 1}, {4, 2}, {5, 0}, {5, 1}, {5, 2}},
            {{3, 3}, {3, 4}, {3, 5}, {4, 3}, {4, 4}, {4, 5}, {5, 3}, {5, 4}, {5, 5}},
            {{3, 6}, {3, 7}, {3, 8}, {4, 6}, {4, 7}, {4, 8}, {5, 6}, {5, 7}, {5, 8}},
            {{6, 0}, {6, 1}, {6, 2}, {7, 0}, {7, 1}, {7, 2}, {8, 0}, {8, 1}, {8, 2}},
            {{6, 3}, {6, 4}, {6, 5}, {7, 3}, {7, 4}, {7, 5}, {8, 3}, {8, 4}, {8, 5}},
            {{6, 6}, {6, 7}, {6, 8}, {7, 6}, {7, 7}, {7, 8}, {8, 6}, {8, 7}, {8, 8}}};
    //表内容
    private int[][] sudu_base = new int[SIZE][SIZE];
    private int[][] sudu;

    public SudokuBacktrackSolver(int[][] sudu) {
        //一个浅拷贝一个深拷贝
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                sudu_base[i][j] = sudu[i][j];
            }
        }
        this.sudu = sudu;
    }

    //    根据坐标确定块编号
//    | 0 | 1 | 2 |
//    | 3 | 4 | 5 |
//    | 6 | 7 | 8 |
    private int findBlock(int x, int y) {
        if (x < 0 || x > 8 || y < 0 || y > 8) {
            System.out.println("函数findBlock中的参数错误.");
            return -1;
        }
        if (x >= 0 && x <= 2) { //0 1 2
            switch (y) {
                case 0:
                case 1:
                case 2:
                    return 0;
                case 3:
                case 4:
                case 5:
                    return 1;
                case 6:
                case 7:
                case 8:
                    return 2;
            }
        } else if (x >= 3 && x <= 5) { //3 4 5
            switch (y) {
                case 0:
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                    return 4;
                case 6:
                case 7:
                case 8:
                    return 5;
            }
        } else { //6 7 8
            switch (y) {
                case 0:
                case 1:
                case 2:
                    return 6;
                case 3:
                case 4:
                case 5:
                    return 7;
                case 6:
                case 7:
                case 8:
                    return 8;
            }
        }
        System.out.println("函数findBlock中的未知错误.");
        return -1;
    }

    public void dfs(int x, int y) {
        if ((x + y != 0) && !check(x, y)) {
            return;
        }
        int[] next = {x, y};
        //从上到下、从左到右找下一个未赋值的格子
        findNext(next);
        if (next[0] == -1) { //没有找到，已完成
            print();
            return;
        }
        //将未赋值格子依次赋值为1-9
        int nextX = next[0];
        int nextY = next[1];
        for (int k = 1; k <= 9; k++) {
            sudu[nextX][nextY] = k;
            dfs(nextX, nextY);
            sudu[nextX][nextY] = 0;
        }
    }

    //sudu[i][j]放置值后，是否满足规则
    public boolean check(int i, int j) {
        //横
        int flag = 1; //用位运算判断横、竖、块中1-9的存在性
        for (int k = 0; k < SIZE; k++) {
            if (sudu[i][k] != 0) {
                if ((flag & (1 << sudu[i][k])) > 0) { //判断对应位是不是1
                    return false;
                }
                flag = flag ^ (1 << sudu[i][k]); //把对应位置1
            }
        }
        //竖
        flag = 1;
        for (int k = 0; k < SIZE; k++) {
            if (sudu[k][j] != 0) {
                if ((flag & (1 << sudu[k][j])) > 0) {
                    return false;
                }
                flag = flag ^ (1 << sudu[k][j]);
            }
        }
        //块
        flag = 1;
        int blockId = findBlock(i, j);
        for (int k = 0; k < 9; k++) {
            int x = BLOCK_COORDINATE[blockId][k][0];
            int y = BLOCK_COORDINATE[blockId][k][1];
            if (sudu[x][y] != 0) {
                if ((flag & (1 << sudu[x][y])) > 0) {
                    return false;
                }
                flag = flag ^ (1 << sudu[x][y]);
            }
        }
        return true;
    }

//    boolean isDone() {
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                if (sudu[i][j] == 0)
//                    return false;
//            }
//        }
//        return true;
//    }

    //找下一个（包含自己）未处理的格子
    public void findNext(int[] pos) {
        if (sudu[pos[0]][pos[1]] == 0) return; //下一个就是自己
        while (sudu[pos[0]][pos[1]] != 0) {
            if (pos[1] < SIZE - 1) { //还在当前行
                pos[1] += 1;
            } else { //转到下一行
                pos[0] += 1;
                pos[1] = 0;
                if (pos[0] >= SIZE) { //超出范围了，没有找到
                    pos[0] = -1;
                    break;
                }
            }
        }
    }

    public void solve() {
        dfs(0, 0);
    }

    public void print() {
        //先格式化打印原始表
        System.out.println(" ----------------------------------------- ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                if (sudu_base[i][j] != 0) {//初始值打印时不带中括号
                    System.out.print(" ");
                    System.out.print(sudu[i][j]);
                    System.out.print("  ");
                } else {
                    System.out.print("    ");
                }
                if ((j % 3 == 2) && (j != 8))
                    System.out.print("| ");
            }
            System.out.println("|");
            if ((i % 3 == 2) && (i != 8)) {
                System.out.println(" ----------------------------------------- ");
            }
        }
//        System.out.println("                    |");
        System.out.println(" ----------------------------------------- ");
        System.out.println("                    ↓");
        //打印处理完毕的表
        System.out.println(" ----------------------------------------- ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                if (sudu_base[i][j] != 0) {//初始值打印时不带中括号
                    System.out.print(" ");
                    System.out.print(sudu[i][j]);
                    System.out.print("  ");
                } else {
                    System.out.print("[");
                    System.out.print(sudu[i][j]);
                    System.out.print("] ");
                }
                if ((j % 3 == 2) && (j != 8))
                    System.out.print("| ");
            }
            System.out.println("|");
            if ((i % 3 == 2) && (i != 8)) {
                System.out.println(" ----------------------------------------- ");
            }
        }
        System.out.println(" ----------------------------------------- ");
    }
}

package com.leaf.sudoku;

import java.util.Scanner;

/**
 * 一个简单的数独解决器
 */
public class Main {
    public static void main(String args[]) {
        int SIZE = 9;
        int[][] sudu = new int[SIZE][SIZE];
        while (true) {
            System.out.println("请输入(9*9):");
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    sudu[i][j] = input.nextInt();
                }
            }
            //SudokuSolver ss = new SudokuSolver(sudu);
            SudokuBacktrackSolver ss = new SudokuBacktrackSolver(sudu);
            ss.solve();
        }
    }
}

/*
8 0 0 0 5 9 0 0 0
0 4 5 0 8 7 9 6 0
0 9 0 2 0 4 5 8 7
0 0 9 0 0 6 8 4 1
4 1 0 0 0 0 6 0 0
6 2 8 4 0 0 3 7 5
0 7 1 9 6 2 4 3 8
0 8 4 7 0 3 2 5 0
0 0 2 8 0 5 7 0 9
 */
/*
1 2 3 4 5 6 7 8 9
4 5 6 7 8 9 1 2 3
7 8 9 1 2 3 4 5 6
2 3 4 5 6 7 8 9 1
5 6 7 8 9 1 2 3 4
8 9 1 2 3 4 5 6 7
3 4 5 6 7 8 9 1 2
6 7 8 9 1 2 3 4 5
9 1 2 3 4 5 6 7 8
 */
/*
0 0 1 0 0 4 0 0 0
0 0 7 0 0 9 0 0 0
0 0 6 0 7 0 1 5 8
7 5 0 9 0 0 0 0 0
0 0 9 0 2 0 5 0 0
0 0 0 0 0 1 0 9 6
1 3 5 0 9 0 6 0 0
0 0 0 8 0 0 4 0 0
0 0 0 3 0 0 2 0 0
*/
/*
2 0 0 0 0 9 0 0 8
9 3 0 0 0 0 0 0 6
0 5 0 7 0 6 4 0 0
0 4 2 0 1 0 6 0 5
0 0 0 4 0 0 8 0 0
0 0 0 3 0 0 0 9 4
0 0 0 0 0 0 0 0 0
5 6 7 1 0 3 0 0 0
3 1 0 0 0 0 0 0 0
 */
/*
0 1 6 0 3 0 5 0 4
7 0 0 5 0 6 9 0 0
0 5 0 0 0 4 0 0 8
0 6 0 2 4 0 0 0 0
4 0 0 0 0 8 0 0 9
0 0 3 0 0 0 2 0 0
0 0 0 0 0 0 0 2 0
0 0 8 0 0 0 0 1 0
0 0 5 1 0 0 6 0 3
 */

package com.example.myapplication;

public class SpiralMatrix {

    static int[][] matrix = {
            {1,  2,  3,  4,  5},
            {6,  7,  8,  9,  10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
    };

    static int length = matrix.length;
    static int rowPos = 0;
    static int colPos = 0;

    static void printSpiral() {
        for (int i = 0; i <= length / 2; i++) {
            rowPos = i;
            colPos = i;
            for (colPos = i; colPos < length - i; colPos++) {
                System.out.println(matrix[rowPos][colPos]);
            }
            colPos--;
            for (rowPos = i+1; rowPos < length - i; rowPos++) {
                System.out.println(matrix[rowPos][colPos]);
            }
            rowPos--;
            colPos--;
            for (colPos=colPos; colPos >= i; colPos--) {
                System.out.println(matrix[rowPos][colPos]);
            }
            colPos++;
            for (rowPos = rowPos-1; rowPos >= i; rowPos--) {
                System.out.println(matrix[rowPos][colPos]);
            }
            rowPos++;
        }
    }
}

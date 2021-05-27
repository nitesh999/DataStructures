package com.example.myapplication;

public class DiagonalMatrix {

    static int[][] matrix = {
            {1,  2,  3,  4,  5},
            {6,  7,  8,  9,  10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
    };

    static int length = matrix.length;

    static void printDiagonalMatrix() {
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                System.out.println(matrix[i][0]);
            } else {
                int tempRowIndex = i;
                int colLoc = 0;
                while (tempRowIndex >= 0) {
                    System.out.println(matrix[tempRowIndex][colLoc]);
                    tempRowIndex--;
                    colLoc++;
                }
            }
        }
        int rowLength = length-1;
        for (int i = 1; i <= rowLength; i++) {
            int tempColIndex = i;
            int rowLoc = rowLength;
            while (tempColIndex <= rowLength) {
                System.out.println(matrix[rowLoc][tempColIndex]);
                tempColIndex++;
                rowLoc--;
            }
        }
    }
}


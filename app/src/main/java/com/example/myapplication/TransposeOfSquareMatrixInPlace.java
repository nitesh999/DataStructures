package com.example.myapplication;

public class TransposeOfSquareMatrixInPlace {

    static void transposeOfSquareMatrixInPlace() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                if (i != j) {
                    int data = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = data;
                }
            }
        }
        System.out.println("\nAfter Transpose");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

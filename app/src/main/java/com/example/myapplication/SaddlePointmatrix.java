package com.example.myapplication;

public class SaddlePointmatrix {

    static int[][] matrix = {
            {4, 5, 9},
            {7, 18, 19},
            {5, 1, 21}
    };

    static int length = matrix.length;

    static void printSaddlePoint() {

        int colLoc = 0;
        for (int i = 0; i < length; i++) {//row Pos
            int minElement = matrix[i][0];
            for (int j = 0; j < length; j++) {//col Pos
                if (matrix[i][j] < minElement) {//row traversal
                    minElement = matrix[i][j];
                    colLoc = j;
                }
            }
            int maxElement = matrix[0][colLoc];
            for (int k = 0; k < length; k++) {
                if (maxElement < matrix[k][colLoc]) {
                    maxElement = matrix[k][colLoc];
                }
            }

            if(minElement==maxElement){
                System.out.println("Saddle Point "+maxElement);
            }
        }
    }
}

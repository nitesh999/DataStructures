package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    static int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Power power = new Power();
        System.out.println("power "+power.pow(2, 9));
        TaylorSeries taylorSeries = new TaylorSeries();
        taylorSeries.taylorSeries(2, 5);*/

        /*FibonacciMemoization fib = new FibonacciMemoization(9);
        int res = fib.fib(9);
        System.out.println(res);
        SearchDuplicates searchDuplicates = new SearchDuplicates();
        searchDuplicates.printRepeating();*/
        //add(2);
        //StringPermutation stringPermutation = new StringPermutation();
        //stringPermutation.perm("abc".toCharArray(), 0, "abc".length()-1);

        //StringAnagram.areAnagram("geeksforgeeks", "forgeeksgeeks");
        //StringDuplicates.printDups("geeksforgeeks");
        //int[] poly = {2, -6, 2, -1};
        //HornerPolynomial.horner(poly, poly.length, 3);

        //TaylorSeries.taylorSeries(2, 5);
        //TaylorSeriesHornerRule.taylorSeries(2, 4);

        //RotateMatrix90.rotateMatrixInplace();
        //SpiralMatrix.printSpiral();
        //TransposeOfSquareMatrixInPlace.transposeOfSquareMatrixInPlace();
        //SaddlePointmatrix.printSaddlePoint();
        DiagonalMatrix.printDiagonalMatrix();
    }

    int add(int n){
        if(n==0){
            return n;
        }
        int val = add(n-1);
        return val + n;
    }

}

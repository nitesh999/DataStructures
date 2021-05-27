package com.example.myapplication;

public class TaylorSeriesHornerRule {

    static int res;

    static int taylorSeries(int x, int n) {
        if (n > 0) {
            int p = x / n;
            res = 1 + p * res;
            System.out.println("res "+res);
            return taylorSeries(x, n - 1);
        } else {
            System.out.println("num" + 1 + " den" + 1);
            return res = 1;
        }
    }
}

package com.example.myapplication;

public class TaylorSeries {

    static int num = 1, den = 1;
    // float res = 1;
    static int taylorSeries(int x, int p){
        if(p>0) {
            taylorSeries(x, p-1);
            num = x * num;
            den = p * den;
            float res = num/den;
            System.out.println("num"+num+" den" + den);
            System.out.println("prop"+res);
            return (num/den);
        }else{
            System.out.println("num"+1+" den" + 1);
            return 1;
        }
    }
}

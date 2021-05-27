package com.example.myapplication;

public class FibonacciMemoization {

    private int[] tempFib;

    FibonacciMemoization(int n){
        tempFib = new int[n];
    }

    int fib(int n){
        if(n<=1) {
            tempFib[n] = n;
            return tempFib[n];
        }else {
            if (tempFib[n - 2] == 0 && n!=0) {
                tempFib[n - 2] = fib(n - 2);
            } if (tempFib[n - 1] == 0) {
                tempFib[n - 1] = fib(n - 1);
            }
            return tempFib[n - 2] + tempFib[n - 1];
        }
    }
}

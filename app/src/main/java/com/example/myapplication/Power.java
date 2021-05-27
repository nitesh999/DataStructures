package com.example.myapplication;

public class Power {

    int pow(int x, int p){
        if(p<=0){
            return 1;
        }else{
            if(p%2==0){
                return pow(x*x, p/2);
            }else{
                return x*pow(x*x, p/2);
            }
        }
    }
}

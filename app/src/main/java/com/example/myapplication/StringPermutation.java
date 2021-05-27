package com.example.myapplication;

public class StringPermutation {

    void perm(char[] str, int l, int h){
        //int length = str.length;

        if(l==h){
            System.out.println("Perm "+ String.copyValueOf(str));
        }else {
            for (int i = l; i <=h; i++) {
                swap(str, l, i);
                System.out.println("L "+l+" i "+i);
                perm(str, l + 1, h);
                System.out.println("l "+l+" i "+i);
                swap(str, l, i);
            }
        }
    }

    private void swap(char[] str, int l, int i) {
        char temp;
        //char[] charArray = a.toCharArray();
        temp = str[l] ;
        str[l] = str[i];
        str[i] = temp;
        //return String.valueOf(charArray);
    }
}

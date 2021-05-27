package com.example.myapplication;

class HornerPolynomial
{ 
    // Function that returns value of poly[0]x(n-1) + 
    // poly[1]x(n-2) + .. + poly[n-1] 
    static int horner(int poly[], int n, int x) 
    { 
        // Initialize result 
        int result = poly[0];   
   
        // Evaluate value of polynomial using Horner's method 
        for (int i=1; i<n; i++) 
            result = result*x + poly[i];
        System.out.println("Value of polynomial is " + result);
        return result; 
    } 

} 
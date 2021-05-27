package com.example.myapplication;


public class StringAnagram {

    // Function to check whether two strings are anagram of
    // each other
    static void areAnagram(String str1, String str2) {
        // If two strings have different length
        if (str1.length() != str2.length()) {
            return;
        }

        // To store the xor value
        int value = 0;

        for (int i = 0; i < str1.length(); i++) {
            value = value ^ (int) str1.charAt(i);
            System.out.println("str1 "+value);
            value = value ^ (int) str2.charAt(i);
            System.out.println("str2 "+value);
        }
        if (value == 0)
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");
    }

}

// This code is contributed by 29AjayKumar


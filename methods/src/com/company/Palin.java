package com.company;

import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        System.out.println("Enter a number:" );
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

       String ans = palindrome(num);
        System.out.println(ans);

    }
    static String palindrome(int a){
        int origin = a;
        int ans = 0;
        while (a != 0){
            int rem = a %10;
            ans = (ans * 10) + rem;
            a = a / 10;
        }
        if( origin == ans){
            return "Number is Palindrome .";
        }else
            return "Number is not palindrome";
    }
}

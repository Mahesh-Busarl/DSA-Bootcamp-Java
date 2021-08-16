package com.company;

import java.util.Scanner;

public class Prime_Num {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        prime(num);

    }

    private static void prime(int n) {
        if (n <= 1){
            System.out.println("number is neither prime nor ");
            return;
        }
        int c = 2;
        while ( c*c <= n){
            if (n % c == 0){
                System.out.println("Not Prime");
                return;
            }
            c++;
        }
        if (c*c> n)
            System.out.println("Prime");

    }
}

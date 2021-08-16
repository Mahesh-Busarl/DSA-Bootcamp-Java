package com.company;

import java.util.Scanner;

public class Facto_fun {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int answer = Factorial(n);
        System.out.println("Factorial is " + answer);

    }
    static int Factorial(int a){
        int ans =1;

        while ( a >= 1){
            ans = ans * a;
            a--;
        }
        return ans;
    }
}

package com.company;

import java.util.Scanner;

public class MaxMini {
    public static void main(String[] args) {
        System.out.println("Enter first number:");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Enter second number:");
        int num2 = in.nextInt();
        System.out.println("Enter third number :");
        int num3 = in.nextInt();

        int ans = max(num1,num2,num3);
        System.out.println("Max is " + ans);

        int answer = mini(num1,num2,num3);
        System.out.println("Minimum is " + answer);

    }

     static int mini(int a, int b, int c) {

        int mini = a;
        if (b < mini){
            mini = b;
        }
        if (c < mini){
            mini = c;
        }
        return mini;
    }

    static int max(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if(c > max)
            max = c;
        return max;

    }
}

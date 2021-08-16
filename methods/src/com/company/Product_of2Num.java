package com.company;

import java.util.Scanner;

public class Product_of2Num {
    public static void main(String[] args) {
        System.out.println("Enter first number:");
        Scanner in =new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Enter second number:");
        int num2 = in.nextInt();
        int answer = product(num1,num2);
        System.out.println("Product is "+ answer);

    }
    static int product(int a , int b){
        int ans = a * b;
        return ans;
    }
}

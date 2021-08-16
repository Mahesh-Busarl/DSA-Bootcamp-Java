package com.company;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(evenodd(num));
    }
   /// 0 is even ,because it can be divided evenly by 2.
     static String  evenodd(int n) {
        if (n % 2 == 0){
            return " Number is Even!";
        }else
            return "Number is Odd";
    }
}

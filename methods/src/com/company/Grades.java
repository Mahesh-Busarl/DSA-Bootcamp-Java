package com.company;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        System.out.println("Enter your marks:");
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        System.out.println(grade(marks));

    }

     static String grade(int m) {
        if( m>= 91){
            return "AA";
        }else if(m >= 81){
            return "AB";
        }else if (m >= 61){
            return "BB";
        }else if (m >= 51){
            return "CD";
        }else if (m >= 41){
            return "DD";
        }else
            return "Fail";

    }

}

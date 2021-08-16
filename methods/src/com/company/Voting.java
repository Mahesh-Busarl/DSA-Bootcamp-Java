package com.company;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        System.out.println(CanVote(age));
    }

     static String CanVote(int a) {
        if(a >= 18){
            return "You can vote.!";
        }else
            return "You Cannot vote!!";

    }
}

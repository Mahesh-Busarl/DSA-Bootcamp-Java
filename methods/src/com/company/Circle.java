package com.company;

import java.security.cert.CertPathValidatorException;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("Enter the radius:");
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();

        float answer = (area(radius));
        System.out.println("Area of circle is: " + answer);
        float ans = (circumference(radius));
        System.out.println("Circumference of circle is " + ans);

    }

     static float circumference(float r) {
        float ans = (float)(2 * 3.14 * r);
        return ans;
    }

     static float area(float r) {
        float ans = (float) (3.14 * r * r);
        return ans;

    }
}

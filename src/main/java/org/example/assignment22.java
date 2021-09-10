/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Scanner;

public class assignment22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ask for all the numbers
        System.out.println("Enter the first number");
        int A = scan.nextInt();

        System.out.println("Enter the second number");
        int B = scan.nextInt();

        System.out.println("Enter the third number");
        int C = scan.nextInt();

        //Check first to see that all(so even if there is 1 different, still exit)
        //numbers are different. If they’re not different, then exit the program.
        if (A == B || A == C) {
            System.exit(0);
        }

        if (A > B && A > C) {
            System.out.println("The largest number is " + A);
        }
        if (B > A && B > C) {
            System.out.println("The largest number is " + B);
        }
        if (C > A && C > B) {
            System.out.println("The largest number is " + C);
        }

    }
}

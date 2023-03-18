package com.coding.recursion;

/*

Reference from Udemy course "Mastering the coding interview : Data Structures + Algorithms " by "Andrei Neagoie"
 */

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String args[]){
        System.out.println("Please enter the number to find the factorial of: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(fact(number));
    }

    private static int fact(int number) {
        if(number==2) {
            return 2;
        }
        else
        return number * fact(number-1);
    }
}

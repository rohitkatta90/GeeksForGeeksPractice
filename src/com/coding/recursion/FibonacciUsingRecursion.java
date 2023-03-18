package com.coding.recursion;

/*

If the performance of Recursion is very bad, the why to use it?
We can improve the performance of recursion by using Dynamic programming.

 */

import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String args[]){
        System.out.println("Please enter the number of fibonacci series to be displayed: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        //System.out.println("0 1 ");
        System.out.print(fibonacciRecursive(number));
    }

    private static int fibonacciRecursive(int i) {
        if(i < 2){
            return i;
        }
        return fibonacciRecursive(i-2) + fibonacciRecursive(i-1); // O(2^n) Its exponential which is very bad.
    }
}

package com.coding.general;

public class FibonacciSeries {
    public static void main(String[] args){
        int num = 8;
        fibonacciSeries(num);
    }

    public static void fibonacciSeries(int num){
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;
        System.out.print(firstNumber+", "+secondNumber+", ");
        for(int i = 1 ; i < num -1 ; i++) {
            sum = firstNumber + secondNumber;
            System.out.print( sum + ", ");
            firstNumber = secondNumber;
            secondNumber = sum;
        }
    }

}

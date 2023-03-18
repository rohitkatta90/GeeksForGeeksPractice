package com.coding.staticPractice;

public class StaticPractice {
    static int x;
    static{
        x = 10;
        System.out.println("First static block");
    }
    public static void main(String[] args){
        System.out.println("Inside main method");

    }

    static{
        //x = 20;
        System.out.println("Last static block");
    }

}
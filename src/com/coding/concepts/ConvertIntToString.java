package com.coding.concepts;

public class ConvertIntToString {

    public static void main(String args[]){
        int num = 10;
        System.out.println("Integer  is: "+num);

        String number;
        number = String.valueOf(num);
        System.out.println("Converted String using String.valueOf(): "+number);

    }
}

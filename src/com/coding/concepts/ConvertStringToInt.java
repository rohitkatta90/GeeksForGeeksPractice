package com.coding.concepts;

public class ConvertStringToInt {

    public static void main(String args[]){
        String num = "123";
        System.out.println("String  is: "+num);

        int number1;
        number1 = Integer.parseInt(num);
        System.out.println("Converted Integer using Integer.parseInt(): "+(number1 + 1));

        int number2;
        number2 = Integer.valueOf(num);
        System.out.println("Converted Integer using Integer.valueOf(): "+(number2 + 1));

        int asciiOfZero = '0';
        // Here, the concept is that, the ascii value of ZERO(0) is 48.
        // So we take each individual char from the string and subtract it by ascii value of 0
        //this will covert the char to the same number.
        int number = 0;
        System.out.println(asciiOfZero);
        for(int i = 0 ; i < num.length(); i++){
            number = number * 10;
            number += num.charAt(i) - asciiOfZero;

        }
        System.out.println("The converted Integer without using in build functions: "+ (number+1));
    }
}

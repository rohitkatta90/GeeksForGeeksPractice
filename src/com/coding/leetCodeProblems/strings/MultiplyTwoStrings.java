package com.coding.leetCodeProblems.strings;

public class MultiplyTwoStrings {
    public static void main(String args[]){
        String a = "505041410988047";
        String b = "3318139";
        System.out.println(multiplyStrings(a, b));
    }

    public static String multiplyStrings(String s1,String s2)
    {
        int asciiOfZero = '0';
        // Here, the concept is that, the ascii value of ZERO(0) is 48.
        // So we take each individual char from the string and subtract it by ascii value of 0
        //this will covert the char to the same number.
        long number1 = 0;
        int num1 = 0;
        int num2 = 0;
        int i;
        int j;
        boolean isNegative = false;


        if(s1.contains("-")){
            i = 1;
        }else{
            i = 0;
        }
        if(s2.contains("-")){
            j = 1;
        }else{
            j = 0;
        }
        if(j==1 && i == 1){
            isNegative = false;
        }else if(j==1 || i == 1){
            isNegative = true;
        }
        //System.out.println(asciiOfZero);
        for( ; i < s1.length(); i++){
            number1 = number1 * 10;
            number1 += s1.charAt(i) - asciiOfZero;
            if(number1 > Integer.MAX_VALUE){
                int quotient = (int) (number1 / Integer.MAX_VALUE);
                int remainder = (int) (number1 % Integer.MAX_VALUE);


            }

        }

        long number2 = 0;
        //System.out.println(asciiOfZero);
        for( ; j < s2.length(); j++){
            number2 = number2 * 10;
            number2 += s2.charAt(j) - asciiOfZero;

        }
        System.out.println(number1);
        System.out.println(number2);

        long result = number1 * number2;
        System.out.println(result);
        //System.out.println(505041410988047 * 3318139);
        System.out.println(Integer.MAX_VALUE);
        if(isNegative){
            result = -result;
        }
        return String.valueOf(result);
    }
}

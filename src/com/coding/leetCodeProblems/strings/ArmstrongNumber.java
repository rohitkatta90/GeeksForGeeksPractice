package com.coding.leetCodeProblems.strings;

public class ArmstrongNumber {

    public static void main(String args[]){
        int num = 370;
        System.out.println(isArmstrong(num));
    }

    public static String isArmstrong(int num){
        int givenNumber = num;
        int calculatedNum = 0;
        while(num > 0){
            int remainder = num % 10;
            calculatedNum = calculatedNum + (remainder * remainder * remainder);
            num = num/10;
        }
        if(calculatedNum == givenNumber){
            return "Yes";
        }
        return "No";
    }
}

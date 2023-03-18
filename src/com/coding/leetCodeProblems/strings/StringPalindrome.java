package com.coding.leetCodeProblems.strings;


/*
https://practice.geeksforgeeks.org/problems/palindrome-string0817/1

Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc"
Output: 0
Explanation: S is not a palindrome
 */

public class StringPalindrome {

    public static void main(String[] args){
        String str = "abc";
        System.out.println("String is palindrome or not : " + isPalindrome(str));
    }
    public static int isPalindrome(String str){
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while(start<end){
            if(charArray[start] != charArray[end]){
                return 0;
            }else{
                start++;
                end--;
            }
        }
        return 1;
    }
}

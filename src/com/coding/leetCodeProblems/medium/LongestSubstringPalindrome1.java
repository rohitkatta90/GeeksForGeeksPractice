package com.coding.leetCodeProblems.medium;


/*
Solution by Nick White. Found on Youtube. Leetcode solution.
 */
public class LongestSubstringPalindrome1 {
    public static String palindrome(String s){
       if(s == null || s.length() < 1) return "";

       int start = 0;
       int end = 0;
       for(int i = 0; i < s.length() ; i++){
           System.out.println("Start : " + start + "   End : " + end);
           int len1 = expandFromMiddle(s, i, i);
           int len2 = expandFromMiddle(s, i, i+1);
           int len = Math.max(len1,len2);
           if (len > end - start){
               start = i - ((len-1)/2);
               end = i + len/2;
           }
       }
       return s.substring(start,end+1);
    }

    public static int expandFromMiddle(String s, int left, int right){
        if(s == null || left > right) return 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        int strLength = right - left - 1;
        return strLength;
    }

    public static void main(String[] args){
        String str = "racecar";
        System.out.println(palindrome(str));
    }
}

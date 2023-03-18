package com.coding.leetCodeProblems.strings;

/*
InputType = String
Input String Contains Only The Lowercase English Letters
Input String Length - 1<= N < = 100000

Explanation Reference: https://www.youtube.com/watch?v=5co5Gvp_-S0&list=PLU_sdQYzUj2mE8quVfDEGnupdS7XuU2YW

Approach 1 : Brute Force , the complexity in this case is 0(N*N) which is bad.

 */

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String args[]){
        String str = "aaabcccdeeef";
        char duplicateChar = bruteForceWay(str);
        //char duplicateChar = hashMap(str);
        System.out.println("First non repeating duplicate character is: "+duplicateChar);

    }

    private static char hashMap(String str) {
        HashMap<Character,Integer> char_count = new HashMap<>();

        for(int i =0; i <  str.length(); i++){
            char currectChar = str.charAt(i);
            if(char_count.containsKey(currectChar)){
                char_count.put(currectChar,char_count.get(currectChar)+1);
            }else{
                char_count.put(currectChar,1);
            }
        }

        for(int i =0; i <  str.length(); i++){
            char current_Char = str.charAt(i);
            if(char_count.get(current_Char)==1){
                return current_Char;
            }
        }
        return '_';
    }

    private static char bruteForceWay(String str) {

        for(int i =0; i <  str.length(); i++){
            boolean seenDuplicate=false;
            for(int j =i+1; j <  str.length(); j++){
                if(str.charAt(i)==str.charAt(j) && (i != j)){
                    seenDuplicate=true;
                    break;
                }
                if(!seenDuplicate) return str.charAt(j);
            }

            }
        return '_';
    }

}

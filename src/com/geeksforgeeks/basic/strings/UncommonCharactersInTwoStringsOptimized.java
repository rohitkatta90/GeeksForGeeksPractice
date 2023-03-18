package com.geeksforgeeks.basic.strings;

import java.util.Arrays;

public class UncommonCharactersInTwoStringsOptimized {

    public static void main(String args[]) {
        UncommonCharactersInTwoStringsBruteForce uc = new UncommonCharactersInTwoStringsBruteForce();
        System.out.println(uc.UncommonChars("rohit", "rani"));
    }

    String UncommonChars(String A, String B) {

        int present[] = new int[26];

        for(int i = 0; i < present.length; i++){
            present[i] = 0;
        }

        for(int i = 0; i < A.length(); i++){
            if(present[A.charAt(i) - 'a'] == 1) {
                present[A.charAt(i) - 'a'] = -1;
            }
            present[A.charAt(i) - 'a'] = 1;
        }

        for(int i = 0; i < B.length(); i++){
            if(present[B.charAt(i) - 'a'] != 1 || present[B.charAt(i) - 'a'] != -1) {
                present[B.charAt(i) - 'a'] = 2;
            }
        }

        String str = "";
        for(int i = 0; i < present.length; i++){
            if(present[i] == 1 || present[i] == 2){
                str = str + (i + 'a');
            }
        }

        char strArray[] = str.toCharArray();
        Arrays.sort(strArray);
        if (Arrays.toString(strArray).length() >= 1){
            return Arrays.toString(strArray);
        }
        return "-1";


    }

}

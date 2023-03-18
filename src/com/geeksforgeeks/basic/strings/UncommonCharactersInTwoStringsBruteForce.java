package com.geeksforgeeks.basic.strings;

import java.util.Arrays;

public class UncommonCharactersInTwoStringsBruteForce {

    public static void main(String args[]) {
        UncommonCharactersInTwoStringsBruteForce uc = new UncommonCharactersInTwoStringsBruteForce();
        System.out.println(uc.UncommonChars("geeksforgeeksfor", "geeksquiz"));
    }

    String UncommonChars(String A, String B) {
        boolean foundChar[] = new boolean[26];
        String str = "";

        for (int i = 0; i < A.length(); i++) {
            boolean commonChar = false;
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    commonChar = true;
                    break;
                }
            }
            if (commonChar == false && foundChar[A.charAt(i) - 'a'] != true) {
                foundChar[A.charAt(i) - 'a'] = true;
                str = str + A.charAt(i);
            }
        }
        for (int i = 0; i < B.length(); i++) {
            boolean commonChar = false;
            for (int j = 0; j < A.length(); j++) {
                if (B.charAt(i) == A.charAt(j)) {
                    commonChar = true;
                    break;
                }
            }
            if (commonChar == false && foundChar[B.charAt(i) - 'a'] != true) {
                foundChar[B.charAt(i) - 'a'] = true;
                str = str + B.charAt(i);
            }
        }
        char[] strArrya = str.toCharArray();
        Arrays.sort(strArrya);
        String sortedString = new String(strArrya);
        if(sortedString.length() >= 1){
            return sortedString;
        }
        return "-1";
    }
}

package com.geeksforgeeks.basic.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedCharacter {

    static String firstRepChar(String s)
    {
        Map<Character, Integer> charMap = new HashMap<>();
        boolean duplicateFound = false;
        String str = "";
        int i = 0;
        for( ; i < s.length(); i++ ){
            if(!charMap.containsKey(s.charAt(i))){
                charMap.put(s.charAt(i), 1);
            } else {
                charMap.put(s.charAt(i), (charMap.get(s.charAt(i)) + 1));
                duplicateFound = true;
                break;
            }
        }
        if(duplicateFound) {
            return str + s.charAt(i);
        }
        return "-1";
    }

    public static void main(String[] args){
        String str = "apipothi";
        System.out.println(firstRepChar(str));
    }
}

package com.coding.strings;

import java.util.StringTokenizer;

public class ConvertArrayOfCharsToString {
    //Using String Class
    public String returnStringUsingStringClass(char [] chars){
        String str = new String(chars);
        return str;
    }

    public String returnStringUsingStringBuilder(char [] chars){
        //Using StringBuilder Class
        StringBuilder str = new StringBuilder();
        for(char c :  chars){
            str.append(c);
        }
        return str.toString();
    }

    public String returnStringUsingCopyValueOfMethodOfStringClass(char [] chars){
        //Using copyValueOf method of String class
        String str = new String();
        str = String.copyValueOf(chars);
        return str;
    }

    public static void main(String args[]){
        char[] chars = {'R','o','h','i','t',' ','K','a','t','t','a'};
        ConvertArrayOfCharsToString obj = new ConvertArrayOfCharsToString();
        System.out.println(obj.returnStringUsingStringClass(chars));
        System.out.println(obj.returnStringUsingStringBuilder(chars));
        System.out.println(obj.returnStringUsingCopyValueOfMethodOfStringClass(chars));
    }
}

package com.geeksforgeeks.basic.strings;

public class SubstringIndex {

    static int strstr(String s, String x)
    {
//        if(x.length()<2){
//            return -1;
//        }
        int startIndex = -1;
        boolean substringFound = false;
        for(int i = 0; i <= s.length() - x.length() ; i++){
            int j = 0;
            int k = i;
            while(j < x.length()){
                if(s.charAt(k)!=x.charAt(j)){
                    substringFound=false;
                    break;
                }else {
                    startIndex = i;
                    j++;
                    k++;
                }
                substringFound=true;
            }
            if(substringFound){
                break;
            }
        }
        if(substringFound) {
            return startIndex;
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(strstr("z","z"));
    }
}

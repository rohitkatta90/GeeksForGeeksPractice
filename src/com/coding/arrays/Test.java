package com.coding.arrays;

import javax.print.DocFlavor;
import java.util.*;

public class Test {

    public static void main(String args[]){
        String s = "abc";
        int nums[] = {1,2};
        String a = "aab";
        String b = "xyz";
        int c = 1;
        //int nums[] = {8,3,5,7};
        int index[] = {1,2};
        int k = 1;
        //int accounts[][] = {{1,5},{7,3},{3,5}};
       //createTargetArray(nums, index);
        int arr[] = {14, 7, 14, 6, 1, 11, 3, 16, 16, 8, 7, 4, 11, 15, 17, 6, 1, 13};
        int n = 18;
//        String[] sentences = {"pe wq","n","q","q","b","b","a","sw ww eeee rr","v","t","l","w","r","k","d","u","g","l","a","d","w","q","d","r","y","d","l","w","z","n","v","y","z","h","n","e","f","o","q","c","r","c","f","b","r","n","t","n","t","w","r","i","n","q","l","y","n","b","b","h","q","a","d","r","b","j","x","x","s","z","b","l","m","o","l","k","n","w","i","y","v","m","d","z","c","w","g","q","n","o","e","w","v","o","e","j","i","a","v","i"};


    }

    public static int mostWordsFound(String[] sentences) {
        if(sentences.length == 1){
            return sentences[0].split(" ").length;
        }
        int maxWordsString = sentences[0].split(" ").length;
        for(int i = 0 ; i < sentences.length ; i++){
            String sentence = sentences[i];
            if (sentence.contains(" ")){
                String[] words = sentence.split(" ");
                if(words.length > maxWordsString){
                    maxWordsString = words.length;
                }
            }
        }
        return maxWordsString;
    }


//    public static void main(String[] args) {
//        // 1. initialize
//        List<Integer> v0 = new ArrayList<>();
//        List<Integer> v1;                           // v1 == null
//        // 2. cast an array to a vector
//        Integer[] a = {0, 1, 2, 3, 4};
//        v1 = new ArrayList<>(Arrays.asList(a));
//        // 3. make a copy
//        List<Integer> v2 = v1;                      // another reference to v1
//        List<Integer> v3 = new ArrayList<>(v1);     // make an actual copy of v1
//        // 3. get length
//        System.out.println("The size of v1 is: " + v1.size());
//        // 4. access element
//        System.out.println("The first element in v1 is: " + v1.get(0));
//        // 5. iterate the vector
//        System.out.print("[Version 1] The contents of v1 are:");
//        for (int i = 0; i < v1.size(); ++i) {
//            System.out.print(" " + v1.get(i));
//        }
//        System.out.println();
//        System.out.print("[Version 2] The contents of v1 are:");
//        for (int item : v1) {
//            System.out.print(" " + item);
//        }
//        System.out.println();
//        // 6. modify element
//        v2.set(0, 5);       // modify v2 will actually modify v1
//        System.out.println("The first element in v1 is: " + v1.get(0));
//        v3.set(0, -1);
//        System.out.println("The first element in v1 is: " + v1.get(0));
//        // 7. sort
//        Collections.sort(v1);
//        // 8. add new element at the end of the vector
//        v1.add(-1);
//        v1.add(1, 6);
//        // 9. delete the last element
//        v1.remove(v1.size() - 1);
//    }
//
//
//    public static int sumOddLengthSubarrays(int[] arr) {
//        int count = 0 ;
//        int sum = 0;
//
//        int length = arr.length;
//
////        for(int i = 0 ; i < arr.length ; i++){
////            sum = sum + arr[i];
////        }
//
//        while(length >= 1){
//            for(int i = 0 ; i < length ; i++){
//                for(int j = 0 ; j < length ; j++) {
//                    sum = sum + arr[j];
//                }
//                length = length - 2;
//            }
//
//        }
//
//
//        return sum;
//    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target_array = new int[nums.length];
        for(int i = 0 ; i < target_array.length ; i++){
            target_array[i] = -1;
        }

        for(int i = 0 ; i < nums.length ; i++){
            int new_index = index[i];
            int new_num = nums[new_index];
            if(target_array[i] < 0){
                target_array[i] = nums[new_num];
            }else {
                while (target_array[i + 1] == -1 && i < target_array.length) {
                    target_array[i + 1] = i;
                    i++;
                }
            }

        }
        for(int x : target_array) {
            System.out.print(x+" ");
        }
        return target_array;
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < indices.length ; i++){
            sb.append(s.charAt(indices[i]));
        }
        return sb.toString();
    }
}

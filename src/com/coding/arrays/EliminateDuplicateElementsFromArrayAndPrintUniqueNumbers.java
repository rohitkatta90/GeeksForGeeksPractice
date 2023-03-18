package com.coding.arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EliminateDuplicateElementsFromArrayAndPrintUniqueNumbers {

    public static void main(String args[]){
        //int arr[] = {4,5,5,5,4,6,6,9,4,8};
        int arr[] = {-1,-1,-1,-1};
        //String arr1[] = {"Rohit","Rani","Kiara","Rohit","Kiara","Jay", "Jay"};
        String arr1[] = {" ", " "};

        eliminateDuplicates(arr);
        System.out.println();
        eliminateDuplicates1(arr1);
    }

    private static void eliminateDuplicates(int[] arr) {
        //Set<Integer> ts = new TreeSet<>(); // TreeSet is the sorted Set without any duplicates
        if(arr.length == 0){
            System.out.println("Array is empty");
        } else {
            Set<Integer> ts = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                ts.add(arr[i]);
            }
            for (Integer x : ts) {
                System.out.print(x + " ");
            }
        }
    }

    private static void eliminateDuplicates1(String[] arr1) {
        if(arr1.length == 0){
            System.out.println("Array is empty");
        } else {
            Set<String> st = new HashSet<>();
            for (int i = 0; i < arr1.length; i++) {
                st.add(arr1[i]);
            }
            for (String x : st) {
                System.out.print(x + " ");
            }
        }
    }
}

package com.coding.arrays;

import java.util.Arrays;

public class MergeTwoArraysAndPrintInSortedWay {
    public static void main(String args[]){
        int arr1[] = {4,2,7};
        int arr2[] = {5,1,1};
        int[] mergedArray = mergeTwoArraysAndPrintInSortedOrder(arr1, arr2);
        for(int x : mergedArray){
            System.out.print(x+ " ");
        }

    }

    private static int[] mergeTwoArraysAndPrintInSortedOrder(int[] arr1, int[] arr2) {
        int lengthOfMergedArray = arr1.length + arr2.length;
        int[] arr3 = new int[lengthOfMergedArray];
        int count = 0;
        for(int i = 0 ; i < arr1.length; i++ ){
           arr3[count] = arr1[i];
           count++;
        }
        for(int i = 0 ; i < arr2.length; i++ ){
            arr3[count] = arr2[i];
            count++;
        }
        Arrays.sort(arr3);
        return arr3;
    }
}

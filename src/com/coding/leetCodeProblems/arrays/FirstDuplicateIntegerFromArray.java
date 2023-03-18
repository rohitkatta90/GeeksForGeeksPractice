package com.coding.leetCodeProblems.arrays;

/*
Explained by Nick White on the youtube channel.
Reference link : https://www.youtube.com/watch?v=XSdr_O-XVRQ

Important points:
1. The values in the array should be between 1 and the length of the array inclusive.
[0,12,15,6,3] - This is invalid since it has values 12, 15 and 6 which are greater than the length of the array.
[1,2,3,4] - This is valid
[1,2,1,3,5] - This is valid

Objective is to find the first duplicate number from the integer array.
If there are no duplicates then return -1

Important point: Note as to why the numbers in the array are between 1 and the lenght of the array. So thinking about this, we can
go with one more apporach with in-place solution i.e. not using extra space as well.


 */

import java.util.HashSet;

public class FirstDuplicateIntegerFromArray {

    public static void main(String args[]){

        int[] arr = {2,1,3,5,3,2};
        int number1 = bruteForce(arr);
        int number2 = hastSet(arr);
        int number3 = optimalSolutionWithoutExtraSpace(arr);
        System.out.println("The first duplicate number is: "+number1);
        System.out.println("The first duplicate number is: "+number2);
        System.out.println("The first duplicate number is: "+number3);

    }

    private static int optimalSolutionWithoutExtraSpace(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i]) - 1] < 0) {
                return Math.abs(arr[i]);
            } else {
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            }

        }
        return -1;
    }

    private static int hastSet(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < arr.length ; i++){
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
            }else{
                return arr[i];
            }
        }
        return -1;
    }

    private static int bruteForce(int[] arr) {
        int min_index_of_duplicate = arr.length;
        for(int i = 0; i < arr.length ; i++){
            for(int j = i+1; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    min_index_of_duplicate = Math.min(min_index_of_duplicate,j);
                }
            }
        }
        if(min_index_of_duplicate == arr.length)return -1;
        else{
            return arr[min_index_of_duplicate];
        }
    }
}

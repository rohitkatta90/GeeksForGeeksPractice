package com.coding.leetCodeProblems.arrays;

import java.util.Arrays;

/*
Problem: We take input as the sorted array and then print the square of each number in the sorted array.

Reference explanation: https://www.youtube.com/watch?v=4eWKHLSRHPY&list=PLU_sdQYzUj2mE8quVfDEGnupdS7XuU2YW&index=8
 */
public class SortedSquaredArray {

    public static void main(String[] args){
        int[] arr = {-6, -4, -1, 3, 4, 5 };

        int[] result1=optimizedSolution(arr);
        //int[] result1=bruteForceWay(arr);
        for(int i=0;i<result1.length;i++){
            System.out.print(result1[i]+" ");
        }
    }

    private static int[] bruteForceWay(int[] arr) {
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr); // time complexity in sorting is O(NlogN). As compared to optimal solution, this is slow.
        return arr;
    }

    private static int[] optimizedSolution(int[] arr) {

        int left=0;
        int right = arr.length-1;
        int[] result =  new int[arr.length];

        for(int i = arr.length-1 ; i >= 0; i--){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                result[i] = Math.abs(arr[left] * arr[left]);
                left++;
            }else{
                result[i] = Math.abs(arr[right] * arr[right]);
                right--;
            }
        }
        return result;
    }


}

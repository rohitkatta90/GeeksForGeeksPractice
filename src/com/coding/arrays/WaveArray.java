package com.coding.arrays;

/*
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it
In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

Example 1:

Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after
sorting it in wave form are
2 1 4 3 5.
Example 2:

Input:
n = 6
arr[] = {2,4,7,8,9,10}
Output: 4 2 8 7 10 9
Explanation: Array elements after
sorting it in wave form are
4 2 8 7 10 9.

Youtube link for explanation: https://www.youtube.com/watch?v=8oR5OBW5buk&t=229s
 */

import java.util.Arrays;

public class WaveArray {

        // A utility method to swap two numbers.
        void swap(int arr[], int a, int b)
        {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }


        // This function sorts arr[0..n-1] in wave form, i.e.,
        // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]....
        void sortInWave(int arr[], int n){
            // Traverse all even elements
            for (int i = 0; i < n; i+=2)
            {
                // If current even element is smaller
                // than previous
                if (i>0 && arr[i] < arr[i-1] )
                    swap(arr, i-1, i);

                // If current even element is smaller
                // than next
                if (i<n-1 && arr[i] < arr[i+1] )
                    swap(arr, i, i + 1);
            }
        }

        // Driver program to test above function
        public static void main(String args[]){
            WaveArray ob = new WaveArray();
            int arr[] = {10, 90, 49, 2, 1, 5, 23};
            //Arrays.sort(arr);
            //int arr[] = {2,4,7,8,9,10};
            int n = arr.length;
            ob.sortInWave(arr, n);
            for (int i : arr)
                System.out.print(i+" ");
        }



}

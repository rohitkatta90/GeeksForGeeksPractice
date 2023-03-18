package com.geeksforgeeks.basic;

/*
Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.

Example 1:

Input:
N = 5
arr[] = {1 2 3 4 5}
K = 4
Output: 3
Explanation: 4 appears at index 3.

Example 2:

Input:
N = 5
arr[] = {11 22 33 44 55}
K = 445
Output: -1
Explanation: 445 is not present.
 */
public class BinarySearch {

    static int N = 59;
    static int arr[] = {1,2,3,4,5,6,8,9,10,14,16,19,22,23,25,26,27,29,31,34,35,36,38,39,40,45,46,48,50,51,52,57,59,60,61,63,67,68,69,71,75,76,77,79,81,82,83,86,87,88,90,92,93,94,95,96,98,99,100};
    static int K = 93;

    public static void main(String args[]){
        System.out.println(binarysearchtest(arr, N, K));
    }
    static int binarysearchtest(int arr[], int n, int k) {
        if(n == 0){
            return -1;
        }
        int left = 0;
        int right = n - 1;
        while (left < right){
            int midpoint = left + (right - left) / 2 ;
            if(arr[midpoint] == k){
                return midpoint;
            }else if (arr[midpoint] < k){
                left = midpoint + 1;
            }else if(arr[midpoint] > k){
                right = midpoint - 1;
            }
        }
        return -1;
    }
}

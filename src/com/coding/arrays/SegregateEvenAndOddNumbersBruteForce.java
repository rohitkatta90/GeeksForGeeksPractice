package com.coding.arrays;


/*
Brute-Force Solution

As we need to maintain the order of elements then this can be done in the following steps :

Create a temporary array A of size n and an integer ind which will keep the index of elements inserted .
Initialize ind with zero and iterate over the original array and if even number is found then put that number at A[ind] and then increment the value of ind .
Again iterate over array and if an odd number is found then put it in A[ind] and then increment the value of ind.
Iterate over the temporary array A and copy its values in the original array.

Time complexity: O(n)
Auxiliary space: O(n)
 */


public class SegregateEvenAndOddNumbersBruteForce {

    public static void main(String args[]){

        int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
        int n = arr.length;

        // Function call
        arrayEvenAndOdd(arr, n);
    }

    private static void arrayEvenAndOdd(int[] arr, int n) {

        int arr1[] = new int[n];
        int count=0;
        for(int i = 0; i < n ; i++){
            if(arr[i] % 2 == 0){
                arr1[count++] = arr[i];
            }
        }
        for(int i = 0; i < n ; i++){
            if(arr[i] % 2 != 0){
                arr1[count++] = arr[i];
            }
        }

        for(int x : arr1){
            System.out.print(x+" ");
        }

    }
}

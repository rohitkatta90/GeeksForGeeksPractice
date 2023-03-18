package com.coding.arrays;


/*
Efficient Approach:

The optimization for above approach is based on Lomuto’s Partition Scheme

Maintain a pointer to the position before first odd element in the array.
Traverse the array and if even number is encountered then swap it with the first odd element.
Continue the traversal.

 */


public class SegregateEvenAndOddNumbersOptimizedWay {

    public static void main(String args[]){

        int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
        int n = arr.length;

        // Function call
        arrayEvenAndOdd(arr, n);
    }

    private static void arrayEvenAndOdd(int[] arr, int n) {

        int i=-1;
        int j=0;
        while(j != n){
            if(arr[j] % 2 == 0) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        for(int x : arr){
            System.out.print(x+" ");
        }

    }
}

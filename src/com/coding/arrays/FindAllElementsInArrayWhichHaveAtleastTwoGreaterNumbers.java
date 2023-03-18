package com.coding.arrays;

/*
Given an array of n distinct elements, the task is to find all elements in array which have at-least two greater elements than themselves.

Examples :
Input : arr[] = {2, 8, 7, 1, 5};
Output : 2  1  5
Explanation:
The output three elements have two or more greater elements

Explanation:
Input  : arr[] = {7, -2, 3, 4, 9, -1};
Output : -2  3  4 -1

Method 1 (Simple)
The naive approach is to run two loops and check one by one element of array check that array elements have
at-least two elements greater than itself or not. If it’s true then print array element.

Method 2 (Use Sorting)
We sort the array first in increasing order, then we print first n-2 elements where n is size of array.

Method 3 (Efficient)
In the second method we simply calculate the second maximum element of the array and print all element
which is less than or equal to the second maximum.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindAllElementsInArrayWhichHaveAtleastTwoGreaterNumbers {

    public static void main(String args[]){
        int arr[] = {7, -2, 3, 4, 9, -1};
        System.out.println("The naive brute force way is: ");
        bruteforceWay(arr);
        System.out.println("\nApproach 2 of sorting the numbers and then priting all the numbers until length-2 of the array: ");
        sortingAndThenPrinting(arr);
        System.out.println("\nApproach 3 : Finding the second largest element and then priting all elements of the array less than that element: ");
        efficientApproach(arr);
    }

    private static void efficientApproach(int[] arr) {
        int firstLargest = 0;
        int secondLargest = 0;
        for(int i =0 ; i < arr.length ; i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }else if(arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        for(int i =0 ; i < arr.length ; i++){
            if(arr[i] < secondLargest)
            System.out.print(arr[i]+ " ");
        }
    }

    private static void sortingAndThenPrinting(int[] arr) {
        Arrays.sort(arr);
        for(int i =0 ; i < arr.length - 2 ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void bruteforceWay(int[] arr) {

        int count = 0;
        for(int i =0 ; i < arr.length ; i++){
            for(int j =0 ; j < arr.length ; j++){
                if(arr[i] < arr[j]){
                    count++;
                    if(count >= 2){
                        System.out.print(arr[i] + " ");
                        break;
                    }
                }else{
                    count=0;
                }
            }
        }
    }

}

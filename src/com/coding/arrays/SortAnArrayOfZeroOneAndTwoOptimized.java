package com.coding.arrays;

/*
youtube video : https://www.youtube.com/watch?v=oaVa-9wmpns
 */

public class SortAnArrayOfZeroOneAndTwoOptimized {

    public static void sortNos(int arr[]){

        //We will be using the Dutch national flag alogrithm. So accorrding to that we will have to have 3 pointers.
        int low = 0, mid = 0;
        int high = arr.length - 1;
        int temp;

        while(mid <= high){
            if(arr[mid] == 0){
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {0,0,0,1,1,0,0,1,2,1,2,2};
        SortAnArrayOfZeroOneAndTwoOptimized.sortNos(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}

package com.coding.arrays;

/*

Link: https://www.geeksforgeeks.org/array-data-structure/

Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements.
 Note: Since which side to rotate is not given, lets rotate it from left to right.
 */

public class ProgramForArrayRotation {

    //Approach-1
    public void usingTemporaryArray(int[] array, int d, int size){
        int temp[] = new int[d];
        for(int i=0;i<d;i++){
            temp[i]=array[i];
        }
        int j=0;
        for(;j<size-d;j++){
            array[j]=array[j+d];
        }
        for(int i=0;i<d;i++){
            array[j]=temp[i];
            j++;
        }

    }

    public static void main(String args[]){
        int array[]={1, 2, 3, 4, 5, 6, 7,8,9};
        int d = 6, n=9;
        System.out.println("Array before rotating is: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+ " ");
        }
        ProgramForArrayRotation obj = new ProgramForArrayRotation();
        obj.usingTemporaryArray(array,d,n);
        System.out.println("\nArray after rotating is: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+ " ");
        }
    }
}


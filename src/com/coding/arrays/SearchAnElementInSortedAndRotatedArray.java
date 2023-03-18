package com.coding.arrays;
import java.util.Scanner;

/*
https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/

Pre requisite : Binary search concept is needed to be known.
 */

public class SearchAnElementInSortedAndRotatedArray {

    //This is the brute force way :)
    public static void main(String args[]){
        System.out.println("Please enter the key to be searched: ");
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();

        int array[]={1, 2, 3, 4, 5, 6, 7,8,9};
        int d = 3, n=9;
        System.out.println("Array before rotating is: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+ " ");
        }
        SearchAnElementInSortedAndRotatedArray obj = new SearchAnElementInSortedAndRotatedArray();
        obj.usingTemporaryArray(array,d,n);
        System.out.println("\nArray after rotating is: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        searchElementInSortedArray(array,n,key);
    }

    private static void searchElementInSortedArray(int[] array, int size,int key) {

        boolean keyFound=false;
        int i;
        for(i=0;i<size;i++){
            if(array[i]==key){
                keyFound=true;
                break;
            }
        }
        if(keyFound==true){
            System.out.println("The key is found at "+"index "+i);
        }else{
            System.out.println("The key is not found");
        }
    }

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
}

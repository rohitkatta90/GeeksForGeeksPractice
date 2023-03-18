package com.coding.arrays;

public class CountZeros {

    int countZeroes(int arr[], int n) {
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }

        }
        return count;
    }
    public static void main(String args[]){
        int [] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        int size = arr.length;
        CountZeros cz = new CountZeros();
        System.out.println(cz.countZeroes(arr,size));
    }
}

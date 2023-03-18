package com.coding.arrays;

public class Segregate0sAnd1s {
    public static void main(String args[]){
        int [] arr = {0,0,1,0,1};
        Segregate0sAnd1s obj = new Segregate0sAnd1s();
        obj.segregate0and1(arr,arr.length);
    }
    void segregate0and1(int[] arr, int n) {
        int temp=0;
       for(int i=0;i<n;i++){
           if(arr[i]==0){
               temp++;
           }
       }
        for(int i=0;i<temp;i++){
            arr[i]=0;
        }
        for(int i=temp;i<n;i++){
            arr[i]=1;
        }
        for(int x : arr){
            System.out.println(x+ " ");
        }
    }
}

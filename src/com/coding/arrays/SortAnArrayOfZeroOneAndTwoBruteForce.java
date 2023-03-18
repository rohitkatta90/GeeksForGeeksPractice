package com.coding.arrays;

public class SortAnArrayOfZeroOneAndTwoBruteForce {

    public static void sort012(int a[], int n)
    {
       int zeroCount=0;
       int oneCount=0;
       int twoCount=0;
       for(int i=0;i<n;i++){
           if(a[i]==0){
               zeroCount=zeroCount+1;
           }else if(a[i]==1){
               oneCount=oneCount+1;
           }
       }
       twoCount = n-(zeroCount+oneCount);
        for(int i=0;i<zeroCount;i++){
            a[i]=0;
        }
        for(int i=zeroCount;i<(oneCount+zeroCount);i++){
            a[i]=1;
        }
        for(int i=(zeroCount+oneCount);i<n;i++){
            a[i]=2;
        }
        for(int x : a){
            System.out.print(x+" ");
        }
    }

    public static void main(String args[]){
        int a[] = {0,2,1,2,0};
       /*
       //Method 1 - Simply using the sort method.
       Arrays.sort(a);
        for(int x : a){
            System.out.println(x);
        }*/
        int length = a.length;
        SortAnArrayOfZeroOneAndTwoBruteForce.sort012(a,length);

    }

}

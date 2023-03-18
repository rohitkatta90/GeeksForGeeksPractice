package com.coding.arrays;

public class DiplayMaximumCountOfZeroAndOneInBinaryArray {

    public static int maxConsecutiveOne(int A[]){
        int maxCountOfOne=0;
        int count = 0;

        for(int i=0;i<A.length;i++){
            if(A[i]==1){
                count++;
                maxCountOfOne=Math.max(count,maxCountOfOne);
            }else{
                count=0;
            }
        }
        return maxCountOfOne;
    }
    public static int maxConsecutiveZero(int A[]){
        int maxCountOfZero=0;
        int count = 0;

        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                count++;
                maxCountOfZero=Math.max(count,maxCountOfZero);
            }else{
                count=0;
            }
        }
        return maxCountOfZero;
    }

    public static void main(String args[]){
        int A[] = {1,1,0,1,1,1,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println("Maximum count of 1 is: "+maxConsecutiveOne(A));
        System.out.println("Maximum count of 0 is: "+maxConsecutiveZero(A));

    }
}

package com.coding.leetCodeProblems.arrays;


/*
LEETCODE

628. Maximum Product of Three Numbers

 */
public class PrintMaximumSumOfThreeNumbersInIntegerArray {

    public static void main(String args[]){
        //int nums[] = {1,2,3};
        //int nums[] = {1,2,3,4};
        int nums[] = {-1,-2,-3};
        System.out.print(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {

        int maxProduct = 0;
        if(nums.length == 3){
            return nums[0]*nums[1]*nums[2];
        }

        else{

            for(int i = 0; i < nums.length ; i++){

                for(int j = i+1; j < nums.length-1 ; j++){

                    int currentMaxProduct = nums[i]*nums[j]*nums[j+1];

                    if(maxProduct < currentMaxProduct){

                        maxProduct = currentMaxProduct;
                    }
                }
            }
            return maxProduct;
        }
    }
}

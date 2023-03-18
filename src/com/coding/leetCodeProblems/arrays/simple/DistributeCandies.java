package com.coding.leetCodeProblems.arrays.simple;

/*
575. Distribute Candies
 */

class Solution {

    public static void main(String args[]){
        int[] candyType = {1,1,2,2,3,3};
        //int[] candyType = {1,1,2,3};
        //int[] candyType = {6,6,6,6};

        System.out.println(distributeCandies(candyType));
    }
    public static int distributeCandies(int[] candyType) {

        int countDistinctValues = 1;
        for(int i = 0; i < candyType.length ; i++){
            for(int j = i+1; j < candyType.length ; j++){
                    if(candyType[i]!=candyType[j]){
                        countDistinctValues++;
                    }
            }
        }
        return countDistinctValues/2;
    }
}
package com.coding.leetCodeProblems.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> complements = new HashMap<>();
        for(int i = 0; i < nums.length; i++ ){
            Integer complementIndex = complements.get(nums[i]);
            if(complementIndex != null){
                return new int[]{i,complementIndex};
            }
            else{
                complements.put(target - nums[i],i);
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int nums[] = {2,7,11,15};
        int target = 9;
        //System.out.println(twoSum());
    }
}

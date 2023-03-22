package com.geeksforgeeks.basic;


/*

You are given an array arr  of length N of 0's and 1's. Find the total number of subarrays of 0's

Example 1:

Input:
N = 4
arr[] = {0, 0, 1, 0}
Output:
4
Explanation:
Following are the subarrays of
length 1: {0}, {0}, {0} - 3
length 2: {0, 0} - 1
Total Subarrays: 3 + 1 = 4
Example 2:

Input:
N = 4
arr[] = {0, 0, 0, 0}
Output:
10
Explanation:
Following are the subarrays of
length 1: {0}, {0}, {0}, {0} - 4
length 2: {0, 0}, {0, 0}, {0, 0} - 3
length 3: {0, 0, 0}, {0, 0, 0} - 2
length 4: {0, 0, 0, 0} - 1
Total Subarrays: 4 + 3 + 2 + 1 = 10
 */
public class NumberOfSubarraysOfZeros {
    public static void main(String args[]) {
        int N = 4;
        int arr[] = {0, 0, 0, 0};
        System.out.println(no_of_subarrays(N, arr));
    }

    static long no_of_subarrays(int N, int[] arr) {
        long sub_array_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                sub_array_count = sub_array_count + 1;
                int j = i + 1;
                for (; j < arr.length; j++) {
                    if (arr[j] == 0) {
                        sub_array_count = sub_array_count + 1;
                    } else {
                        break;
                    }
                }
            }
        }
        return sub_array_count;
    }
    
    //Optimized approach
    static long no_of_subarrays_optimized(int[] arr) {
        long sub_array_count = 0;
        long cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                if(cnt>0){
                    sub_array_count = calculateIntermediateCount(sub_array_count,cnt);
                    cnt = 0;
                }
            }else{
                cnt++;
            }
        }
        
        if(cnt>0){
            sub_array_count = calculateIntermediateCount(sub_array_count,cnt);
        }
        return sub_array_count;
    } 
    
    private static long calculateIntermediateCount(long sub_array_count,long cnt){
        long tmp = cnt/2;
        if(cnt%2==0){
            sub_array_count += ((cnt*(tmp+1))-tmp);
        }else{
            sub_array_count += cnt*(tmp+1);
        }
        return sub_array_count;
    }    

}

package com.geeksforgeeks.basic;

public class FindTripletsWithZeroSum {

    public static boolean findTriplets(int arr[], int n) {
        int count = 0;
        if (n <= 2) {
            return false;
        } else {
            for (int i = 0; i < n-2; i++) {
                for (int j = i + 1; j < n-1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        count++;
                        if ((arr[i] + arr[j] + arr[k]) == 0) {
                            System.out.println("Count is : " + count);
                            return true;
                        }
                    }
                }

            }
            System.out.println("Count is : " + count);
            return false;
        }
    }

    public static void main(String[] args) {

        int arr[] = {0, -1, 2, -3, 9};
        int n = 5;
//        int arr[] = {1, 2, 3};
//        int n = 3;
//        int arr[] = {97, -27, 2, -34, 61, -39};
//        int n = 6;

        System.out.println(findTriplets(arr, n));
    }
}

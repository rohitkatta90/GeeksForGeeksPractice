package com.coding.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarrayinUnsortedArrayForGivenSum {
     public static void main(String[] args) {
            int[] A = {1,2,3,4,5,6,7,8,9,10};
            int S = 15;

            int[] result = findSubArray(A, S);
            System.out.println("Left index: " + result[0] + ", Right index: " + result[1]);
        }

        public static int[] findSubArray(int[] A, int S) {
            int n = A.length;
            int sum = 0;
            int start = 0;
            int[] result = {-1, -1};
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                sum += A[i];
                if (sum == S) {
                    result[0] = 1;
                    result[1] = i + 1;
                    return result;
                }
                if (map.containsKey(sum - S)) {
                    result[0] = map.get(sum - S) + 2;
                    result[1] = i + 1;
                    return result;
                }
                map.put(sum, i);
                if (sum > S) {
                    while (sum > S) {
                        sum -= A[start];
                        start++;
                    }
                    if (sum == S) {
                        result[0] = start + 1;
                        result[1] = i + 1;
                        return result;
                    }
                }
            }

            return result;
        }

}

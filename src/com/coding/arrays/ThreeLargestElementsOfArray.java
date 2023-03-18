package com.coding.arrays;

/*
1) Initialize the largest three elements as minus infinite.
    first = second = third = -∞

2) Iterate through all elements of array.
   a) Let current array element be x.
   b) If (x > first)
      {
          // This order of assignment is important
          third = second
          second = first
          first = x
       }
   c)  Else if (x > second)
      {
          third = second
          second = x
      }
   d)  Else if (x > third)
      {
          third = x
      }

3) Print first, second and third.
 */

public class ThreeLargestElementsOfArray {

    public static void main(String argsp[]) {
        int arr[] = {7, -2, 3, 4, 9, -1};
        int firstLargest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }else if (arr[i] > thirdLargest) {
                thirdLargest =  arr[i];
            }
        }
        System.out.println(firstLargest+" "+ secondLargest+" "+thirdLargest);
    }
}

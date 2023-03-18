package com.coding.arrays;

public class DeleteAnElementFromGivenIndex {

    public static void main(String args[]) {
        int A[] = new int[10];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;
        A[6] = 7;
        A[7] = 8;
        A[8] = 9;
        A[9] = 10;

        int index = 5;

        System.out.print("Elements in array before removing any element: \n");
        for (int x : A) {
            System.out.print(x + ", ");
        }
        System.out.println("\n");

        System.out.print("Elements in array after removing any element: \n");

        if (index == A.length - 1) {
            A[index] = 0;
        }
        for (int i = index; i < A.length - 1; i++) {
            A[i] = A[i + 1];
        }
        A[A.length - 1] = 0;
        for (int x : A) {
            System.out.print(x + ", ");
        }

    }
}

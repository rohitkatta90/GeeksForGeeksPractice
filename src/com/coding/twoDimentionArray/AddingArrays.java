package com.coding.twoDimentionArray;

public class AddingArrays {
    public static void main(String args[]){
        int A[] [] = new int[3][3];
        int B[] [] = new int[3][3];
        A[0][0] = 1;
        A[0][1] = 2;
        A[0][2] = 3;
        A[1][0] = 1;
        A[1][1] = 2;
        A[1][2] = 3;
        A[2][0] = 1;
        A[2][1] = 2;
        A[2][2] = 3;
//        B[0][0] = 3;
//        B[0][1] = 2;
//        B[0][2] = 1;
//        B[1][0] = 3;
//        B[1][1] = 2;
//        B[1][2] = 1;
//        B[2][0] = 3;
//        B[2][1] = 2;
//        B[2][2] = 1;
        B[0][0] = 1;
        B[0][1] = 2;
        B[0][2] = 3;
        B[1][0] = 1;
        B[1][1] = 2;
        B[1][2] = 3;
        B[2][0] = 1;
        B[2][1] = 2;
        B[2][2] = 3;

        //System.out.println(A.length);
        addArrays(A,B);
    }

    public static void addArrays(int A[][], int B[][]){
        int C[][] = new int[3][3];

        for ( int i = 0 ;  i < 3 ; i++){
            for ( int j = 0 ;  j < 3 ; j++){

                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}

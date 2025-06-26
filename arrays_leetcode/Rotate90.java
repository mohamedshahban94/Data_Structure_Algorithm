package arrays_leetcode;

import java.util.Arrays;

public class Rotate90 {

    static void bruteforceRotate90(int[][] arr) {

        int[][] res = new int[arr.length][arr.length];

        // Step 1: take dummy matrix
        // Step 2: take 1 row elements to shift into last column of dummy matrix

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {

                res[count++][arr.length - i - 1] = arr[i][j];
                // if(i==0){
                // res[count++][arr.length-1]= arr[i][j];
                // }
                // else if(i==1){
                // res[count++][1] =arr[i][j];
                // }
                // else{
                // res[count++][0] = arr[i][j];
                // }
            }
        }
        printmatrix(res);
    }

    static void optimalRotate90(int[][] arr) {
        // transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printmatrix(arr);
        // reversE an row
        for (int i = 0; i < arr.length; i++) {
            // for(int j=0;j<arr.length;j++){

            // }
            int k = 0;
            int j = arr[i].length - 1;
            while (k < j) {
                int temp = arr[i][k];
                arr[i][k] = arr[i][j];
                arr[i][j] = temp;
                k++;
                j--;
            }
        }
        printmatrix(arr);
    }

    public static void main(String[] args) {
        // int arr[][] = { { 1, 2, 3, 0 }, { 4, 5, 6, 0 }, { 7, 8, 9, 0 }, { 10, 11,
        // 12,0 } };
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        printmatrix(arr);
        // bruteforceRotate90(arr);

        // optimalRotate90(arr);

        optimal_GFG_Rotate90(arr);
    }

    static void optimal_GFG_Rotate90(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printmatrix(arr);
        int n = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[n][j];
                arr[n][j] = temp;

            }
            n++;
        }
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {
        // int temp = arr[i][j];
        // arr[i][j] = arr[arr.length-1 - j][i];
        // arr[arr.length-1 - j][i] = temp;
        // }
        // }
        printmatrix(arr);
    }

    static void printmatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                // System.out.print(arr[i][j] + " - " + i + " " + j + "|");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
    }
}
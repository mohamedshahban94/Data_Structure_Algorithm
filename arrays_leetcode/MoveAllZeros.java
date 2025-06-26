package arrays_leetcode;

import java.util.Arrays;

public class MoveAllZeros {

    // Optimal Solution
    static void pushZerosToEnd(int[] arr) {
        // code here
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[ind++] = arr[i];
            }
        }
        for (int j = ind; j < arr.length; j++) {
            arr[j] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Sir's Logic
    static void sirLogic(int[] arr) {
        int count = 0;
        while (true) {
            if (arr[0] == 0) {
                for (int i = 1; i < arr.length; i++) {
                    arr[i - 1] = arr[i];
                }
                count++;
            } else {
                break;
            }
        }
        int ind = arr.length - 1;
        for (int i = 1; i <= count; i++) {
            arr[ind--] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        // int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
        // pushZerosToEnd(arr);
        int arr[] = { 0, 0, 0, 1, 2, 3, 5 };
        sirLogic(arr);
    }
}

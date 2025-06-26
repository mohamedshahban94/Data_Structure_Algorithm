package search;

import java.util.Arrays;

public class RecursionBinary {

    static int binarySearch(int[] arr, int val, int start, int end) {
        // int foundval = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == val) {
                System.out.println("Found : " + arr[mid]);
                // foundval = arr[mid];
                return arr[mid];
            } else if (val > arr[mid]) {
                // start = mid + 1;
                binarySearch(arr, val, mid + 1, end);
            } else if (val < arr[mid]) {
                // end = mid - 1;
                binarySearch(arr, val, start, mid - 1);
            }
        }
        // return foundval == 0 ? -1 : foundval;
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7, 8, 9, 11 };
        int val = 1;
        int start = 0;
        int end = arr.length - 1;
        int search = binarySearch(arr, val, start, end);
        System.out.println(search);
    }
}

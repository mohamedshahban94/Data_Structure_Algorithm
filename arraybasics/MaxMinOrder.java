package arraybasics;

import java.util.Arrays;

public class MaxMinOrder {

    static void maxMinOrder(int[] arr) {
        int res[] = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;
        int ind = 0;
        while (i < j) {
            res[ind++] = arr[j--];
            res[ind++] = arr[i++];
        }
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 3, 4, 4, 5 };
        // 10, 20, 30, 40, 50, 60, 22, 11
        // 3, 4, 2, 5, 6, 1
        int sortedArr[] = sortarr(arr);
        // maxMinOrder(sortedArr);
        maxMinOrder(arr);;
    }

    static int findminimum(int arr[], int start) {
        int ind = -1;
        int fmin = Integer.MAX_VALUE;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] < fmin) {
                fmin = arr[i];
            }
            if (fmin == arr[i]) {
                ind = i;
            }
        }
        return ind;
    }

    static int[] sortarr(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            int ind = findminimum(arr, j);
            int temp = arr[j];
            arr[j] = arr[ind];
            arr[ind] = temp;
        }
        return arr;
        // System.out.println(Arrays.toString(arr));
    }

}

package learnbytest;

import java.util.Arrays;

public class Tryquicksort {

    static void quicksort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }
        int pivot_ind = partition(arr, low, high);
        quicksort(arr, low, pivot_ind - 1);
        quicksort(arr, pivot_ind + 1, high);

    }

    static int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int val = arr[low];
        while (i < j) {
            while (arr[i] <= val && i <= high - 1) {
                i++;
            }
            while (arr[j] > val && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[low] = arr[j];
        arr[j] = val;
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 5, 4, 1, 9, 3, 0, 2 };

        System.out.println(Arrays.toString(arr));
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

}
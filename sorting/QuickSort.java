package sorting;

import java.util.Arrays;

public class QuickSort {

    static int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pi = arr[low];
        while (i < j) {
            while (arr[i] <= pi && i <= high - 1) {
                i++;
            }
            while (arr[j] > pi && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pi;
        return j;
    }

    static void quicksort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        // if (low < high) {
        int pivot = partition(arr, low, high);
        quicksort(arr, low, pivot - 1);
        quicksort(arr, pivot + 1, high);
        
        // }
    }

    public static void main(String[] args) {

        int arr[] = { 4, 6, 2, 5, 7, 9, 1, 3 };
        System.out.println(Arrays.toString(arr));

        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}

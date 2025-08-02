package sorting;

import java.util.Arrays;

public class Revise_sort {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 7, 4 };
        // int[] arr = {  6, 3, 5, 7, 4 };

        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr, int l, int h) {

        if (l > h) {
            return;
        }

        int pivotInd = partition(arr, l, h);
        quickSort(arr, l, pivotInd - 1);//----
        quickSort(arr, pivotInd + 1, h);//-----

    }

    private static int partition(int[] arr, int l, int h) {

        int pivot = arr[l];//----
        int i = l;
        int j = h;

        while (i < j) {

            while (arr[i] <= pivot && i <= h - 1) {//----
                i++;
            }
            while (arr[j] > pivot && j >= l + 1) {//----
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[l] = arr[j];//----
        arr[j] = pivot;
        return j;//----
    }
}
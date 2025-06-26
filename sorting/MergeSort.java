package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    // static void
    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 10, 100, 8 };
        // 2, 4, 1, 5, 3, 6
        mergeSortDivide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortDivide(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSortDivide(arr, low, mid);
        mergeSortDivide(arr, mid + 1, high);
        mergeSortMerge(arr, low, mid, high);

    }

    static void mergeSortMerge(int[] arr, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        // ind =0;
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
            // arr1[i] = temp.get(ind++);

        }
    }
}

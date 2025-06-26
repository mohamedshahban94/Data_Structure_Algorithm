package learnbytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trymergesort {

    static void mergesort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        mergesortmerge(arr, low, mid, high);
    }

    static void mergesortmerge(int[] arr, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            if (arr[left] > arr[right]) {
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
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 7, 5, 4, 1, 9, 3, 0, 2 };
        System.out.println(Arrays.toString(arr));
        mergesort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}

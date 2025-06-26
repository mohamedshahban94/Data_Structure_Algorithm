package sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PseudoMerge {

    static void pseudodivide(int arr[], int low, int high) {

        System.out.println(low + " " + high);
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        pseudodivide(arr, low, mid);
        pseudodivide(arr, mid + 1, high);
    }

    static void pseudomerge() {

        int arr[] = { 2, 5, 8, 1, 3, 7 };
        List<Integer> temp = new ArrayList<>();
        int low = 0, high = 5;
        int mid = (low + high) / 2;
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        int arr1[] = { 3, 5, 1, 7, 2 };

        pseudodivide(arr1, 0, arr1.length - 1);
        // pseudomerge();
        System.out.println(Arrays.toString(arr1));
    }

}

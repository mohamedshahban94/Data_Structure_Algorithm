package sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PseudoQuick {

    void practice() {

        int arr[] = { 4, 6, 3, 2, 5, 1, 9, 7, 8 };
        ArrayList<Integer> ls = new ArrayList<>();
        int pivot = arr[0];
        ls.add(pivot);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < pivot) {
                int ind = ls.indexOf(pivot);
                ls.add(ind, arr[i]);
            } else {
                int ind = ls.indexOf(pivot);
                ls.add(ind + 1, arr[i]);
            }
        }
        System.out.println(ls);
    }

    static void tryquick() {
        // 3, 2, 1
        // 4, 6, 2, 5, 7, 9, 1, 3
        int arr[] = { 7, 9, 5, 6 };
        int low = 0, high = arr.length - 1;
        int i = low;
        int j = arr.length - 1;
        int pivot = arr[i];
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            // swap
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 3, 2, 5, 1, 9, 7, 8 };
        // tryquick();
    }
}

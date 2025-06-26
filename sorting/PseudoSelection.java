package sorting;

import java.util.Arrays;

public class PseudoSelection {

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

    static void pseudoSelection(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            int ind = findminimum(arr, j);
            int temp = arr[j];
            arr[j] = arr[ind];
            arr[ind] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 7, 9, 0, 10, 23, 6 };
        pseudoSelection(arr);
    }

}

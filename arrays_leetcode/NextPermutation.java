package arrays_leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class NextPermutation {

    static void optimalNextPermutation(int[] arr) {
        int ind = -1;
        int n = arr.length;
        // find break point
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }
        // if break point doesn't exist
        if(ind == -1){
            int i=0;
            int j=arr.length-1;
            while (i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            return;
        }
        // find next greater than break point on right half
        for (int i = n - 1; i >= ind; i--) {
            if (arr[i] > arr[ind]) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }

        // reverse right half after ind
        ArrayList<Integer> temparr = new ArrayList<>();
        for (int i = n - 1; i > ind; i--) {
            temparr.add(arr[i]);
        }
        int tin = 0;
        for (int i = ind + 1; i < n; i++) {
            arr[i] = temparr.get(tin++);
        }

        System.out.println(Arrays.toString(arr));

    }

    static void reversearr(int arr[]){
        int i=0;
        int j=arr.length-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1 };
        System.out.println(Arrays.toString(arr));
        optimalNextPermutation(arr);
        // reversearr(arr);
    }
}

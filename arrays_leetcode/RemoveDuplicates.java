package arrays_leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    public int bruteremoveDuplicates(int[] arr) {
        // Code Here
        int hash[] = new int[1000000];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        for (int j = 0; j < hash.length; j++) {
            if (hash[j] > 0) {
                arr[count] = j;
                count++;
            }
        }
        return count;
    }

    public static void optimalSoln(int arr[]) {
        System.out.println(Arrays.toString(arr));
        int ind = 0;
        arr[ind] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[ind] != arr[i]) {
                ind++;
                arr[ind] = arr[i];
            }
        }
        if (ind == 0) {
            System.out.println();
        }
        System.out.println(Arrays.toString(arr));
    }

    static void useTreeSet(int arr[]) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1 };
        optimalSoln(arr);
    }
}

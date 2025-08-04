package arraybasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int arr[] = { 3, 2, 1, 1, 3, 4, 4, 2, 6 };
        // ArrayList<Integer> res = removeDuplicates(arr);
        // System.out.println(res);

    }

    private static ArrayList<Integer> removeDuplicates(int[] arr) {
        int[] hash = new int[100000];
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
            if (hash[arr[i]] == 1) {
                res.add(arr[i]);
            }
        }
        return res;
    }
}

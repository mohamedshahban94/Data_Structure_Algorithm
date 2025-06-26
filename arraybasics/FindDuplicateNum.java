package arraybasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateNum {

    static void useListCollection() {
        int arr[] = { 3, 4, 5, 3, 1 };
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            if (al.contains(arr[i])) {
                System.err.println(arr[i]);
                break;
            }
            al.add(arr[i]);
        }
    }

    static void withoutCollection() {
        int arr[] = { 3, 4, 5, 3, 1 };
        int hash[] = new int[12];
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            hash[val]++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(hash));
        System.out.println(hash[3]);
    }

    public static void main(String[] args) {
        // withoutCollection();
        int arr[] = new int[100000000];
        System.out.println(Math.pow(2, 32) - 1);
        System.out.println(Arrays.toString(arr));
    }
}

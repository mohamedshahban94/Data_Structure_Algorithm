package hashingarray;

import java.util.ArrayList;
import java.util.List;

public class NumHashing {

    
    static List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        List<Integer> list = new ArrayList<>();
        int hash[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;

        }
        for (int i = 1; i < hash.length; i++) {
            list.add(hash[i]);
        }
        return list;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 3, 2, 5 };
        // int hash[] = new int[10000000];
        // for (int i = 0; i < arr.length; i++) {
        //     hash[arr[i]]++;
        // }
        // int n = 3;
        // System.out.println(Arrays.toString(arr));
        // // System.out.println(Arrays.toString(hash));
        // System.out.println(hash[n]);

        // System.out.println(frequencyCount(arr));
    }
}

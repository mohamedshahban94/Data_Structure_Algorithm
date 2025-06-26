package learnbytest;

import java.util.*;

public class HashmapDemo {

    static void trial(){
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            mp.put(sum, i);
        }
        // System.out.println(mp.get());
        // System.out.println(mp.containsKey(3));
        // System.out.println();
        for (Map.Entry<Integer, Integer> map : mp.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }

    }
    public static void main(String[] args) {
        trial();
    }
}

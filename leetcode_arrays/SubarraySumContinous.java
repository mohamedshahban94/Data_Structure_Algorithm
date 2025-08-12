package leetcode_arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import search.revision;

public class SubarraySumContinous {

    public static void main(String[] args) {

        // boolean result = brutesubarraySum(new int[] {23,2,4,6,7 }, 6);
        // boolean result = brutesubarraySum(new int[] { 23, 2, 6, 4, 7 }, 6);
        // boolean result = brutesubarraySum(new int[] { 23,2,6,4,7}, 13);

        // boolean result2 = optimalsubarraySum(new int[] { 23,2,6,4,7}, 13);
        boolean result2 = optimalsubarraySum(new int[] { 23, 2, 4, 6, 7 }, 6);

        System.out.println(result2);
    }

    private static boolean optimalsubarraySum(int[] arr, int k) {

        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (map.containsKey(sum % k)) {
                if (i - map.get(sum % k) >= 2) {
                    // System.out.println(Arrays.spliterator(arr, i + 1, map.get(sum % k)));
                    // System.out.println(i + " : " + map.get(sum%k));
                    return true;
                }
            }
            map.put(sum % k, map.getOrDefault(sum % k, i));
        }
        // System.out.println(map);
        return false;
    }

    private static boolean brutesubarraySum(int[] arr, int k) {

        // Map<Integer, Integer> map2 = new LinkedHashMap<>();
        // map2.put(0, 1);
        // int sum2 = 0;
        // for (int i = 0; i < arr.length; i++) {
        // sum2 = sum2 + arr[i];
        // if (map2.containsKey(sum2%k)) {
        // System.err.println(" : " + i);
        // }
        // map2.put(sum2 % k, map2.getOrDefault(sum2 % k, 0) + 1);
        // }
        // System.out.println(map2);

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if ((j - i >= 2) && sum % k == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}

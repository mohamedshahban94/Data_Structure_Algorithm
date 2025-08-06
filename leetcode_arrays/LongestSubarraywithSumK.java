package leetcode_arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubarraywithSumK {

    static void bruteforceLongestSubarraywithSumK(int[] arr, int k) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    len = Math.max(len, (j - i + 1));
                }
            }
        }
        System.out.println(len);
    }

    static void optimalLongestSubArraywithSumk(int[] arr, int k) {

        int len = 0;
        int left = 0; // i
        int right = 0; // j
        int sum = arr[0];

        while (right < arr.length) {

            // moving left (i) if sum>k
            while (sum > k && left <= right) {
                sum = sum - arr[left];
                left++;
            }
            // sum==k
            if (sum == k) {
                len = Math.max(len, (right - left + 1));
            }
            right++;
            if (right < arr.length) {
                sum = sum + arr[right];
            }
        }
        System.out.println(len);
    }

    static void optimalWithNegativeValues(int[] arr, int k) {
        Map<Integer, Integer> map = new LinkedHashMap();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }
            // Store the first occurrence of this sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println(maxLen);
        for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
            System.out.println(mp.getKey() + " : " + mp.getValue());
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 10, 5, 2, 7, 1, -10 }; //---|
        // int k = 15; //---|___ diff inputs
        int arr[] = { -5, 5, -5, 2, 4, 2 }; // ---|
        int k = 2; // ---|
        // int arr[]={10, -10, 20, 30};
        // int k=5;
        // bruteforceLongestSubarraywithSumK(arr, k); // if works but time complexity
        // O(N^2)
        // optimalLongestSubArraywithSumk(arr,k); //it works only for +ve numbers
        // (sliding window technique) O(N)
        // optimalWithNegativeValues(arr, k); // it works fine for both +ve & -ve numbers (HashMap) O(N Log N)

    
    }
}
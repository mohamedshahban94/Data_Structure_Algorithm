package leetcode_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityNdiv2 {

    static void bruteforceMajorityNdiv2(int[] arr) {
        int hash[] = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (hash[arr[i]] > (arr.length / 2))
                System.out.println(arr[i]);
            break;
        }
    }

    static int betterMajorityElement(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
            if (mp.getValue() > (arr.length / 2)) {
                return mp.getKey();
            }
        }
        return -1;
    }

    static int optimalMajorityElement(int[] arr) {

        int i = 0;
        int cnt = 0;
        int ele = arr[i];
        while (i < arr.length) {
            if (cnt == 0) {
                ele = arr[i];
            }
            if (arr[i] == ele) {
                cnt++;
            } else {
                cnt--;
            }
            i++;
        }
        System.out.println(ele + " " + cnt);
        int cnt2 = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == ele)
                cnt2++;
        }
        if (cnt2 > (arr.length / 2))
            return ele;
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        // bruteforceMajorityNdiv2(arr);

        // System.out.println(betterMajorityElement(arr));

        // 1- moore's voting algo
        // 2- verify element by iterate an array
        // System.out.println(optimalMajorityElement(arr));
    }

}

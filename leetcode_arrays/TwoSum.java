package leetcode_arrays;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            for (int j = 0; j < nums.length && i!=j; j++) {
                if (val == nums[j]) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(twoSum(arr, 9)));

    }
}

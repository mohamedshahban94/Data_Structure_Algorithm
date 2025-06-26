package arrays_leetcode;

import java.util.Arrays;

public class Sort0s1s2s {
    static void bruteforceSort0s1s2s(int nums[]) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count0++;
            else if (nums[i] == 1)
                count1++;
            else
                count2++;
        }
        System.out.println(count0 + " : " + count1 + " : " + count2);
        int i = 0;
        while (i < count0) {
            nums[i] = 0;
            i++;
        }
        while ((i - count0) < count1) {
            nums[i] = 1;
            i++;
        }
        while ((i - count0 - count1) < count2) {
            nums[i] = 2;
            i++;
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 0, 1, 2, 0 };
        bruteforceSort0s1s2s(arr);
    }
}

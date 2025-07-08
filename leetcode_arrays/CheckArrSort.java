package leetcode_arrays;

import java.util.Arrays;

public class CheckArrSort {

    static void checkArraySortedOrNot(int nums[]) {

        int cNum[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            cNum[i] = nums[i];
        }
        System.out.println(Arrays.toString(nums) + " " + Arrays.toString(cNum));
        int x = nums.length;
        boolean flag = false;
        for (int i = 1; i <= x; i++) {
            // cNum[]
            flag = false;
            for (int j = 0; j < x; j++) {
                if (cNum[j] == nums[(j + i) % x]) {
                    flag = true;
                }
                // System.out.println(nums[(j + i) % x]);
            }
            if (flag) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(flag);
    }

    // B[i] == A[(i+x) % A.length]
    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 5, 1, 2 };
        checkArraySortedOrNot(arr);
    }
}

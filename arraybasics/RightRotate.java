package arraybasics;

import java.util.Arrays;

public class RightRotate {

    static void OneRightRotate(int arr[]) {
        System.out.println(Arrays.toString(arr));
        int backup = arr[arr.length - 1];
        int i = arr.length - 2;
        while (i >= 0) {
            arr[i + 1] = arr[i];
            i--;
        }
        arr[0] = backup;
        System.out.println(Arrays.toString(arr));
    }

    static void NRightRotate(int arr[]) {
        System.out.println(Arrays.toString(arr));
        int backup = arr[arr.length - 1];
        int i = arr.length - 2;
        int j = 3;

        j = j % arr.length;

        while (j > 0) {
            while (i >= 0) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[0] = backup;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void optimalApproachRightRotate(int[] nums) {
        int k = 3;
        k = k % nums.length;
        int backup[] = new int[k];
        int ind = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if ((ind + 1) <= k) {
                backup[ind++] = nums[i];
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(backup));
        int pos1 = nums.length - 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            if (j - k >= 0) {
                nums[pos1--] = nums[j - k];
            } else {
                break;
            }
        }
        int pos2 = backup.length - 1;
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < k; i++) {
            nums[i] = backup[pos2--];
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // OneRightRotate(arr);
        // NRightRotate(arr);
        optimalApproachRightRotate(arr);
    }

}

package leetcode_arrays;

public class MaxConsecutive1s {

    static void optimalSolution(int[] arr, int k) {
        // { 1, 0, 0, 1, 0, 1, 0, 1 }
        int left = 0, right = 0;
        int zeroCount = 0;
        int maxLen = 0;

        while (right < arr.length) {
            if (arr[right] == 0)
                zeroCount++;

            while (zeroCount > k) {
                if (arr[left] == 0)
                    zeroCount--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        System.out.println(maxLen);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 0, 1, 0, 1 };
        int k = 2;
        // bruteForceSolution(arr, k);
        optimalSolution(arr, k);
    }

    static void bruteForceSolution(int[] arr, int k) {

        int count = 0;
        int count1s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && count < k) {
                arr[i] = 1;
                count++;
            }

            if (arr[i] == 1) {
                count1s++;
            } else {
                count1s = 0;
                break;
            }
        }
        System.out.println(count1s);
        count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0 && count < k) {
                arr[i] = 1;
                count++;
            }

            if (arr[i] == 1) {
                count1s++;
            } else {
                break;
            }
        }
        System.out.println(count1s);

    }

}
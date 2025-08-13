package leetcode_arrays;

public class SubarrayMaxProduct {

    public static void main(String[] args) {

        int[] arr = { 1, 2, -3, 0, -4, -5 };

        int result = optimalMaxSubArrayProduct(arr);
        System.out.println("Result : " + result);
    }

    private static int optimalMaxSubArrayProduct(int[] arr) {

        int pre = 1;
        int suf = 1;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {

            if (pre == 0)
                pre = 1;
            if (suf == 0)
                suf = 1;
            pre *= arr[i];
            suf *= arr[arr.length - i - 1];

            result = Math.max(result, Math.max(pre, suf));
        }
        return result;
    }

}

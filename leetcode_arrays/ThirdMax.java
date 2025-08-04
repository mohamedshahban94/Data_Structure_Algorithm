package leetcode_arrays;

public class ThirdMax {
    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        System.out.println(thirdMax(arr));
    }

    public static int thirdMax(int[] nums) {

        long fmax = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > fmax) {
                tmax = smax;
                smax = fmax;
                fmax = nums[i];
            } else if (nums[i] > smax && nums[i] != fmax) {
                tmax = smax;
                smax = nums[i];
            } else if (nums[i] > tmax && nums[i] != fmax && nums[i] != smax) {
                tmax = nums[i];
            }
        }

        return (tmax == Long.MIN_VALUE) ? (int) smax : (int) tmax;
    }
}

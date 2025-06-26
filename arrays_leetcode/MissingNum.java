package arrays_leetcode;

public class MissingNum {

    static void BetterSoultion(int[] nums) {

        int len = nums.length;
        int i = 0;
        int tsum = 0;
        int asum = 0;
        while (i <= len) {
            tsum = tsum + i;
            if (i < len) {
                asum = asum + nums[i];
            }
            i++;
        }
        System.out.println(tsum - asum);
    }

    static void OptimalSolution(int[] arr) {
        // XOR : 2^2 = 0 || 2^0 = 2
        // why XOR?
        // size used by asum,tsum valu is lesser
        // where normal 10^5 * 10^5 = 10^10 which is long integer size .
        int tsum = 0;
        int asum = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (i < arr.length) {
                asum = asum ^ arr[i];
            }
            tsum = tsum ^ i;
        }
        System.out.println(asum - tsum);
    }

    // Find the number that appears once, and other numbers twice
    public static void search(int n, int arr[]) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        System.out.println(xor);
    }

    public static void main(String[] args) {
        int arr[] = {1};
        // OptimalSolution(arr);
        // BetterSoultion(arr);
        search(arr.length, arr);
    }
}

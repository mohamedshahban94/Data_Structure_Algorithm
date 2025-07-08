package leetcode_BS;

public class FirstALastOccurance {

    public static int[] bruteSearchRange(int[] nums, int target) {

        int lb = findLowerBound(nums, target);
        if (lb == nums.length || nums[lb] != target) {
            return new int[] { -1, -1 };
        }
        int ub = findUpperBound(nums, target);
        if (ub != -1) {
            ub = ub - 1;
        }
        return new int[] { lb, ub };
    }

    public static int findLowerBound(int[] arr, int x) {

        int l = 0;
        int h = arr.length - 1;
        int ans = arr.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                // System.out.println(ans + " + " + arr[ans]);
                h = mid - 1;
            } else {
                // System.out.println(mid + " : " + arr[mid]);
                l = mid + 1;
            }
        }
        return ans;
    }

    public static int findUpperBound(int[] arr, int x) {

        int l = 0;
        int h = arr.length - 1;
        int ans = arr.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] > x) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        // System.out.println(arr [ans-1]);
        return ans;
    }

    public static void main(String[] args) {
        int[] res = bruteSearchRange(new int[] { 5, 7, 7, 8, 8, 8, 10 }, 8);
        System.out.println(res[0] + " ," + res[1]);
    }
}

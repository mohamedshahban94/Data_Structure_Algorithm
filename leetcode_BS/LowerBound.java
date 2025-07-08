package leetcode_BS;

public class LowerBound {

    public static void main(String[] args) {
        findLowerBound(new int[] { 2, 4, 5, 6, 7, 7, 8, 9, 10,10,10 ,12, 14, 34 }, 10);
    }

    public static int findLowerBound(int[] arr, int x) {

        int l = 0;
        int h = arr.length - 1;
        int ans = -1;
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
}

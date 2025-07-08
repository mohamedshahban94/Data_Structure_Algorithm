package leetcode_BS;

public class UpperBound {
    
        public static int findUpperBound(int[] arr, int x) {

        int l = 0;
        int h = arr.length - 1;
        int ans = -1;
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
                findUpperBound(new int[] { 2, 4, 5, 6, 7, 7, 8, 9, 10,10,10 ,12, 14, 34 }, 10);

    }
}

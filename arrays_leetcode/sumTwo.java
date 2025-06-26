package arrays_leetcode;

public class sumTwo {

    static void findsum2(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];
            // if(binarySearch(arr,val)){

            // }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 4, 5, 5, 6, 8, 10 };
        // 2,8,5,5,10,6,4,1
        int target = 10;
        findsum2(arr, target);
    }

}

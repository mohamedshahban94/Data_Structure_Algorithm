package search;

public class BinarySearch {

    static void binarySearch(int[] arr, int val) {
        int start = 0;
        int end = arr.length - 1;
        boolean flag = false;
        int ind = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == val) {
                ind = mid;
                flag = true;
                break;
            } else if (val > arr[mid]) {
                start = mid + 1;
            } else if (val < arr[mid]) {
                end = mid - 1;
            }
        }
        if (flag) {
            System.out.println("Found" +
                    arr[ind]);
        } else {
            System.out.println("Not Found...");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 5, 12, 13, 15, 19 };

        binarySearch(arr, 15);

    }

}
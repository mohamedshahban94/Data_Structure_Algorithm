package search;

public class BinarySearch {

    public static int binarySearchByRecursion(int arr[], int low, int high, int k) {

        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == k) {
            return mid;
        } else if (arr[mid] > k) {
            return binarySearchByRecursion(arr, low, mid - 1, k);
        } else {
            return binarySearchByRecursion(arr, mid + 1, high, k);
        }
    }

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
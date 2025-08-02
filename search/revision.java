package search;

public class revision {

    public static void main(String[] args) {

        int arr[] = { 3, 5, 7, 8, 12, 13, 16 };
        int key = 14;
        binarySearch(arr, 0, arr.length - 1, key);

    }

    private static void binarySearch(int[] arr, int l, int h, int key) {

        int mid = (l + h) / 2;

        if (arr[mid] == key) {
            System.out.println("found: " + arr[mid]);
        } else if (arr[mid] < key) {
            binarySearch(arr, mid + 1, h, key);
        } else {
            binarySearch(arr, l, mid - 1, key);
        }
        if (l == h) {
            System.out.println("not found");
        }
    }
}

package search;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 4, 5, 6, 1, 6 };
        int val = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                System.out.println("Found");
            }
        }

    }
}

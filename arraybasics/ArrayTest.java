package arraybasics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    static Scanner sc = new Scanner(System.in);

    public static int[] getarr() {
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array values: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void displayarr(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }
}

package arraybasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotate {

    static void NLeftRotate() {
        int arr[] = { 10, 20, 30, 40 };
        System.out.println(Arrays.toString(arr));
        int n = 3;
        n = n % arr.length;
        for (int j = 1; j <= n; j++) {
            int backup = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = backup;

        }
        System.out.println(Arrays.toString(arr));

    }

    static void OneLeftRotate() {
        int arr[] = { 10, 20, 3, 40 };
        System.out.println(Arrays.toString(arr));

        int backup = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = backup;
        System.out.println(Arrays.toString(arr));

    }

    static void optimalApproachLeftRotate() {
        int arr[] = { -1, -2, -3, 4, 5, 6, 7 };
        // 10, 20, 30, 40
        System.out.println(Arrays.toString(arr));
        int n = 2;
        n = n % arr.length;
        int backup[] = new int[n];
        for (int j = 0; j < n; j++) {

            backup[j] = arr[j];
        }
        int ind = 0;
        for (int i = n; i < arr.length; i++) {
            arr[ind++] = arr[i];
        }
        for (int j = 0; j < n; j++) {
            arr[ind++] = backup[j];
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        // OneLeftRotate();
        // NLeftRotate();
        optimalApproachLeftRotate();
    }
}
package arrays_leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MakeZeros {

    // better
    static void bruteforceSetZeros(int[][] arr) {

        
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // ind1 == i || ind2 == j
                if (row.contains(i) || col.contains(j)) {
                    arr[i][j] = 0;
                }
            }
        }   
        printMatrix(arr);

    }

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

    }

    public static void main(String[] args) {
        // int arr[][] = { { 1, 2, 3, 4 }, { 1, 2, 0, 4 }, { 1, 2, 4, 4 }, { 1, 2, 3, 4} };
        // int arr[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        int arr[][] = { { 1, 1, 1, 1 }, {  1, 1, 0, 1  }, {  1, 1, 1, 1  } };

        // int arr[][] ={{1,2},{3,4}};
        bruteforceSetZeros(arr);
    }
}

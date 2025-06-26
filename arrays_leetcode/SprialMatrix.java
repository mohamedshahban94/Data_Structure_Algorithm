package arrays_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SprialMatrix {

    static void optimalSpiralMatrix(int matrix[][]) {

        List<Integer> res = new ArrayList<>();
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int left = 0;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i =bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }

        }
        System.out.println(res);
        System.out.println(res.get(4-1));
    }

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int arr[][] ={{1, 2},{3, 4}} ;
        optimalSpiralMatrix(arr);
        // tryoutSprialMatrix(arr);
    }

    static void tryoutSprialMatrix(int[][] arr) {

        int size = arr.length * arr[0].length;
        int res[] = new int[size];

        ArrayList<Integer> aljend = new ArrayList<>();
        ArrayList<Integer> aliend = new ArrayList<>();
        ArrayList<Integer> aljstart = new ArrayList<>();

        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0) {
                    res[ind++] = arr[i][j];
                } else if (j == arr.length - 1) {
                    aljend.add(arr[i][j]);
                } else if (i == arr.length - 1) {
                    aliend.add(arr[i][j]);
                } else if (j == 0) {
                    aljstart.add(arr[i][j]);
                }
            }
        }

        for (int val : aljend) {
            res[ind++] = val;
        }
        System.out.println(aljend);
        System.out.println(aliend);
        for (int val : aliend) {
            res[ind++] = val;
        }
        System.out.println(aljstart);
        for (int val : aljstart) {
            res[ind++] = val;
        }
        System.out.println(Arrays.toString(res));

    }
}

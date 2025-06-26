package arraybasics;

import java.util.Arrays;
import java.util.Scanner;

public class FactEachNumArray {
    static Scanner sc = new Scanner(System.in);

    public static int isFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }



    public static void main(String[] args) {       
        int arr[] = ArrayTest.getarr();
        System.out.println(Arrays.toString(arr));

        // factorail
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + isFactorial(arr[i]));
        }
    }

}

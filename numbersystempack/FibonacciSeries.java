package numbersystempack;

import java.util.Arrays;

public class FibonacciSeries {

    public static int fib(int n) {

        int a = 0;
        int b = 1;
        if (n == 1)
            return a;
        else if (n == 2)
            return b;
        int sum = 0;
        n = n - 2;
        while (n >= 0) {
            sum = a + b;
            a = b;
            b = sum;
            n--;
        }

        return sum;
    }

    public static int[] fibonacciNumbers(int n) {
        // Your code here
        if (n == 1) {
            return new int[] { 0 };
        } else if (n == 2) {
            return new int[] { 0, 1 };
        }
        int res[] = new int[n];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i < n; i++) {
            res[i] = res[i - 2] + res[i - 1];
        }

        return res;

    }

    public static void main(String[] args) {
        // System.out.println("Fibo : "+Arrays.toString(fibonacciNumbers(6)));
        System.out.println(fib(4));
    }
}

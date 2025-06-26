package numbersystempack;

public class PrimeNumSqrt {

    public static void main(String[] args) {
        int n = 30;
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if ((n / i) != i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

}

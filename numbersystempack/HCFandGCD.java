package numbersystempack;

public class HCFandGCD {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 40;
        int gcd = 1;
        for (int i = 1; i <= min(n1,n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd =i;
            }
        }
        System.out.println(gcd);
    }

    static int min(int n1, int n2) {
        return n1<n2?n1:n2;
    }
}

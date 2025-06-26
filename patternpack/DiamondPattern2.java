package patternpack;

public class DiamondPattern2 {

    public static void main(String[] args) {

        int n = 5;
        int a = 0;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                a = i;
            } else {
                a = 2 * n - i;
            }
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (i + j >= n + 1 && i - j <= n - 1 && j - i <= n - 1 && i + j <= 3 * n - 1) {
                    if (j < n) {
                        System.out.print(a-- + " ");
                    } else {
                        System.out.print(a++ + " ");
                    }

                } else {
                    System.out.print(" " + " ");

                }
            }

            System.out.println();
        }
    }
}

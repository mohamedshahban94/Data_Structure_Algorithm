package arraybasics;

public class FirstSecondMaxArray {

    public static void firstMax() {
        int ar[] = ArrayTest.getarr();
        ArrayTest.displayarr(ar);
        int i = 0;
        int fmax = ar[i];
        while (i < ar.length) {
            if (ar[i] > fmax) {
                fmax = ar[i];
            }
            i++;
        }
        System.out.println(fmax);
    }

    public static void secondMax() {
        int ar[] = ArrayTest.getarr();
        ArrayTest.displayarr(ar);

        int fmax = Integer.MIN_VALUE;
        System.out.println(fmax);
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > fmax) {
                smax = fmax;
                fmax = ar[i];
            } else if (ar[i] > smax && ar[i] != fmax) {
                smax = ar[i];
            }
        }
        System.out.println(fmax + " " + smax);
    }

    public static void main(String[] args) {
        firstMax();
        secondMax();
        // System.err.println(Long.MIN_VALUE +" "+ Long.MAX_VALUE );

    }
}

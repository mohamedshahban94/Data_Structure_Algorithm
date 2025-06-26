package arraybasics;

public class ReverseArray {

    public static void reverseAnArray() {
        int ar[] = ArrayTest.getarr();
        ArrayTest.displayarr(ar);
        int i = 0;
        int j = ar.length - 1;
        while (i < j) {
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;
        }
        ArrayTest.displayarr(ar);
    }

    public static void reverseAnDigitInArray() {
        int ar[] = ArrayTest.getarr();
        ArrayTest.displayarr(ar);
        for (int i = 0; i < ar.length - 1; i++) {
            ar[i] = reverseDigit(ar[i]);
        }

        ArrayTest.displayarr(ar);
    }

    public static int reverseDigit(int i) {
        int rev = 0;
        while (i != 0) {
            int digit = i % 10;
            rev = rev * 10 + digit;
            i = i / 10;
        }
        return rev;
    }

    public static void main(String[] args) {

        reverseAnArray();

        // reverseAnDigitInArray();

    }

}

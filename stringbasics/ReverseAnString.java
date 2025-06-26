package stringbasics;

public class ReverseAnString {

    // two pointer approach
    static String reverseAnString(char[] charr) {
        int i = 0, j = charr.length - 1;
        while (i < j) {
            char ch = charr[i];
            charr[i] = charr[j];
            charr[j] = ch;
            i++;
            j--;
        }
        // convert array to String by constructor
        return new String(charr);
    }

    public static void main(String[] args) {
        String str = "hello";
        // convert String to array
        char[] charr = str.toCharArray();
        System.out.println(reverseAnString(charr));
    }
}

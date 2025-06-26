package stringbasics;

public class SwapStringsWithoutVariable {

    static void swapStringsWithoutVariable(String s1, String s2) {
        if (s1.length() == s2.length()) {
            s1 = s1 + s2;
            s2 = s1.substring(0, s1.length() - s2.length());
            s1 = s1.substring(s1.length() - s2.length(), s1.length());
            System.out.println(s1);
            System.out.println(s2);
        }
        if (s2.length() > s1.length()) {
            s2 = s2 + s1;
            int s = s1.length();
            s1 = s2.substring(0, s2.length() - s1.length());
            s2 = s2.substring(s2.length() - s, s2.length());
            System.out.println(s1);
            System.out.println(s2);
        }
        // else {

        // } s1.length() > s2.length()

    }

    public static void main(String[] args) {
        String s1 = "hello000";
        String s2 = "world";
        swapStringsWithoutVariable(s1, s2);
    }
}

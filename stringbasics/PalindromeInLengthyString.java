package stringbasics;

public class PalindromeInLengthyString {

    static void checkPalindromeInLengthyString(String str) {

        String strArr[] = str.split(" ");
        for (String string : strArr) {
            if (IsPalindrome(string)) {
                System.out.println(string);
            }
        }
    }

    static boolean IsPalindrome(String string) {
        int i = 0;
        int j = string.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                flag = false;
            }
            i++;
            j--;
        }
        return flag;
    }

    public static void main(String[] args) {
        String str = "madam knows malayalam so speaks fluently mam";
        System.out.println(str);
        checkPalindromeInLengthyString(str);

    }
}

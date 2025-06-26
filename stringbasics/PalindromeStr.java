package stringbasics;

public class PalindromeStr {

    static boolean isPalindrome(String str) {
        boolean flag = true;
        int i = 0, j = str.length() - 1;
        while (i < j) {
            char chi = str.charAt(i);
            char chj = str.charAt(j);
            if (chi != chj) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }

    public static void main(String[] args) {
        String str = "LEVEL";
        System.out.println(isPalindrome(str));

    }

}
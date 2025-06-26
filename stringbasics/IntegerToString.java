package stringbasics;

public class IntegerToString {

    static String integerToString(int num) {
        String str = "";
        while (num > 0) {
            str = (num % 10) + str;
            num = num / 10;
        }
        return str;
    }

    static long stringToInteger(String str) {
        long num = 0;
        for (int i = 0; i < str.length(); i++) {
            // int digit = str.charAt(i) -48;
            int digit = str.charAt(i) - '0';
            num = (num * 10) + digit;
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 263460;
        // System.out.println("String " + integerToString(num));
        System.out.println("Integer : " + stringToInteger("123456789"));
    }

}

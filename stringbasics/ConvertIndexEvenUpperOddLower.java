package stringbasics;

public class ConvertIndexEvenUpperOddLower {

    static void convertIndexEvenUpperOddLower(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                if (ch >= 'a' && ch <= 'z') {
                    s = s + (char) ((int) ch - 32);
                } else {
                    s += ch;
                }
            } else {
                if (ch >= 'A' && ch <= 'Z') {
                    s = s + (char) ((int) ch + 32);
                } else {
                    s += ch;
                }
            }
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        // i/p; abcd
        // o/p: AbCd

        // i/p; aBcD
        // o/p: AbCd

        String str = "  abcooooOOOdAAA   ";
        System.out.println();
        System.out.println(str.trim().toLowerCase().toUpperCase().intern().replace("ABC", "eee").replace('D', '9'));

        // convertIndexEvenUpperOddLower(str);

    }
}

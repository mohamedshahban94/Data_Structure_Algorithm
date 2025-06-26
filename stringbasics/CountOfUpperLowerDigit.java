package stringbasics;

public class CountOfUpperLowerDigit {

    static void countOfUppperLower(String str) {
        int uCnt = 0, lCnt = 0, dCnt = 0, sCnt = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                uCnt++;
            } else if (ch >= 'a' && ch <= 'z') {
                lCnt++;
            } else if (ch >= '0' && ch <= '9') {
                dCnt++;
            } else {
                sCnt++;
            }
        }
        System.out
                .println("U count : " + uCnt + "\nL count : " + lCnt + " \nD count : " + dCnt + "\nS count : " + sCnt);
    }

    public static void main(String[] args) {
        String str = "mohamedShahban94@gmail.com";
        countOfUppperLower(str);
    }
}

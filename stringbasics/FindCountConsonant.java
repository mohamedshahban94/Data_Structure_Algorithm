package stringbasics;

public class FindCountConsonant {

    static void findCountConsonant(String str) {
        // a-97 z-122 And A-65 Z-90
        int cCnt=0;
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            char strch = str.charAt(i);
            if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {
                if (strch != 'a' && strch != 'e' && strch != 'i' && strch != 'o' && strch != 'u' && strch != 'A' && strch != 'E' && strch != 'I' && strch != 'O' && strch != 'U'){
                    System.out.print(strch);
                    cCnt++;
                }
            }
        }
        System.out.println(" : "+cCnt);
    }

    public static void main(String[] args) {
        String str = "aeiouAEIOUfinDconsonant$%^";
        findCountConsonant(str);
    }
}

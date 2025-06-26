package stringbasics;

public class ConsectiveStr4 {
    static void bruteforceConsecutive(String str) {

        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                    if ((j == str.length() - 1)) {
                        i = j;
                    }
                } else {
                    i = j - 1;
                    break;
                }
            }
            res = res + ch + count;
        }
        System.out.println(res);
    }

    static void optimalConsecutive(String str) {

        int count = 1;
        String res = "";
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.charAt(i - 1) == ch) {
                count++;
            }
            if (str.charAt(i - 1) != ch) {
                res = res + str.charAt(i-1) + count;
                count = 1;
            }
            // for last value
            if(i == str.length()-1){
                res = res + ch + count;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        String str = "AAABBCCCCd";
        // bruteforceConsecutive(str); //O(N^2)


        optimalConsecutive(str); //O(N)
    }
}

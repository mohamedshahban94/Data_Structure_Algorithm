package stringbasics;

public class RemoveAllSplChar {

    static void removeAllSplChar(String str) {
        int i = 0;
        String temp = "";
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                i++;
                temp = temp + ch;
            } else if (ch >= 'a' && ch <= 'z') {
                i++;
                temp = temp + ch;
            } else if (ch >= '0' && ch <= '9') {
                i++;
                temp = temp + ch;
            } else {
                i++;
            }

        }
        System.out.println(str);
        System.out.println(temp);
    }

    static void convertIntoUpperStr(String str) {
        String s ="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int val = (int)ch -32;
                char tch = (char)val;
                s = s + tch;
            }
            else{
                s = s + ch;
            }
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        String str = "h@l!o-Wor#d";
        // removeAllSplChar(str);
        convertIntoUpperStr(str);
    }
}

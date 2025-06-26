package stringbasics;

public class RemoveConsectiveCharacter {

    static void removeConsectiveCharacter(String str) {

        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!res.contains("" + ch)) {
                res = res + ch;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        String str = "AAABBCCaaaCDDDDD";
        // String str = "DDDD";
        // System.out.println(str.length()-1);
        // removeConsectiveCharacter(str);

    }
}

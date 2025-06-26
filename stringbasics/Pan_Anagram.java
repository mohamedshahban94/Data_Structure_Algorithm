package stringbasics;

import java.util.Arrays;

public class Pan_Anagram {

    static boolean anagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int hash1[] = isHashArray(str1);
        int hash2[] = isHashArray(str2);
        for (int i = 0; i < hash1.length; i++) {
            if (hash1[i] != hash2[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean pangram(String str) {

        int hash1[] = isHashArray(str);
        boolean flag = true;
        for (int i = 0; i < hash1.length; i++) {
            if (hash1[i] == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    static int[] isHashArray(String str) {
        int hash[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                hash[ch - 97]++;
            else if (ch >= 'A' && ch <= 'Z')
                hash[ch - 65]++;
            else {

            }
        }
        return hash;
    }

    public static void main(String[] args) {

        String str1 = "liSten";
        String str2 = "silent";

        System.out.println((anagram(str1, str2)) ? "Anagram" : "not Anagram");

        String str = "AbcdefghijklmnopQnnkjnvkrstuvwxyz";
        System.out.println((pangram(str)) ? "Pangram" : "Not pangram");
    }
}

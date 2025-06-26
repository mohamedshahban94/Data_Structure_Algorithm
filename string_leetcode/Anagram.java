
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        // System.out.println(isAnagram("cat", "rat"));
        // System.out.println(isAnagram("anagram", "gramana"));
        System.out.println(betterIsAnagram("cat", "act"));

    }

    public static boolean betterIsAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sarr = new int[1000];
        int[] tarr = new int[1000];

        for (int i = 0; i < s.length(); i++) {
            sarr[(int) s.charAt(i)]++;
            tarr[(int) t.charAt(i)]++;
            // System.out.println((int)s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            int ind = s.charAt(i);
            if (sarr[ind] != tarr[ind]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sarr = s.toCharArray();
        Arrays.sort(sarr);
        char[] tarr = t.toCharArray();
        Arrays.sort(tarr);

        // System.out.println(sarr);
        // System.out.println(tarr);
        for (int i = 0; i < sarr.length; i++) {
            if (sarr[i] != tarr[i]) {
                return false;
            }
        }
        return true;
    }
}

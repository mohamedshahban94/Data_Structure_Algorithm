
import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {
        // System.out.println(bruteforceIsomorphic("aab", "xxy"));
        // System.out.println(bruteforceIsomorphic("aac", "xyz"));
        // System.out.println(bruteforceIsomorphic("paper", "title"));
        System.out.println(bruteforceIsomorphic("bbbaaaba", "aaabbbba"));

    }

    public static boolean bruteforceIsomorphic(String s1, String s2) {
        // Your code here
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<Character, Character>();
        Map<Character, Character> map2 = new HashMap<Character, Character>();
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (map1.containsKey(ch1)) {
                if (map1.get(ch1) != ch2) {
                    return false;
                }
            } else {
                if (map2.containsKey(ch2)) {
                    return false;
                }
                map1.put(ch1, ch2);
                map2.put(ch2, ch1);
            }
        }

        System.out.println(map1);
        System.out.println(map2);
        return true;

    }
}

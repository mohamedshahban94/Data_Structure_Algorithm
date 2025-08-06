package leetcode_arrays;

public class CountPrefixSuffixPairs {

    public static void main(String[] args) {
        String[] sarr = { "a", "aba", "ababa", "aa" };
        int count = countPrefixSuffixPairs(sarr);
        System.out.println(count);
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String s1 = words[i];
            int s1len = s1.length();
            // System.out.print(s1 + " : ");
            for (int j = i; j < words.length; j++) {
                if (i != j) {

                    String s2 = words[j];
                    int s2len = s2.length();
                    if (s1len <= s2.length()) {
                        String pre = s2.substring(0, s1len);
                        String suf = s2.substring(s2len - s1len, s2len);
                        if (s1.equals(pre) && s1.equals(suf)) {
                            count++;
                            System.out.println(pre + " : " + suf);
                        }
                    }
                }
            }
        }
        return count;
    }
}

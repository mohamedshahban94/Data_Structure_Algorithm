import java.util.HashSet;

public class LongestSubstring {

    static void lonngestSubString(){
         String str = "dvdf";

        if (str.equals("") || str == null) {
            System.out.println("Empty : " + "");
        }
        String res = "";
        int i = 0;
        int j = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while (j < str.length()) {

            if (!set.contains(str.charAt(j))) {
                if (j - i + 1 > max) {
                    max = j - i + 1;
                    res = str.substring(i, j + 1);
                }
                set.add(str.charAt(j));
                j++;
            } else {
                set.remove(str.charAt(i));
                i++;
            }
            max = Math.max(max, res.length());
        }
        System.out.println(res + " : " + max);
    }
    public static void main(String[] args) {

        // String str = "abcabc";
        // String str = "bbbbb";
       
        
    }
}

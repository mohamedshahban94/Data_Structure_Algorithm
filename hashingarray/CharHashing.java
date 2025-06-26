package hashingarray;

import java.util.Arrays;

public class CharHashing {
    public static void main(String[] args) {

        int alpha[] = new int[25];

        String s = "hello";

        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(alpha));
    }
}

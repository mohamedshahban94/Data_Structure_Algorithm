package stringbasics;

import java.util.HashMap;
import java.util.Map;

public class ExtractCharFromStartEndIndex {

    static void extractCharFromStartEndIndex(String str, int start, int end) {
        if (start < 0 || end > str.length() || start > end)
            System.out.println("invalid...");
        else {
            String s = "";
            for (int i = start; i < end; i++) {
                s = s + str.charAt(i);
            }
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        // String str = "hello world";
        // System.out.println(str.length());
        // extractCharFromStartEndIndex(str, 6, 11);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 3);
        System.out.println(map);
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){

        }
    }
}

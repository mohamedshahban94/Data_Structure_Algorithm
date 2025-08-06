package revision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day_3 {

    void SlidingHashSet() {
        String str = "abcadfghi";

        Set<Character> set = new HashSet<>();
        // for(char ch : str.toCharArray()){
        // }
        int i = 0;
        int j = 0;
        int max = 0;
        while (j < str.length() - 1) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                if ((j - i + 1) > max) {
                    max = j - i + 1;
                }
                j++;

            }
            while (set.contains(str.charAt(j)) && i < j) {
                set.remove(str.charAt(i));
                i++;
            }
        }
        System.out.println(max);
    }

    void SlidingHashMap() {
        String s1 = "ab";
        String s2 = "cdefgbaec";

        int[] s1arr = new int[26];
        int[] s2arr = new int[26];
        // char[] s1arr = new char[26];
        // char[] s2arr = new char[26];
        for (char ch : s1.toCharArray()) {
            s1arr[ch - 'a']++;
        }
        for (char ch : s2.toCharArray()) {
            s2arr[ch - 'a']++;
        }
        int i = 0;
        int j = s1.length() - 1;
        int k = s1.length() - 1;
        while (j < s2.length() - 1) {
            boolean flag = true;
            for (int s = 0; s < 26; s++) {
                if (s1arr[s] != s2arr[s]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(flag);
                System.out.println(s2.substring(i, j));
            }
            j++;
            i++;
        }
    }

    static void SlidingHashMapAtCharDistinct() {

        String str = "abcadee";
        Map<Character, Integer> map = new HashMap<>();
        int k = 2;
        int start = 0;

        for (int end = 0; end < str.length(); end++) {

            map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) + 1);
            while (map.size() > k) {
                map.put(str.charAt(start), map.get(str.charAt(start)) - 1);
                if (map.get(str.charAt(start)) == 0) {
                    map.remove(str.charAt(start));
                }
                start++;
            }
            System.out.println(map);

        }
        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('d', 1);
        map2.put('e', 2);
        System.out.println(map2);
        System.out.println(map.equals(map2));
    }

    static void TwoPointers() {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int l = 0;
        int r = arr.length - 1;
        int x = 7;
        while (l < r) {
            if (arr[l] + arr[r] == x) {
                System.out.println(x);
                System.out.println(arr[l] + " : " + arr[r]);
                break;
            } else if (arr[l] + arr[r] < x) {
                l++;
            } else {
                r--;
            }
        }
    }

    public static void main(String[] args) {


    }
}
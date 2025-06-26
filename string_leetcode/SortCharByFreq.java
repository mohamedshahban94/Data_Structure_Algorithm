
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharByFreq {

    public static void main(String[] args) {
        System.out.println(myOwnFrequencySort("cccaaa"));
        // System.out.println(hashingFrequencySort("tree"));
    }

    public static String hashingFrequencySort(String s) {
        char[] sarr = s.toCharArray();
        int[] hash = new int[26];
        for (int i = 0; i < sarr.length; i++) {
            hash[(int) sarr[i] - 'a']++;
        }
        System.out.println(Arrays.toString(hash));
        Arrays.sort(hash);
        System.out.println(Arrays.toString(hash));
        return "";
    }

    public static String myOwnFrequencySort(String s) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<FreqMap> freqmap = new ArrayList<FreqMap>();
        for (Map.Entry<Character, Integer> val : map.entrySet()) {
            System.out.println(val.getKey() + " " + val.getValue());
            freqmap.add(new FreqMap(val.getKey(), val.getValue()));
        }
        Collections.sort(freqmap);
        String res = "";
        for (FreqMap values : freqmap) {
            // System.out.println(values.getKey());
            for (int i = 1; i <= values.getValue(); i++) {
                res = res + values.getKey();
            }
        }
        // System.out.println(freqmap);
        return res;

        // System.out.println(map.entrySet());
        // System.out.println(map.keySet());
        // System.out.println(map.values());
    }
}

class FreqMap implements Comparable<FreqMap> {

    public char key;
    public int value;

    FreqMap(char key, int value) {
        this.key = key;
        this.value = value;
    }

    public char getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "FreqMap [key=" + key + ", value=" + value + "]";
    }

    @Override
    public int compareTo(FreqMap o) {
        if (this.value == o.value) {
            return 0;
        } else if (this.value > o.value) {
            return -1;
        } else {
            return 1;
        }
    }
}
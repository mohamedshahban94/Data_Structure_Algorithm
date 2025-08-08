package leetcode_arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

        int num = OptimalRomanToInteger("MDCXCV");
        // int num = romanToInteger("MCM");
        System.out.println(num);
    }

    private static int OptimalRomanToInteger(String s) {

        // better to use switch case for better time complrxity

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            int curr = map.get(s.charAt(i));
            if (curr < prev) {
                sum -= curr;
            } else {
                sum += curr;
            }
            prev = curr;
        }

        return sum;
    }

    private static int MyownApproachRomanToInteger(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int i = 1;
        int sum = 0;
        List<Integer> values = new ArrayList<>();
        while (i < s.length()) {

            char ch1 = s.charAt(i - 1);
            char ch2 = s.charAt(i);
            int v1 = map.get(ch1);
            int v2 = map.get(ch2);
            if (v1 >= v2) {
                sum = sum + v1;

                if (i == s.length() - 1) {
                    sum = sum + v2;
                }
                // values.add(v1);
            } else {
                sum = sum + (v2 - v1);
                i++;
            }
            // System.out.println(v1 + " : " + v2);
            i++;
        }

        return sum;
    }
}

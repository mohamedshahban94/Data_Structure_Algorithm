package leetcode_arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class UnionTwoArray {

    static ArrayList<Integer> UnionTwoArrayBruteForce(int a[], int b[]) {
        Set<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        return new ArrayList<>(set);
    }

    static ArrayList<Integer> UnionTwoArrayOptimalSoln(int a[], int b[]) {
        ArrayList<Integer> al = new ArrayList<>();
        int l1 = a.length;
        int l2 = b.length;
        int i = 0;
        int j = 0;
        while (i < l1 && j < l2) {
            int val = Integer.MIN_VALUE;
            if (a[i] < b[j]) {
                val = a[i++];
            } else if (a[i] > b[j]) {
                val = b[j++];
            } else {
                val = a[i++];
                j++;
            }
            if (al.isEmpty() || al.get(al.size() - 1) != val) {
                al.add(val);
            }
        }
        while (i < l1) {
            if (al.isEmpty() || al.get(al.size() - 1) != a[i]) {
                al.add(a[i++]);
            }
        }
        while (j < l2) {
            if (al.isEmpty() || al.get(al.size() - 1) != b[j]) { 
                al.add(b[j++]);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 2, 3 };
        int b[] = { -8, -3, 8 };
        // System.out.println(UnionTwoArrayBruteForce(a, b));
        System.out.println(UnionTwoArrayOptimalSoln(a, b));
    }
}
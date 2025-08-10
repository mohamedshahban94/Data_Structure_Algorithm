package leetcode_arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangel {

    public static List<List<Integer>> generate(int num) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = null;
        for (int i = 1; i <= num; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 1; j <= i; j++) {

                if (j == 1 || i == j) {
                    list.add(1);
                } else {
                    // System.out.println(temp);
                    // System.out.println(temp.get(j - 2) + temp.get(j + 2));
                    list.add( temp.get(j-2)+ temp.get(j-1));
                    // System.out.println(j-2 +" : "+ (j-1));
                }
            }
            temp = list;
            // System.out.println(temp);
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {

        List<List<Integer>> res = generate(5);
        System.out.println(res);
    }
}

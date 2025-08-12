package leetcode_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Three3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        // System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {

            int l = 0;
            int r = nums.length - 1;
            while (l < r) {

                if (i == l) {
                    l++;
                } else if (i == r) {
                    r--;
                } else {
                    l++;
                    r--;
                }

                if (nums[i] + nums[l] + nums[r] == 0
                        && (nums[i] != nums[l] && nums[i] != nums[r] && nums[l] != nums[r])) {

                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    Collections.sort(list);
                    // System.out.print("i : " + nums[i]);
                    // System.out.print("l : " + nums[l]);
                    // System.out.println("r : " + nums[r]);
                    boolean flag = false;
                    for (List<Integer> lists : res) {
                        if (lists.equals(list)) {
                            flag = true;
                        }
                    }
                    if (!flag) {
                        res.add(list);
                    }
                }
                // System.out.println(nums[i] +nums[l] + nums[r]);

            }
        }

        System.out.println(res);
        return null;
    }

    static void correctAns(int[] nums) {


        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // skip duplicates for l and r
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;

                    l++;
                    r--;
                } 
                else if (sum < 0) {
                    l++;
                } 
                else {
                    r--;
                }
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {

        // List<List<Integer>> result = threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
        List<List<Integer>> result = threeSum(new int[] { 0, 0, 0 });
        // m1();
    }
}

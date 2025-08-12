package leetcode_arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementNBy3 {

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> mapvalue : map.entrySet()) {
            if (mapvalue.getValue() > (nums.length / 3)) {
                result.add(mapvalue.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> result = majorityElement(new int[] { 1,1,1,2,2,3,3,3 });
        System.out.println(result);
    }
}

package leetcode_arrays;

import java.util.HashMap;

public class SubarraySumEqualK {
    public static void main(String[] args) {
        
        // System.out.println(brutesubarraySum(new int[] {1,1,1}, 2));
        // System.out.println(bettersubarraySum(new int[]{1,2,3}, 3));
        System.out.println(optimalsubarraySum(new int[]{1,1,1},2));
    }
    private static int optimalsubarraySum(int[] nums, int k) {
        int count= 0;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i =0 ;i<nums.length;i++){
            sum = sum + nums[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
    public static int brutesubarraySum(int[] nums, int k) {
        int tsubarr = 0;
        for(int i=0;i<nums.length;i++){
            int sum =0 ;
            for(int j=i;j<nums.length;j++){
                sum = sum + nums[j];
                if(sum == k){
                    tsubarr++;
                }
            }
        }
        return tsubarr;
    }
    public static int bettersubarraySum(int[] nums, int k) {
        int tsubarr = 0;
        int i =0;
        int j= 0;
        int l= nums.length;
        int sum=0;
        while(j<l && i<l){
            sum = sum+ nums[j];
            while (sum > k && i <= j) {
            sum -= nums[i++];
        }

        if (sum == k) {
            tsubarr++;
        }
        j++;
        }
        return tsubarr;
    }
}

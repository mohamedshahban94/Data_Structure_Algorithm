package arrays_leetcode;

import java.util.ArrayList;

public class SubarraySumCheck {
    
    public static void main(String[] args) {
        
        System.out.println(bruteforcecheckSubarraySum(new int[]{23,2,6,4,7},13));

    }

    public static boolean bruteforcecheckSubarraySum(int[] nums, int k) {

        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum = sum + nums[j];
                if(sum == k || sum%k==0){
                    if(j-i+1 >=2){
                        System.out.println(i+" : "+j);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

package leetcode_arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestConsective {

    public static void betterlongestConsecutive(int[] arr) {
        // code here
        
        Arrays.sort(arr);
        int cnt =1;
        int longest = 1;
        int startval= Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){

            if(arr[i-1]+1 == arr[i]){
                cnt++;
            }else{
                cnt = 1;
            }
            longest = Math.max(cnt, longest);
        }
        System.out.println(longest);
    }
    private static void optimalLongestConsecutive(int[] arr) {
        
        HashSet<Integer> set = new HashSet<>(); // remove duplicates an
        for(int num: arr){
            set.add(num);
        }
         
        int cnt =1;
        int longest = 1;
        for(Integer num : set){
            // num : 4 is not present in set for num : 5 
            // then process because 4 is present before 5, then 5 is not start value
            if( !set.contains(num-1)){
                int curNum = num;
                while(set.contains(curNum+1)){
                    cnt++;
                    curNum++;
                }
                longest = Math.max(cnt, longest);
            }
        }
        System.out.println(longest);
    }
    public static void main(String[] args) {
        int arr[] = {15, 13, 12, 14, 11, 10, 9};
        // betterlongestConsecutive(arr);
        optimalLongestConsecutive(arr);
    }
}

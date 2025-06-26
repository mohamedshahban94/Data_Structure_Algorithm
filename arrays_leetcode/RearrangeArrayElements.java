package arrays_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElements {

    static void bruteforceRearrangeArrayElements(ArrayList<Integer> arr) {
        ArrayList<Integer> l1 =new ArrayList<>();
        ArrayList<Integer> l2 =new ArrayList<>();
        for(Integer a: arr){
            if(a>=0){
                l1.add(a);
            }
            else{
                l2.add(a);
            }
        }
        int i=0,j=0;
        int ind =0;
        while ( ind<arr.size()) {
            if(i<l1.size()){
                arr.set(ind++, l1.get(i));
                i++;
            }
            if(j<l2.size()){
                arr.set(ind++, l2.get(j));
                j++;
            }
        }
        System.out.println(arr);
    }

    static void optimalRearrangeArrayElements(int[] nums) {
            // int res[] = new int[nums.length];
            ArrayList<Integer> l1 =new ArrayList<>();
            ArrayList<Integer> l2 =new ArrayList<>();
            for(int a: nums){
                if(a>=0){
                    l1.add(a);
                }
                else{
                    l2.add(a);
                }
            }
            for(int i=0;i<l1.size();i++){
                nums[i*2] = l1.get(i);
                nums[i*2+1]  =l2.get(i);
            }
            
            System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        int arr[] = {3,-1,-2,-5,0,3};
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(5, -5, 2, -2, 4, -8, 7, 1, 8, 0));
        bruteforceRearrangeArrayElements(al); // Uneven +ve & -ve //5, -5, 2, -2, 4, -8, 7, 1, 8, 0
        optimalRearrangeArrayElements(arr);  // equal +ve & -ve //3,1,-2,-5,2,-4 
    }

}

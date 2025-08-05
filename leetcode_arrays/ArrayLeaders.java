package leetcode_arrays;

import java.util.ArrayList;

public class ArrayLeaders {

    static void bruteforceArrayLeaders(int[] arr) {

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res.add(arr[i]);
            }
        }
        System.out.println(res);
    }

    static void optimalArrayLeaders(int[] arr) {

        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        int fmax = 0;
        for(int i=arr.length-1;i>=0;i--){

            fmax = Math.max(fmax, arr[i]);
            if(arr[i]>=fmax){
                temp.add(arr[i]);
            }
        }
        for(int j =temp.size()-1;j>=0;j--){
            res.add(temp.get(j));
        }
        System.out.println(res);
    }

    public static void main(String[] args) {

        int arr[] = { 16, 17, 4, 3, 5, 2 };
        bruteforceArrayLeaders(arr);
        // optimalArrayLeaders(arr);
    }
}

package arraybasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MissindDuplicates {
    public static void main(String[] args) {
        System.out.println(findTwoElement(new int[]{2,2}));
    }
    static ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        int hash[] = new int[100001];
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
            set.add(arr[i]);
        }
        int res0= 0;
        int res1= 0;
        for(int ind=1;ind<=arr.length;ind++){
            if(hash[ind]>1){
                res0 = ind;
            }
            if(!set.contains(ind)){
                res1= ind;
            }
        }
        res.add(res0);
        res.add(res1);
        return res;
        
    }
}

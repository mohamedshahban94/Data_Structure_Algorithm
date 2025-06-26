package learnbytest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import stringbasics.IntegerToString;

public class TestIterator {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);

        System.out.println(list);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
        Set<Integer> treeset = new TreeSet<>(list);
        System.out.println(treeset);
        // ----------------------------
        // Object arr[]= list.toArray();
        // System.out.println(list.toArray());
        // System.out.println(arr.toString());
        // -------------------------
        // Iterator<Integer> iter = list.iterator();
        // System.out.println(iter.toString()+" "+ list);
        // while (iter.hasNext()) {
        //     int val = iter.next();
        //     if(val==0){
        //         iter.remove();
        //     }
        // } 
        // System.out.println(iter+" "+ list);
    }
}

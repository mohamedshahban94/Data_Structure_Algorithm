package learnbytest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Test {

    int a= 9;
    int b = 20;

    // {
    // System.out.println(" static block..");
    // a = 10;
    // b=20;
    // }

    // void testMethod() {
    // System.out.println("testMethod");
    // System.out.println(a + " "+ b);
    // }

    // non -static block
    {
        a = 11;
        System.out.println("non -static block " + a);
    }

    // constructor
    public Test(int i) {
        this.a = i;
        System.out.println("Constructor initial" + a);
    }

    void valueInitialize(int i) {
        a = i;
    }

    public static void main(String[] args) {
        System.out.println("hhi");

        // Collection<Integer> cl =new ArrayList<>();
        // cl.add(10);
        // System.out.println(cl);
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(30);
        set.add(50);
        // System.out.println(set);
        // for(Integer num:set){
        // System.out.println(num);
        // }
        // Iterator<Integer> it = set.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }
        // Queue<Integer> q =new PriorityQueue<>(set);
        // // q.addAll(set);
        // for(Integer que: q){
        // // q.element();
        // System.out.println(que);
        // }

        // new Test().testMethod();
        // new Test();

        // Test obj = new Test(10);
        // obj.a = 12;
        // System.out.println(obj.a);
        // obj.valueInitialize(13);
        // System.out.println("Method initail " + obj.a);

        // System.out.println(obj.a);

        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        System.out.println(ch);
    }

}

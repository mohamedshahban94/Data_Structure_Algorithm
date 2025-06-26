package stringbasics;

import java.util.Arrays;

public class FindLargestString {

    static void findLargestString(String str) {

        String big = "";

        String s = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (i < str.length() && ch != ' ') {
                s = s + ch;
            }
            if (ch == ' ') {
                s = "";
            }
            if (s.length() > big.length()) {
                big = s;
            }
        }
        System.out.println(big.length());
        System.out.println(big);
    }

    static void findLargestStringBySplitMethod(String str) {

        String big = "";
        String strarr[] = str.split(" ");
        System.out.println(Arrays.toString(strarr));
        for(int i=0;i<strarr.length;i++){
            if(strarr[i].length()>big.length()){
                big = strarr[i];
            }
        }
        System.out.println(big);
    }

    static void findSmalllestStringBySplitMethod(String str) {

        String strarr[] = str.split(" ");
        String small = strarr[0];
        System.out.println(Arrays.toString(strarr));
        for(int i=1;i<strarr.length;i++){
            if(strarr[i].length()<small.length()){
                small = strarr[i];
            }
        }
        System.out.println(small);
    }

    public static void main(String[] args) {

        String str = "the is an java Devr";
        // findLargestString(str);
        // findLargestStringBySplitMethod(str);
        findSmalllestStringBySplitMethod(str);
    }
}

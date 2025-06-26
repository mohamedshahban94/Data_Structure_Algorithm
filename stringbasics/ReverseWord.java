package stringbasics;

import java.util.Arrays;

public class ReverseWord {

    static void reverseWord(char strch[]) {

        String s = new String("");
        String res = "";
        System.out.println(Arrays.toString(strch));
        for (int i = 0; i < strch.length; i++) {

            if(strch[i]!=' '){
                s = s + strch[i];
            }
            if( strch[i] == ' ' ){
                if(!s.isEmpty()){
                    res = s +" " + res;
                    s= ""; 
                }
            }
            // if (strch[i] == ' ' && (!res.endsWith(" "))) {
            //     res = s + " " + res;
            //     s = new String("");
            // } else {
            //     s = s + strch[i];
            // }
            // if (i == strch.length - 1) {
            //     res = s + " " + res;
            // }
        }
        if(!s.isEmpty()){
            res = s + " "+ res;
        }
        
        System.out.println(res.trim());
        // System.out.println(res.length());
        System.out.println(res.trim().length()); // used to remove the spaces in front and back of string
        System.out.println(res.endsWith(" "));
    }

    public static void main(String[] args) {
        // String str = "hi helo little beggera"
        String str = " i like this  program very much ";
        reverseWord(str.toCharArray());

    }
}

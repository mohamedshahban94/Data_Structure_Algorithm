package stringbasics;

public class FindSpecialCharacter {

    static void findSpecialCharacter(String str) {
        for(int i=0;i<str.length();i++){
            int ch =str.charAt(i);
            if( !((ch>=65 &&ch<=90) || (ch>=97 &&ch<=122) || (ch>=48 &&ch<=57))){
                System.out.print((char)ch);
            }
        }
    }
    public static void main(String[] args) {
        String str = "$money@kIng_author";
        findSpecialCharacter(str);
    }
}

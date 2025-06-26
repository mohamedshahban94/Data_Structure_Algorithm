package stringbasics;

public class WithoutCharAt {
    static void withoutCharAtToPrintString(String str) {
        char strch[] = str.toCharArray();
        for(char ch:strch){
            System.out.print( ch);
        }
    }
    static int findCountOfSpace(String str) {
        int scnt= 0;
        char strch[] = str.toCharArray();
        for(char ch:strch){
            if(ch ==' '){
                scnt++;
            }
        }
        return scnt;
    }
    public static void main(String[] args) {
        String str= "hello world";
        withoutCharAtToPrintString(str);
        System.out.println();
        System.out.println("space count : "+findCountOfSpace(str));
    }
    
}

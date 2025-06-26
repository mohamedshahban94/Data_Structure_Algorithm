package stringbasics;

public class FindCountVowel {

    static int findCountVowel(String str) {
        int vcnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== 'a'||str.charAt(i)== 'e'||str.charAt(i)== 'i'||str.charAt(i)== 'o'||str.charAt(i)== 'u'||str.charAt(i)== 'A'||str.charAt(i)== 'E'||str.charAt(i)== 'I'||str.charAt(i)== 'O'||str.charAt(i)== 'U'){
                vcnt++;
            }
        }
        return vcnt;
    }
    public static void main(String[] args) {
        String str ="hello";
        System.out.println(str +" - Vowel Count: "+findCountVowel(str));
    }
}
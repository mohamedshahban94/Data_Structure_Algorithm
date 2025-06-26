package stringbasics;

public class CountCharacters {

    
    static void bruteforceCountCharacters(String str) {
        char strarr[] = str.toCharArray();
        for(int i=0;i<strarr.length;i++){
            int count =1;
            for(int j=i+1;j<strarr.length;j++){
                if(strarr[i]==strarr[j]){
                    strarr[j]=0;
                    // strarr[j]=Character.MIN_VALUE;
                    count++;
                }
            }
            // Character.MIN_VALUE 
            if(strarr[i]!=0){
                System.out.println( strarr[i] + "  :  "+ count);
            }
        }
    }
    static void betterCountCharacters(String str) {
        int hash[] = new int[128];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            hash[ch]++;
        }
        for(int j=0;j<hash.length;j++){
            if(hash[j]>0){
                System.out.println( (char)j +" - "+hash[j]);
            }
        }
    }
    public static void main(String[] args) {
        String str ="AABBBC";
        bruteforceCountCharacters(str);
        // betterCountCharacters(str);
    }
}
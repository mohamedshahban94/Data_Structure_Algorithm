
public class StringRotation {
    
    public static void main(String[] args) {
        System.out.println(bruteforceStringRotation("abcd","cdab"));
        System.out.println(betterStringRotation("abcd","cdab"));
        System.out.println(optimalStringRotation("abcd","cdab"));
        
    }

    private static boolean optimalStringRotation(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        s1=s1+s1;
        return s1.lastIndexOf(s2)>=0;
        
    }

    private static boolean betterStringRotation(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        else{
            return (s1+s1).contains(s2);
        }
    }

    private static boolean bruteforceStringRotation(String s1, String s2) {
        
        int n= s1.length();
        String res = s1;
        for(int i=0;i<s1.length();i++){
            char ch = res.charAt(0);
            res =res.substring(1,n)+ch; 
            // System.out.println(res);
            if(s2.equals(res)){
                return true;
            }
        }
        return false;
    }
}

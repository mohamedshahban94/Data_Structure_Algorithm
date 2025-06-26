
public class LargestOddNumString {
    public static void main(String[] args) {
        // System.out.println("-" + findLargestOddNumString("943532") + "-");
        // System.out.println(bruteforcefindLargestOddSubStrNumString("943532"));
        System.out.println(optimalfindLargestOddSubStrNumString("943532"));
    }


    private static String optimalfindLargestOddSubStrNumString(String s) {
        for(int i = s.length()-1;i>=0;i--){
            if((s.charAt(i)-'0')%2!=0 ){
                return s.substring(0, i+1);
            }
        }
        return "";
    }


    private static String bruteforcefindLargestOddSubStrNumString(String s) {
        int fmax = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            String val = "";
            for(int j=i;j<s.length();j++){
                val = val + s.charAt(j);
                int num = Integer.parseInt(val);
                if (num % 2 != 0) {
                    if (num > fmax) {
                        fmax = num;
                    }
            }
            }
        }
        return (fmax > 0) ? "" + fmax : "";
    }


    private static String findLargestOddNumString(String s) {
        int fmax = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            String val = "" + s.charAt(i);
            int num = Integer.parseInt(val);
            if (num % 2 != 0) {
                if (num > fmax) {
                    fmax = num;
                }
            }
        }
        return (fmax > 0) ? "" + fmax : "";
    }

}

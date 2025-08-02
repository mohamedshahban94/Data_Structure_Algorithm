
public class ValidPalindrome {

    public static void main(String[] args) {
        // System.out.println(checkAlphaNumeric(' '));
        boolean result = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(result);
        // System.out.println((int)'A'+" : " +(int)'a'+ " : "+ (int)'0');
        // System.out.println(97-65);

    }

    public static boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length()-1;

        while(left< right){

            while(left< right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
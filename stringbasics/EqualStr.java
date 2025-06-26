package stringbasics;

public class EqualStr {

    static boolean equalsMethod(String str1, String str2) {
        return (str1.equals(str2)) ? true : false;
    }

    static boolean equalsOperator(String str1, String str2) {
        return (str1 == str2) ? true : false;
    }

    static boolean equalsIgnoreCaseMethod(String str1, String str2) {
        return (str1.equalsIgnoreCase(str2)) ? true : false;
    }

    static boolean equalsWithoutBuiltinMethod(String str1, String str2) {
        boolean flag = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String newstr = new String("hello");

        // System.out.println(equalsMethod(str1, str2));

        // System.out.println(equalsMethod(str1, newstr)); --true
        // System.out.println(equalsOperator(str1, newstr)); --false
        // System.out.println(equalsIgnoreCaseMethod(str1, str2));--true

        System.out.println(equalsWithoutBuiltinMethod(str1, str2));
    }

}

public class ValidParanthesis {

    private static boolean checkValidParanthesis(String str) {

        int check = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                check++;
            } else {
                check--;
            }
        }
        return (check == 0) ? true : false;
    }

    private static String removeOuterMostParenthesis(String s) {
        StringBuilder res = new StringBuilder();
        int check = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.print(ch);
            System.out.print(check + " ");
            if (ch == ')') {
                check--;
            }
            if (check != 0) {
                // res = res + ch;
                res.append(ch);
            }
            if (ch == '(') {
                check++;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        // System.out.println(checkValidParanthesis("(()(())"));

        System.out.println(removeOuterMostParenthesis("(()(()))"));// (())(()())
    }
}

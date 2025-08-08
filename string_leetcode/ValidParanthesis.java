import java.util.List;
import java.util.Stack;

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

        // System.out.println(removeOuterMostParenthesis("(()(()))"));// (())(()())

        boolean valid = validParanthesis("({})");
        System.out.println(valid);

        // System.out.println((int)'{');
        // System.out.println((int)'}');

    }

    private static boolean validParanthesis(String s) {
        List<Character> stack = new Stack<Character>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.add(ch);
            } else {
                if (stack.isEmpty())
                    return false;
                char ch2 = stack.remove(stack.size() - 1);
                int chval = (int) ch;
                System.out.println("Ch :" + ch + "ch2 :" + ch2 + " chval:  " + chval);
                if ((chval != 41 && ch2 == '(') || (chval != 125 && ch2 == '{') || (chval != 93 && ch2 == '[')) //if ((c == ')' && open != '(') || (c == '}' && open != '{') || (c == ']' && open != '[')) 
                    return false;
            }
        }
        return (stack.isEmpty() ? true : false);
    }
}

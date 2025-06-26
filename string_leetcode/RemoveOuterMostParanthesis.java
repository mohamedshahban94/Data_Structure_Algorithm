
public class RemoveOuterMostParanthesis {

    static void removeOuterMostParanthesis(String str) {
        String s = "";
        for (int i = 0; i < str.length()-1; i++) {
            char ch = str.charAt(i);
            if (ch == str.charAt(i + 1)) {

            } else {
                s += ch;
            }
        }
        s=s+')';
        System.out.println(s);
    }

    public static void main(String[] args) {
        String str = "(()())(())"; // ()()
        removeOuterMostParanthesis(str);
    }
}

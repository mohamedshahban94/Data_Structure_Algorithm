// succesfully git auto push is set
public class MaximumNestingDepth {

    public static int maxDepth(String s) {
        int maxDepth = 0;
        int size = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')') {
                size = size - 1;
            }
            if (ch == '(') {
                size = size + 1;
            }
            maxDepth = Math.max(maxDepth, size);
            System.out.println(size);
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        // int res = maxDepth("()(())((()()))");
        // int res = maxDepth("(1)+((2))+(((3)))");
        // int res = maxDepth("(1+(2*3)+((8)/4))+1");
        int res = maxDepth("(1+(2*3)+((8+(5))/4))+1");

        System.out.println("RESULT: " + res);
    }
}
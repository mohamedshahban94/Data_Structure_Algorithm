
public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(bruteforcelongestCommonPrefix(new String[] { "geeksforgeeks", "geeks", "geek", "geezer" }));
        System.out.println(bruteforcelongestCommonPrefix(new String[] { "hello", "world" }));

    }

    public static String bruteforcelongestCommonPrefix(String arr[]) {
        // code here
        if (arr == null || arr.length == 0) {
            return "";
        }

        if (arr.length == 1) {
            return arr[0];
        }
        boolean flag = true;
        int i = 1;
        int ind = 0;
        while (flag) {
            for (i = 0; i < arr.length - 1; i++) {
                if (!(arr[i].charAt(ind) == arr[i + 1].charAt(ind))) {
                    flag = false;
                    break;
                }
            }
            ind++;
        }
        return arr[0].substring(0, ind-1);
    }
}

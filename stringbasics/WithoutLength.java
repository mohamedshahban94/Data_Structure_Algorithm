package stringbasics;

public class WithoutLength {

    public static void main(String[] args) {
        String str = "shahban";

        char strch[] = str.toCharArray();
        int len = 0;
        for (char ch : strch) {
            len++;
        }
        System.out.println(len);
    }
}

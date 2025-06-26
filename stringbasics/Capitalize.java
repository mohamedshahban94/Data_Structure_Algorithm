package stringbasics;

public class Capitalize {

    public static void main(String[] args) {
        String str = "hi vanka ka k hello  litte begger";
        // firstCapitalize(str);
        // lastCapitalize(str);
    }

    static void lastCapitalize(String str) {
        char strarr[] = str.toCharArray();
        String res = "";

        int s = 0;
        int i=0;
        for (i = 0; i < strarr.length-1; i++) {

            if (strarr[i+1] == ' ') {
                s++;
            }
            if ((strarr[i] >= 'a' && strarr[i] <= 'z') && (strarr[i] != ' ') && s >0) {
                res = res + (char) (strarr[i] - 32);
                s = 0;
            } else {
                res += (char) strarr[i];
            }
        }
        if(i == strarr.length-1){
            res = res + (char) (strarr[i] - 32);
        }
        System.out.println(res);
     }

    static void firstCapitalize(String str) {
        char strarr[] = str.toCharArray();
        String res = "";

        int s = 0;
        for (int i = 0; i < strarr.length; i++) {

            if (strarr[i] == ' ') {
                s++;
            }
            if (i == 0 || (strarr[i] >= 'a' && strarr[i] <= 'z') && (strarr[i] != ' ') && s >0) {
                res = res + (char) (strarr[i] - 32);
                s = 0;
            } else {
                res += (char) strarr[i];
            }
        }
        System.out.println(res);
    }
}

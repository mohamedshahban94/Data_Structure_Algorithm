package numbersystempack;

public class EuclideanAlgoGCD {

    static void MyownCode(int a, int b) {

        while (a > 0) {
            if(a<b){
                int temp =b;
                b=a;
                a=temp;
            }
            a = a % b;
        }
        if (a == 0)
            System.out.println(b);
        else
            System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        // MyownCode(a, b);
        while (a>0 && b>0) {
        if(a>b)
        a = a%b;
        else
        b =b%a;
        }
        if(a==0)
        System.out.println(b);
        else
        System.out.println(a);
    }
}
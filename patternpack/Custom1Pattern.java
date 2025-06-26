package patternpack;
import java.util.Scanner;

public class Custom1Pattern {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int n=6;
        int m=2*n -1;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if((i==n) ||(i==j)|| (i+j==n+n) || (j==1) || (j==m)){
                        System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println("");
        }
}
}

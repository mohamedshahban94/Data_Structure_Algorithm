package patternpack;
import java.util.Scanner;

public class LeftArrowPattern{
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int n=5;
        // sc.nextInt();
        int m=3;
        // sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if((j==n) ||(i+j==m+1)|| (i-j==m-1)){
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

package patternpack;
import java.util.Scanner;

public class Custom2Pattern {

    public static void main(String[] args) {
        
        int n=5;
        int m=2*n -1;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if((i==1) ||(j-i==n-1)|| (i+j==n+1) || (j==1) || (j==m)){
                        System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
}  
    
}


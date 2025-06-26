package patternpack;

public class Custom3Pattern {

    public static void main(String[] args) {
        
        int n=3;
        int m=2*n -1;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if((i==1 && j>=n) ||(i==n && j<=n)|| (i+j==n+1) || (i+j==n+n)){
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
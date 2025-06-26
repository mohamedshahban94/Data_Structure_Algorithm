package patternpack;
public class RightArrowPattern{
    public static void main(String[] args) {
        
    
        int n=5;
        int m=3;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if((j==1) ||(i+j==n+1)|| (i==j)){
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

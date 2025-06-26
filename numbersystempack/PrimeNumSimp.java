package numbersystempack;

public class PrimeNumSimp {
    public static void main(String[] args) {
        int n= 11;
        boolean flag=true;
        if(n==1){
            System.out.println("prime");
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag =false;
                break;
            }
        }
        if(flag){
            System.out.println("prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}

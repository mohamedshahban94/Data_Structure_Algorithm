package numbersystempack;

public class Recursion {

    static int sumOfSeries(int n) {
        // code here
        int sum =0;
        
        return recs(n,sum);
    }
    public static int recs(int n,int sum){
        if(n>0){
            sum = sum + (n *n* n); 
            n--;
            sum = recs(n,sum);
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }
}

package patternpack;
public class CustomPattern4 {

    public static void main(String[] args) {
        int n=3;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int count =1;
            for (int j = 1; j <= 2 * n - 1; j++){
                    
                    if((i<=j &&i+j<=2*n)||(i>=j && i+j>=2*n)){
                        if(j>=n){
                            System.out.print(count-- + " ");
                        }
                        else{
                            System.out.print(count++ + " ");
                        }
                    }
                    else{
                        System.out.print(" " + " ");
                    }
            } 
            System.out.println();
    }   
}
}

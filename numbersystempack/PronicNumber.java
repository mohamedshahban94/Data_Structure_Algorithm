package numbersystempack;
public class PronicNumber {
    public static void main(String[] args) {
        int num =30;
        boolean flag =false;

        for(int i=1;i<=num;i++){
            if(( i*(i+1)==num)){
                System.out.println("Pronic num : "+num);
                flag =true;
                break;
            }
            if((i*(i+1)<=num)){
               
            }
            else{
                break;
            }

            
        }
    }
}

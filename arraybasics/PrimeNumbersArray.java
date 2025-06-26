package arraybasics;

public class PrimeNumbersArray {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,1,7,8,9}; 
        int primeCount =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                continue;
            }
            boolean flag = true;
            for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primeCount++;
            }
        }
        System.out.println(primeCount);

    }
}
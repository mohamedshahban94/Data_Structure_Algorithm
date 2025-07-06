package arrays_leetcode;

public class CeilAndFloor {

    static void ceilAndFloor(int arr[], int x) {
        int f = -1;
        int c = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]< x){
                if(arr[i] > f && arr[i] < x){
                    f= arr[i];
                }else{
                    f = arr[i];
                }
            }
            if(arr[i]> x){
                if((arr[i] < c || c==-1) && arr[i]>x){
                     c = arr[i];
                }
            }
        }
        // if(contains(arr,x))
        System.out.println( f + " : " + c);
    }

    public static void main(String[] args) {

        ceilAndFloor(new int[] { 10, 9 , 8 , 6 ,8, 9, 6, 5, 5, 6 }, 5);
    }
}

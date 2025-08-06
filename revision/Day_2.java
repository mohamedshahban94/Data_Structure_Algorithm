package revision;

public class Day_2 {

    public static void main(String[] args) {
        int[] arr = { 0, 2, 4, -2, -8, 6, 8 };
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum<0){
                sum=0;
            }
            max = Math.max(max, sum);
            System.out.println(sum);
        }
        // int max1 = Integer.MIN_VALUE;
        // for(int num : arr){
        //     max1 = Math.max(max1, num);
        // }
        // System.out.println("MAX : "+ max1);
    }
}

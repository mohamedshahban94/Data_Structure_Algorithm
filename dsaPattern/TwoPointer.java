package dsaPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoPointer {

    static void twoPointer(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void bruteforceFindSubarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("");

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 21, 3, 40, 5 };
        // twoPointer(arr);
        // bruteforceFindSubarray(arr);// formula = [n*(n+1)/2]
    
        twoPointerBy2SubArrayMax(arr);
    }

    static void twoPointerBy2SubArrayMax(int[] arr) {
    
        int k=2;
        int i=0;
        int max2SubArray = 0;
        while(i<arr.length){
            int j=i;
            int sum=0;
            while(j<arr.length){
                sum =sum + arr[j]; 
                if((j-i)< k){
                    max2SubArray = Math.max(max2SubArray, sum);
                    j++;

                }
                else{
                    j++;
                    break;
                }
            }
            i++;
        }
        System.out.println(max2SubArray);
    }

}
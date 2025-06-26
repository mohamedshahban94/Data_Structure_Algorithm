package arraybasics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array : ");
            int size = sc.nextInt();

            int arr[] = new int[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter " + (i + 1) + " value: ");
                arr[i] = sc.nextInt();
            }
            int sum= 0;
            for (int i = 0; i < arr.length; i++)
            {
                sum += arr[i];
            }
            System.out.println(Arrays.toString(arr) + " : "+ sum);
            // Object obj[] = new Object[4];
            // obj[0] = 1;
            // obj[1] = 1.00;
            // obj[2] = "helleo";
            // obj[3] = 'A';
            // System.out.println(Arrays.toString(obj));
            int product =1;
            for (int i = 0; i < arr.length; i++)
            {
                product *= arr[i];
            }
            System.out.println(Arrays.toString(arr) + " : "+ product);

        } 
    }
}
package two2Darray;

import java.util.Scanner;

public class TwoDArray {
    
    static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
    }
    static int[][] getMatrix(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Row size:");
        int r =scan.nextInt();
        System.out.print("Enter col size:");
        int c =scan.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter "+i+" row");
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] =scan.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        
        // printMatrix(getMatrix());
        printMatrix(new int[][] {{1,2,3},{2,3},{3},{},{5}});
    }
}

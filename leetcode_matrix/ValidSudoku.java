package leetcode_matrix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    
    public static boolean isValidSudoku(String[][] board, String[] row, String[] col) {
        
        for(int i=0;i<board.length;i++){
            row[i] = "";
            for(int j=0;j<board.length;j++){
                if(board[i][j]!=".")
                row[i] = row[i]+ board[i][j]; 
            }
            
        }
        for(int i=0;i<row.length;i++){
            System.out.println(row[i]);
            if(checkDupicate(row[i])!=true){
                return false;
            }
        }
        return true;
    }

    private static boolean checkDupicate(String str) {
        
        boolean flag = true;
        Set<Character> check= new HashSet<Character>();
        for(int i=0;i<str.length();i++){
            if(!check.contains(str.charAt(i))){
                check.add(str.charAt(i));
                // System.out.println(check);
            }
            else{
                flag = false;
            }
        }
        
        return flag;
    }

    public static void main(String[] args) {
        String[] row =new String[9];
        String[] col =new String[9];
        String[][] board = {
            {"5","3",".",".","7",".",".",".","."}
            ,{"6",".",".","1","9","5",".",".","."}
            ,{".","9","8",".",".",".",".","6","."}
            ,{"8",".",".",".","6",".",".",".","3"}
            ,{"4",".",".","8",".","3",".",".","1"}
            ,{"7",".",".",".","2",".",".",".","6"}
            ,{".","6",".",".",".",".","2","8","."}
            ,{".",".",".","4","1","9",".",".","5"}
            ,{".",".",".",".","8",".",".","7","9"}
        };

        for(String[] array: board){
            System.out.println(Arrays.toString(array));
        }
        // boolean flag = isValidSudoku(board ,row,col);
        
        // System.out.println(checkDupicate("537"));

        System.out.println();
        
    }
}
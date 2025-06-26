package arraybasics;

public class PalindromeArray {

    public static void main(String[] args) {
        int arr[] = ArrayTest.getarr();
        // check palindrome
        int i = 0;
        int j = arr.length - 1;
        boolean flag = true;
        while (i < j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.print("Palindrome array : ");
            ArrayTest.displayarr(arr);
        } else {
            System.out.println("Not Palindrome Array");
            ArrayTest.displayarr(arr);
        }
    }

}

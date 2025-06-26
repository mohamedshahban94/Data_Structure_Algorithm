package arraybasics;

public class FindDigitsCountArray {

    public static void main(String[] args) {

        int arr[] = { -12, -111, -12, 23, -456, 765, 3, 1, 432, 1 };
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int count = 0;
            while (value != 0) {
                count++;
                value /= 10;
            }

            if (count == 3)// (value >99 && value< 1000 and -value also)
                count3++;
            else if (count == 2)//(value >9 && value< 100)
                count2++;
            else//(value >0 && value< 10)
                count1++;

        }
        System.out.println("Count 1 : " + count1 + "\nCount 2 : " + count2 + "\ncount 3 : " + count3);
    }

}

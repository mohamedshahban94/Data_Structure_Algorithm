package revision;

public class RevisionDay_1 {

    public static void main(String[] args) {

        int arr[] = { 7,4, 5, 6, 3, 2, 1,2, 3 };

        int fmax = findLargest(arr);
        int smax = findSecondMax(arr);
        boolean cSortArr = checkArraySorted(arr);
        int lenPrefix = checkPrefix(arr);

        System.out.println(lenPrefix);

        

    }

    private static int checkPrefix(int[] arr) {
        int prefixLen = 1;
        int maxPrefixLen = 1;
        //  7,4, 5, 6, 3, 2, 1,2, 3
        for(int i=1; i<arr.length;i++){
            int j = i-1;
            if(arr[j]==(arr[i]-1)){
                prefixLen++;
            }
            else{
                prefixLen = 1;
            }
            maxPrefixLen = Math.max(prefixLen, maxPrefixLen);
        }
        return maxPrefixLen;
    }

    private static int findLargest(int[] arr) {
        int fmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > fmax) {
                fmax = arr[i];
            }
        }
        return fmax;
    }

    private static int findSecondMax(int[] arr) {
        int fmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > fmax) {
                smax = fmax;
                fmax = arr[i];
            }
            if (arr[i] > smax && arr[i] < fmax) {
                smax = arr[i];
            }
        }
        return smax;
    }

     private 

     static boolean checkArraySorted(int[] arr) {

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }


}

package leetcode_arrays;

public class KadanesAlgo {

    static void bruteforceKadaneAlgo(int arr[]) {
        int i = 0;
        int maxsum = Integer.MIN_VALUE;
        while (i < arr.length) {
            int j = i;
            int sum = 0;
            while (j < arr.length) {
                sum = sum + arr[j];
                if (sum > maxsum) {
                    maxsum = sum;
                }
                j++;
            }
            i++;
        }
        System.out.println(maxsum);
    }

    static void optimalKadanesAlgo(int[] arr) {
        int maxsum = Integer.MIN_VALUE;
        int i = 0;
        int sum = 0;
        while (i < arr.length) {
            sum = sum + arr[i];
            if (sum < 0) {
                sum = 0;
            }
            maxsum = Math.max(maxsum, sum);
            i++;
        }
        int maxsum2 = Integer.MIN_VALUE;
        if (maxsum == 0) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > maxsum2) {
                    maxsum2 = arr[j];
                }
            }
            System.out.println(maxsum2);

        } else {
            System.out.println(maxsum);
        }

    }

    public static void main(String[] args) {
        int arr[] = { -2, -4, -1 }; // 2, 3, -8, 7, -1, 2, 3 // 5, 4, 1, 7, 8 //-2, -4
        bruteforceKadaneAlgo(arr);
        // optimalKadanesAlgo(arr);
    }

}

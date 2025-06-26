package arraybasics;

import java.sql.Array;
import java.util.Arrays;

public class ZIgZagMerge {
    public static void main(String[] args) {
        ZigZag();
    }

    private static void ZigZag() {
        int ar[] = { 10, 20, 30 };
        int br[] = { 40, 50, 60 };

        int i = 0, j = 0, k = 0;
        int cr[] = new int[ar.length + br.length];
        while (k < cr.length) {
            if (i < ar.length)
                cr[k++] = ar[i++];
            if (j < br.length)
                cr[k++] = br[j++];
        }
        System.out.println(Arrays.toString(cr));
    }

}

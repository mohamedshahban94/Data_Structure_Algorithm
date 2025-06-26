package hashingarray;

import java.util.HashMap;
import java.util.Map;

public class HashMapHashing {

    public static void Kthcount(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.values()); 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    static void countUseHashMap() {
        int arr[] = { 1, 3, 4, 7, 5, 4, 8 };

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
    }

    public static void main(String[] args) {

        int arr[] = { 3, 1, 4, 4, 5, 2, 6, 1 };
        Kthcount(arr);
    }
}

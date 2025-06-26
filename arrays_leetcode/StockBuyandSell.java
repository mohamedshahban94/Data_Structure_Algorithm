package arrays_leetcode;

public class StockBuyandSell {

    static void bruteforceStockBuyandSell(int[] arr) {
        int max_profit = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = (arr[j] - arr[i]);
                if (sum > max_profit) {
                    max_profit = sum;
                }
            }
        }
        System.out.println(max_profit);
    }

    static void optimalStockBuyandSell(int[] prices) {

        // specific for Only one profit

        int max_profit = 0;
        int buy = prices[0];
        for (int j = 1; j < prices.length; j++) {
            if (prices[j] < buy) {
                buy = prices[j];
            }
            int sell =prices[j];
            max_profit = Math.max(max_profit, (sell - buy));
        }
        System.out.println(max_profit);

        // specific for multiple profit

        // int max_profit = 0;
        // for (int i = 1; i < prices.length; i++) {
        //     if (prices[i] > prices[i - 1]) {
        //         max_profit += prices[i] - prices[i - 1]; // Buy at i-1, sell at i
        //     }
        // }
        // System.out.println(max_profit);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 2, 4 }; // 7,1,5,3,6,4 //100, 180, 260, 310, 40, 535, 695 //4, 2, 2, 2, 4
        // bruteforceStockBuyandSell(arr);
        optimalStockBuyandSell(arr);

    }
}

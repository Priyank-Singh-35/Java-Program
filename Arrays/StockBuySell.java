import java.util.*;
class StockBuySell {

    // Naive Approach
    /*
    // Function to return the maximum profit that can be made after buying and selling the given stocks
    static int maxProfitNaive(int price[], int start, int end) {
        // If the stocks can't be bought
        if (end <= start)
            return 0;

        // Initialise the profit
        int profit = 0;

        // The day at which the stock must be bought
        for (int i = start; i < end; i++) {
            // The day at which the stock must be sold
            for (int j = i + 1; j <= end; j++) {
                // If buying the stock at ith day and selling it at jth day is profitable
                if (price[j] > price[i]) {
                    // Update the current profit
                    int curr_profit = price[j] - price[i] + maxProfitNaive(price, start, i - 1) + maxProfitNaive(price, j + 1, end);
                    // Update the maximum profit so far
                    profit = Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }
    */

    // Efficient Approach (Valley Peak Approach)
    static int maxProfitEfficient(int price[], int n) {
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (price[i] > price[i - 1]) {
                profit += price[i] - price[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int price[] = {100, 180, 260, 310, 40, 535, 695};
        int n = price.length;

        // Uncomment to use the Naive Approach
        /*
        System.out.println("Using Naive Approach:");
        System.out.println("Maximum profit is " + maxProfitNaive(price, 0, n - 1));
        System.out.println("Time Complexity: O(n^2)");
        System.out.println("Auxiliary Space: O(1)");
        */

        // Using Efficient Approach
        System.out.println("Using Efficient Approach:");
        System.out.println("Maximum profit is " + maxProfitEfficient(price, n));
        System.out.println("Time Complexity: O(n)");
        System.out.println("Auxiliary Space: O(1)");
    }
}

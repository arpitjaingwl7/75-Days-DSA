public class Day12 {
    
}

// Solution class to find the maximum profit from stock prices
class Solution {
    // Method to find the maximum profit
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int ans = 0;

        // Iterate through the prices
        for (int i = 0; i < n; i++) {
            // Update the maximum profit
            ans = Math.max(ans, prices[i] - min);

            // Update the minimum price
            min = Math.min(min, prices[i]);
        }

        // Return the maximum profit
        return ans;
    }
}

// C++ Code //
/*

// Solution class to find the maximum profit from stock prices
class Solution {
public:
    // Method to find the maximum profit
    int maxProfit(std::vector<int>& prices) {
        int n = prices.size();
        int min = INT_MAX;
        int ans = 0;

        // Iterate through the prices
        for (int i = 0; i < n; i++) {
            // Update the maximum profit
            ans = std::max(ans, prices[i] - min);

            // Update the minimum price
            min = std::min(min, prices[i]);
        }

        // Return the maximum profit
        return ans;
    }
};


// Python Code //
class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        n = len(prices)
        min_price = float('inf')
        max_profit = 0

        # Iterate through the prices
        for i in range(n):
            # Update the maximum profit
            max_profit = max(max_profit, prices[i] - min_price)

            # Update the minimum price
            min_price = min(min_price, prices[i])

        # Return the maximum profit
        return max_profit

*/
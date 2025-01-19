public class Day19 {
    
}

// Solution class to find the maximum profit from stock prices
class Solution {
    // Method to find the maximum profit
    public int maxProfit(int[] prices) {
        int sum = 0;

        // Iterate through the prices
        for (int i = 1; i < prices.length; i++) {
            // If the current price is higher than the previous price, add the difference to the sum
            if (prices[i - 1] < prices[i]) {
                sum += prices[i] - prices[i - 1];
            }
        }

        // Return the maximum profit
        return sum;
    }
}

/* 
// C++ Code //
#include <vector>
#include <iostream>

// Solution class to find the maximum profit from stock prices
class Solution {
public:
    // Method to find the maximum profit
    int maxProfit(std::vector<int>& prices) {
        int sum = 0;

        // Iterate through the prices
        for (size_t i = 1; i < prices.size(); i++) {
            // If the current price is higher than the previous price, add the difference to the sum
            if (prices[i - 1] < prices[i]) {
                sum += prices[i] - prices[i - 1];
            }
        }

        // Return the maximum profit
        return sum;
    }
};



// Python Code //
class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        sum = 0

        # Iterate through the prices
        for i in range(1, len(prices)):
            # If the current price is higher than the previous price, add the difference to the sum
            if prices[i - 1] < prices[i]:
                sum += prices[i] - prices[i - 1]

        # Return the maximum profit
        return sum

*/
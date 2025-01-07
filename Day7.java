public class Day7 {
    
}

// Java Code //
class Solution {
    // Method to find the maximum subarray sum
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = Integer.MIN_VALUE;
        int curSum = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            curSum += nums[i];

            // Update the maximum sum
            sum = Math.max(sum, curSum);

            // If the current sum is negative, reset it to 0
            if (curSum < 0) {
                curSum = 0;
            }
        }

        // Return the maximum sum
        return sum;
    }
}

// C++ Code //
/*
 class Solution {
public:
    // Method to find the maximum subarray sum
    int maxSubArray(std::vector<int>& nums) {
        int n = nums.size();
        int sum = INT_MIN;
        int curSum = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            curSum += nums[i];

            // Update the maximum sum
            sum = std::max(sum, curSum);

            // If the current sum is negative, reset it to 0
            if (curSum < 0) {
                curSum = 0;
            }
        }

        // Return the maximum sum
        return sum;
    }
};
 */


//  Python Code //
/*
class Solution:
    def maxSubArray(self, nums: list[int]) -> int:
        n = len(nums)
        sum = float('-inf')
        curSum = 0

        # Iterate through the array
        for i in range(n):
            curSum += nums[i]

            # Update the maximum sum
            sum = max(sum, curSum)

            # If the current sum is negative, reset it to 0
            if curSum < 0:
                curSum = 0

        # Return the maximum sum
        return sum
}
*/
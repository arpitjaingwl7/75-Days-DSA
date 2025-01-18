public class Day18 {
    
}

// Solution class to find the maximum ascending subarray sum
class Solution {
    // Method to find the maximum ascending subarray sum
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int curSum = nums[0];

        // Iterate through the array
        for (int i = 1; i < nums.length; i++) {
            // If the current element is greater than the previous one, add it to the current sum
            if (nums[i - 1] < nums[i]) {
                curSum += nums[i];
                sum = Math.max(sum, curSum);
            } else {
                // Otherwise, reset the current sum to the current element
                curSum = nums[i];
                sum = Math.max(sum, curSum);
            }
        }
        return sum;
    }
}

// C++ Code //
/*

// Solution class to find the maximum ascending subarray sum
class Solution {
public:
    // Method to find the maximum ascending subarray sum
    int maxAscendingSum(std::vector<int>& nums) {
        int sum = nums[0];
        int curSum = nums[0];

        // Iterate through the array
        for (size_t i = 1; i < nums.size(); i++) {
            // If the current element is greater than the previous one, add it to the current sum
            if (nums[i - 1] < nums[i]) {
                curSum += nums[i];
                sum = std::max(sum, curSum);
            } else {
                // Otherwise, reset the current sum to the current element
                curSum = nums[i];
                sum = std::max(sum, curSum);
            }
        }
        return sum;
    }
};



// Python Code //
class Solution:
    def maxAscendingSum(self, nums: list[int]) -> int:
        sum = nums[0]
        cur_sum = nums[0]

        # Iterate through the array
        for i in range(1, len(nums)):
            # If the current element is greater than the previous one, add it to the current sum
            if nums[i - 1] < nums[i]:
                cur_sum += nums[i]
                sum = max(sum, cur_sum)
            else:
                # Otherwise, reset the current sum to the current element
                cur_sum = nums[i]
                sum = max(sum, cur_sum)

        return sum

*/
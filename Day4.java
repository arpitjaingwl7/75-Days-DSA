public class Day4 {
    
}

// Java Code //
class Solution {
    // Method to find indices of the two numbers that add up to the target
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;

        // Iterate through each pair of numbers in the array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of the current pair equals the target
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }     

        // Return the indices of the two numbers
        return ans;
    }
}

//C++ Code //
/*
  #include <vector>
#include <iostream>

// Solution class to find two numbers that add up to a target
class Solution {
public:
    // Method to find indices of the two numbers that add up to the target
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::vector<int> ans(2);
        int n = nums.size();

        // Iterate through each pair of numbers in the array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if the sum of the current pair equals the target
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }

        // Return the indices of the two numbers
        return ans;
    }
};
 */




// Python Code //
/*
class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        n = len(nums)
        ans = [0, 1]

        # Iterate through each pair of numbers in the array
        for i in range(n):
            for j in range(i + 1, n):
                # Check if the sum of the current pair equals the target
                if nums[i] + nums[j] == target:
                    ans[0] = i
                    ans[1] = j
                    break

        # Return the indices of the two numbers
        return ans

 */
public class Day6 {
    
}



// Java Solution
class Solution {
    // Method to check if you can jump to the last index
    public boolean canJump(int[] nums) {      
        int n = nums.length;
        int reachable = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current index is greater than the farthest reachable index, return false
            if (i > reachable) {
                return false;
            } else {
                // Update the farthest reachable index
                reachable = Math.max(reachable, i + nums[i]);
            }
        }
        
        // If the loop completes, return true
        return true;
    }
}




// C++ Code //
/*
  class Solution {
public:
    // Method to check if you can jump to the last index
    bool canJump(std::vector<int>& nums) {
        int n = nums.size();
        int reachable = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current index is greater than the farthest reachable index, return false
            if (i > reachable) {
                return false;
            } else {
                // Update the farthest reachable index
                reachable = std::max(reachable, i + nums[i]);
            }
        }

        // If the loop completes, return true
        return true;
    }
};
 */



// Python Code //
/*
 class Solution:
    def canJump(self, nums: list[int]) -> bool:
        n = len(nums)
        reachable = 0

        # Iterate through the array
        for i in range(n):
            # If the current index is greater than the farthest reachable index, return false
            if i > reachable:
                return False
            else:
                # Update the farthest reachable index
                reachable = max(reachable, i + nums[i])

        # If the loop completes, return true
        return True
 */
public class Day8 {
    
}

// Java Code //
class Solution {
    // Method to find the majority element
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        // Sort the array
        Arrays.sort(nums);
        
        // The majority element will be at the middle index after sorting
        return nums[n / 2];
    }
}



// c++ Code //
/* 
class Solution {
public:
    // Method to find the majority element
    int majorityElement(std::vector<int>& nums) {
        int n = nums.size();
        
        // Sort the array
        std::sort(nums.begin(), nums.end());
        
        // The majority element will be at the middle index after sorting
        return nums[n / 2];
    }
};




    // Python Code //
    /*
    class Solution:
        def majorityElement(self, nums: list[int]) -> int:
            n = len(nums)
            
            # Sort the array
            nums.sort()
            
            # The majority element will be at the middle index after sorting
            return nums[n // 2]
    */
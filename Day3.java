public class Day3 {
    
}


/*Java Sollution */
// Solution class to find the missing number in an array
class Solution {
    // Method to find the missing number
    public int missingNumber(int[] nums) {
        int n = nums.length;

        // Calculate the sum of the first n natural numbers
        int sumNatural = n * (n + 1) / 2;

        int sum = 0;

        // Calculate the sum of the elements in the array
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        
        // The missing number is the difference between the sum of the first n natural numbers and the sum of the elements in the array
        return sumNatural - sum;
    }
}



//C++ Code //
/*
class Solution {
public:
    // Method to find the missing number
    int missingNumber(std::vector<int>& nums) {
        int n = nums.size();

        // Calculate the sum of the first n natural numbers
        int sumNatural = n * (n + 1) / 2;

        int sum = 0;

        // Calculate the sum of the elements in the array
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        
        // The missing number is the difference between the sum of the first n natural numbers and the sum of the elements in the array
        return sumNatural - sum;
    }
};
 */


 
   // Python Code //

   /*
   class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        n = len(nums)

        # Calculate the sum of the first n natural numbers
        sum_natural = n * (n + 1) // 2

        # Calculate the sum of the elements in the array
        sum_nums = sum(nums)
        
        # The missing number is the difference between the sum of the first n natural numbers and the sum of the elements in the array
        return sum_natural - sum_nums

    */
public class Day5 {
    
}

// Java Code //
class Solution {
    // Method to add one to the number
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate through the digits from the end to the beginning
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it by 1 and return the array
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } 
            // If the current digit is 9, set it to 0
            else {
                digits[i] = 0;
            }
        }

        // If all digits were 9, create a new array with an extra digit
        int[] ans = new int[n + 1];
        ans[0] = 1; // Set the first digit to 1

        return ans;
    }
}





// c++ code //
/*class Solution {
public:
    // Method to add one to the number
    std::vector<int> plusOne(std::vector<int>& digits) {
        int n = digits.size();

        // Iterate through the digits from the end to the beginning
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it by 1 and return the array
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } 
            // If the current digit is 9, set it to 0
            else {
                digits[i] = 0;
            }
        }

        // If all digits were 9, create a new array with an extra digit
        std::vector<int> ans(n + 1, 0);
        ans[0] = 1; // Set the first digit to 1

        return ans;
    }
};


*/



// Python Code //
/*
class Solution:
    def plusOne(self, digits: list[int]) -> list[int]:
        n = len(digits)

        # Iterate through the digits from the end to the beginning
        for i in range(n - 1, -1, -1):
            # If the current digit is less than 9, increment it by 1 and return the array
            if digits[i] < 9:
                digits[i] += 1
                return digits
            # If the current digit is 9, set it to 0
            else:
                digits[i] = 0

        # If all digits were 9, create a new array with an extra digit
        ans = [0] * (n + 1)
        ans[0] = 1  # Set the first digit to 1

        return ans

 */
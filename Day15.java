public class Day15 {
    
}

// Solution class to find two numbers that add up to a target in a sorted array
class Solution {
    // Method to find indices of the two numbers that add up to the target
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        int j = n - 1;
        int[] ans = new int[2];

        // Use two pointers to find the two numbers
        while (j > i) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                ans[0] = i + 1;
                ans[1] = j + 1;
                break;
            }
        }
        return ans;
    }
}

// C++ Code //
/* 

// Solution class to find two numbers that add up to a target in a sorted array
class Solution {
public:
    // Method to find indices of the two numbers that add up to the target
    std::vector<int> twoSum(std::vector<int>& numbers, int target) {
        int n = numbers.size();
        int i = 0;
        int j = n - 1;
        std::vector<int> ans(2);

        // Use two pointers to find the two numbers
        while (j > i) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                ans[0] = i + 1;
                ans[1] = j + 1;
                break;
            }
        }
        return ans;
    }
};


// Python Code //
class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        n = len(numbers)
        i, j = 0, n - 1

        # Use two pointers to find the two numbers
        while j > i:
            if numbers[i] + numbers[j] > target:
                j -= 1
            elif numbers[i] + numbers[j] < target:
                i += 1
            else:
                return [i + 1, j + 1]
*/
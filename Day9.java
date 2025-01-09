public class Day9 {
    
}

// Solution class to sort colors using the Dutch National Flag algorithm
class Solution {
    // Method to sort colors
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int k = n - 1;

        // Iterate through the array
        while (k >= j) {
            if (nums[j] == 2) {
                // Swap the current element with the element at index k
                swap(nums, j, k);
                k--;
            } else if (nums[j] == 1) {
                j++;
            } else {
                // Swap the current element with the element at index i
                swap(nums, i, j);
                i++;
                j++;
            }
        }
    }

    // Helper method to swap two elements in the array
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


// C++ Code//
/*


// Solution class to sort colors using the Dutch National Flag algorithm
class Solution {
public:
    // Method to sort colors
    void sortColors(std::vector<int>& nums) {
        int n = nums.size();
        int i = 0;
        int j = 0;
        int k = n - 1;

        // Iterate through the array
        while (k >= j) {
            if (nums[j] == 2) {
                // Swap the current element with the element at index k
                std::swap(nums[j], nums[k]);
                k--;
            } else if (nums[j] == 1) {
                j++;
            } else {
                // Swap the current element with the element at index i
                std::swap(nums[i], nums[j]);
                i++;
                j++;
            }
        }
    }
};





//python Code

class Solution:
    def sortColors(self, nums: list[int]) -> None:
        n = len(nums)
        i = 0
        j = 0
        k = n - 1

        # Iterate through the array
        while k >= j:
            if nums[j] == 2:
                # Swap the current element with the element at index k
                nums[j], nums[k] = nums[k], nums[j]
                k -= 1
            elif nums[j] == 1:
                j += 1
            else:
                # Swap the current element with the element at index i
                nums[i], nums[j] = nums[j], nums[i]
                i += 1
                j += 1




 */
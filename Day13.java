public class Day13 {
    
}

// NumArray class to handle range sum queries
class NumArray {
    int[] arr;

    // Constructor to initialize the NumArray with prefix sums
    public NumArray(int[] nums) {
        int n = nums.length;
        arr = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            arr[i] = sum;
        }
    }

    // Method to get the sum of elements between indices left and right (inclusive)
    public int sumRange(int left, int right) {
        if (left == 0) {
            return arr[right];
        }
        return arr[right] - arr[left - 1];
    }
}

// C++ Code //
/* 
// NumArray class to handle range sum queries
class NumArray {
public:
    std::vector<int> arr;

    // Constructor to initialize the NumArray with prefix sums
    NumArray(std::vector<int>& nums) {
        int n = nums.size();
        arr.resize(n);

        std::partial_sum(nums.begin(), nums.end(), arr.begin());
    }

    // Method to get the sum of elements between indices left and right (inclusive)
    int sumRange(int left, int right) {
        if (left == 0) {
            return arr[right];
        }
        return arr[right] - arr[left - 1];
    }
};



// Python Code //
class NumArray:
    def __init__(self, nums: list[int]):
        n = len(nums)
        self.arr = [0] * n

        sum = 0
        for i in range(n):
            sum += nums[i]
            self.arr[i] = sum

    def sumRange(self, left: int, right: int) -> int:
        if left == 0:
            return self.arr[right]
        return self.arr[right] - self.arr[left - 1]

*/
public class Day14 {
    
}

// Solution class to calculate the amount of trapped rainwater
class Solution {
    // Method to calculate the amount of trapped rainwater
    public int trap(int[] height) {
        int n = height.length;

        // Step 1 - Create LMax Array
        int[] LMax = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            LMax[i] = max;
            max = Math.max(max, height[i]);
        }

        // Step 2 - Create RMax Array
        int[] RMax = new int[n];
        max = 0;
        for (int i = n - 1; i >= 0; i--) {
            RMax[i] = max;
            max = Math.max(max, height[i]);
        }

        // Step 3 - Calculate water that can be trapped at each index
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int l = LMax[i];
            int r = RMax[i];
            int res = Math.min(l, r);

            if (height[i] <= res) {
                ans += res - height[i];
            }
        }

        return ans;
    }
}

// C++ Code //
/* 

// Solution class to calculate the amount of trapped rainwater
class Solution {
public:
    // Method to calculate the amount of trapped rainwater
    int trap(std::vector<int>& height) {
        int n = height.size();

        // Step 1 - Create LMax Array
        std::vector<int> LMax(n);
        int max = 0;
        for (int i = 0; i < n; i++) {
            LMax[i] = max;
            max = std::max(max, height[i]);
        }

        // Step 2 - Create RMax Array
        std::vector<int> RMax(n);
        max = 0;
        for (int i = n - 1; i >= 0; i--) {
            RMax[i] = max;
            max = std::max(max, height[i]);
        }

        // Step 3 - Calculate water that can be trapped at each index
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int l = LMax[i];
            int r = RMax[i];
            int res = std::min(l, r);

            if (height[i] <= res) {
                ans += res - height[i];
            }
        }

        return ans;
    }
};



// Python Code //
class Solution:
    def trap(self, height: list[int]) -> int:
        n = len(height)

        # Step 1 - Create LMax Array
        LMax = [0] * n
        max_height = 0
        for i in range(n):
            LMax[i] = max_height
            max_height = max(max_height, height[i])

        # Step 2 - Create RMax Array
        RMax = [0] * n
        max_height = 0
        for i in range(n - 1, -1, -1):
            RMax[i] = max_height
            max_height = max(max_height, height[i])

        # Step 3 - Calculate water that can be trapped at each index
        ans = 0
        for i in range(n):
            l = LMax[i]
            r = RMax[i]
            res = min(l, r)

            if height[i] <= res:
                ans += res - height[i]

        return ans

*/
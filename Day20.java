

import java.util.HashMap;

// Java Code //
class Solution {
    // Method to find the lucky integer in the array
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Count the frequency of each element in the array
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        // Iterate over the HashMap to find the lucky integer
        int ans = -1;
        for (int key : hm.keySet()) {
            if (hm.get(key) == key) {
                ans = Math.max(ans, key);
            }
        }

        return ans;
    }
}

// C++ Code //
/* 

// Solution class to find the lucky integer in the array
class Solution {
public:
    // Method to find the lucky integer
    int findLucky(std::vector<int>& arr) {
        std::unordered_map<int, int> hm;

        // Count the frequency of each element in the array
        for (int num : arr) {
            hm[num]++;
        }

        // Iterate over the HashMap to find the lucky integer
        int ans = -1;
        for (const auto& pair : hm) {
            if (pair.second == pair.first) {
                ans = std::max(ans, pair.first);
            }
        }

        return ans;
    }
};



// Python Code //
class Solution:
    def findLucky(self, arr: list[int]) -> int:
        from collections import Counter
        count = Counter(arr)

        # Iterate over the Counter to find the lucky integer
        ans = -1
        for key, value in count.items():
            if key == value:
                ans = max(ans, key)

        return ans
*/
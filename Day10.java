public class Day10 {
    
}

// Solution class to merge overlapping intervals
class Solution {
    // Method to merge overlapping intervals
    public int[][] merge(int[][] intervals) {
        // Sort the intervals based on the starting times
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        int n = intervals.length;
        ArrayList<int[]> al = new ArrayList<>();

        // Iterate through the intervals
        for (int i = 0; i < n; i++) {
            int st = intervals[i][0];
            int en = intervals[i][1];
            int s = al.size();

            // If the list is empty or the current interval does not overlap with the previous one, add it to the list
            if (s == 0 || al.get(s - 1)[1] < st) {
                al.add(intervals[i]);
            } else {
                // Merge the current interval with the previous one
                al.get(s - 1)[1] = Math.max(al.get(s - 1)[1], en);
            }
        }

        // Convert the list to an array and return it
        return al.toArray(new int[al.size()][]);
    }
}
/* 
// C++ Code //


// Solution class to merge overlapping intervals
class Solution {
public:
    // Method to merge overlapping intervals
    std::vector<std::vector<int>> merge(std::vector<std::vector<int>>& intervals) {
        // Sort the intervals based on the starting times
        std::sort(intervals.begin(), intervals.end(), [](const std::vector<int>& a, const std::vector<int>& b) {
            return a[0] < b[0];
        });

        std::vector<std::vector<int>> merged;

        // Iterate through the intervals
        for (const auto& interval : intervals) {
            // If the list is empty or the current interval does not overlap with the previous one, add it to the list
            if (merged.empty() || merged.back()[1] < interval[0]) {
                merged.push_back(interval);
            } else {
                // Merge the current interval with the previous one
                merged.back()[1] = std::max(merged.back()[1], interval[1]);
            }
        }

        // Return the merged intervals
        return merged;
    }
};



// Python Code //
class Solution:
    def merge(self, intervals: list[list[int]]) -> list[list[int]]:
        # Sort the intervals based on the starting times
        intervals.sort(key=lambda x: x[0])

        merged = []

        # Iterate through the intervals
        for interval in intervals:
            # If the list is empty or the current interval does not overlap with the previous one, add it to the list
            if not merged or merged[-1][1] < interval[0]:
                merged.append(interval)
            else:
                # Merge the current interval with the previous one
                merged[-1][1] = max(merged[-1][1], interval[1])

        # Return the merged intervals
        return merged


*/
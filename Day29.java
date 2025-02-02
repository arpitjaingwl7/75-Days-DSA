public class Day29 {
    
}

// Solution class to count the number of rods that have all three colors
class Solution {
    // Method to count the number of rods that have all three colors
    public int countPoints(String rings) {
        int[] r = new int[10];
        int[] g = new int[10];
        int[] b = new int[10];

        // Iterate through the rings string
        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i); // B
            int a = (int) rings.charAt(i + 1) - '0';

            // Update the corresponding color array
            if (color == 'R') {
                r[a] = 1;
            } else if (color == 'G') {
                g[a] = 1;
            } else {
                b[a] = 1;
            }
        }

        int count = 0;

        // Count the number of rods that have all three colors
        for (int i = 0; i <= 9; i++) {
            if (r[i] == 1 && g[i] == 1 && b[i] == 1) {
                count++;
            }
        }
        return count;
    }
}

// C++ Code //
/* 
#include <string>
#include <vector>
#include <iostream>

// Solution class to count the number of rods that have all three colors
class Solution {
public:
    // Method to count the number of rods that have all three colors
    int countPoints(const std::string& rings) {
        std::vector<int> r(10, 0);
        std::vector<int> g(10, 0);
        std::vector<int> b(10, 0);

        // Iterate through the rings string
        for (size_t i = 0; i < rings.length(); i += 2) {
            char color = rings[i];
            int a = rings[i + 1] - '0';

            // Update the corresponding color array
            if (color == 'R') {
                r[a] = 1;
            } else if (color == 'G') {
                g[a] = 1;
            } else {
                b[a] = 1;
            }
        }

        int count = 0;

        // Count the number of rods that have all three colors
        for (int i = 0; i <= 9; i++) {
            if (r[i] == 1 && g[i] == 1 && b[i] == 1) {
                count++;
            }
        }
        return count;
    }
};



// Python Code //
class Solution:
    def countPoints(self, rings: str) -> int:
        r = [0] * 10
        g = [0] * 10
        b = [0] * 10

        # Iterate through the rings string
        for i in range(0, len(rings), 2):
            color = rings[i]
            a = int(rings[i + 1])

            # Update the corresponding color array
            if color == 'R':
                r[a] = 1
            elif color == 'G':
                g[a] = 1
            else:
                b[a] = 1

        count = 0

        # Count the number of rods that have all three colors
        for i in range(10):
            if r[i] == 1 and g[i] == 1 and b[i] == 1:
                count += 1

        return count

*/
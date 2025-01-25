public class Day25 {
    
}

// Solution class to find the minimum moves to convert string s
class Solution {
    // Method to find the minimum moves
    public int minimumMoves(String s) {
        int count = 0;
        int i = 0;

        // Iterate through the string
        while (i < s.length()) {
            char ch = s.charAt(i);

            // If the character is 'X', increment the count and skip the next two characters
            if (ch == 'X') {
                count++;
                i += 3;
            } else {
                i++;
            }
        }
        return count;
    }
}

// C++ Code //
/* 
// Solution class to find the minimum moves to convert string s
class Solution {
public:
    // Method to find the minimum moves
    int minimumMoves(const std::string& s) {
        int count = 0;
        int i = 0;

        // Iterate through the string
        while (i < s.length()) {
            char ch = s[i];

            // If the character is 'X', increment the count and skip the next two characters
            if (ch == 'X') {
                count++;
                i += 3;
            } else {
                i++;
            }
        }
        return count;
    }
};



// Python Code //
class Solution:
    def minimumMoves(self, s: str) -> int:
        count = 0
        i = 0

        # Iterate through the string
        while i < len(s):
            ch = s[i]

            # If the character is 'X', increment the count and skip the next two characters
            if ch == 'X':
                count += 1
                i += 3
            else:
                i += 1

        return count

*/
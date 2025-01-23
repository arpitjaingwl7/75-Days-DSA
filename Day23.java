public class Day23 {
    
}

// Solution class to find the length of the last word in a string
class Solution {
    // Method to find the length of the last word
    public int lengthOfLastWord(String s) {
        int count = 0;

        // Iterate through the string from the end to the beginning
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            // If the character is not a space, increment the count
            if (ch != ' ') {
                count++;
            }
            // If the character is a space and the count is not zero, return the count
            else if (count != 0 && ch == ' ') {
                return count;
            }
        }

        // Return the count
        return count;
    }
}

// C++ Code //
/* 

// Solution class to find the length of the last word in a string
class Solution {
public:
    // Method to find the length of the last word
    int lengthOfLastWord(const std::string& s) {
        int count = 0;

        // Iterate through the string from the end to the beginning
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s[i];

            // If the character is not a space, increment the count
            if (ch != ' ') {
                count++;
            }
            // If the character is a space and the count is not zero, return the count
            else if (count != 0 && ch == ' ') {
                return count;
            }
        }

        // Return the count
        return count;
    }
};


// Python Code //
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        count = 0

        # Iterate through the string from the end to the beginning
        for i in range(len(s) - 1, -1, -1):
            ch = s[i]

            # If the character is not a space, increment the count
            if ch != ' ':
                count += 1
            # If the character is a space and the count is not zero, return the count
            elif count != 0 and ch == ' ':
                return count

        # Return the count
        return count


*/
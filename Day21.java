public class Day21 {
    
}

// Solution class to reverse the words in a string
class Solution {
    // Method to reverse the words in a string
    public String reverseWords(String s) {
        // Split the string by whitespace
        String[] arr = s.split("\\s+");

        int n = arr.length;
        String ans = "";

        // Iterate through the array of words in reverse order
        for (int i = n - 1; i >= 0; i--) {
            ans = ans + arr[i] + " ";
        }

        // Return the reversed string, trimmed of any leading or trailing whitespace
        return ans.trim();
    }
}

// C++ Code //
/*  
// Solution class to reverse the words in a string
class Solution {
public:
    // Method to reverse the words in a string
    std::string reverseWords(std::string s) {
        std::istringstream iss(s);
        std::vector<std::string> words;
        std::string word;

        // Split the string by whitespace
        while (iss >> word) {
            words.push_back(word);
        }

        // Reverse the order of the words
        std::reverse(words.begin(), words.end());

        // Join the words back into a single string
        std::string ans;
        for (const auto& w : words) {
            ans += w + " ";
        }

        // Return the reversed string, trimmed of any leading or trailing whitespace
        if (!ans.empty()) {
            ans.pop_back();
        }
        return ans;
    }
};



// Python Code //
class Solution:
    def reverseWords(self, s: str) -> str:
        # Split the string by whitespace and reverse the order of the words
        words = s.split()
        words.reverse()

        # Join the words back into a single string
        return ' '.join(words)
*/
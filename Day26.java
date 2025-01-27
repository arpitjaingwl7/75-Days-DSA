public class Day26 {
    
}

// Solution class to check if a string is a palindrome
class Solution {
    // Method to check if a string is a palindrome
    public boolean isPalindrome(String s) {
        // Step 1 - Make string alphanumeric
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                str += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                str += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                str += ch;
            }
        }

        // Step 2 - Convert all characters to lowercase
        str = str.toLowerCase();

        // Step 3 - Check if the string is a palindrome
        int a = 0;
        int b = str.length() - 1;
        while (b > a) {
            if (str.charAt(a) != str.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
/* 
// C++ Code //


// Solution class to check if a string is a palindrome
class Solution {
public:
    // Method to check if a string is a palindrome
    bool isPalindrome(const std::string& s) {
        // Step 1 - Make string alphanumeric
        std::string str;
        for (char ch : s) {
            if (std::isalnum(ch)) {
                str += std::tolower(ch);
            }
        }

        // Step 2 - Check if the string is a palindrome
        int a = 0;
        int b = str.length() - 1;
        while (b > a) {
            if (str[a] != str[b]) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
};



// Python Code //
class Solution:
    def isPalindrome(self, s: str) -> bool:
        # Step 1 - Make string alphanumeric and convert to lowercase
        str = ''.join(ch.lower() for ch in s if ch.isalnum())

        # Step 2 - Check if the string is a palindrome
        return str == str[::-1]

*/
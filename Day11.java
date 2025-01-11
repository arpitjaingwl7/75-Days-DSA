public class Day11 {
    
}

// Solution class to check if a number is a palindrome
class Solution {
    // Method to check if a number is a palindrome
    public boolean isPalindrome(int x) {
        int n = x;
        if (x < 0) {
            return false;
        }
        int num = 0;

        // Reverse the number
        while (n > 0) {
            int digit = n % 10;
            num = num * 10 + digit;
            n = n / 10;
        }

        // Check if the reversed number is equal to the original number
        return num == x;
    }
}

// C++ Code //
/* 

// Solution class to check if a number is a palindrome
class Solution {
public:
    // Method to check if a number is a palindrome
    bool isPalindrome(int x) {
        int n = x;
        if (x < 0) {
            return false;
        }
        int num = 0;

        // Reverse the number
        while (n > 0) {
            int digit = n % 10;
            num = num * 10 + digit;
            n = n / 10;
        }

        // Check if the reversed number is equal to the original number
        return num == x;
    }
};



// Python Code //
class Solution:
    def isPalindrome(self, x: int) -> bool:
        n = x
        if x < 0:
            return False
        num = 0

        # Reverse the number
        while n > 0:
            digit = n % 10
            num = num * 10 + digit
            n = n // 10

        # Check if the reversed number is equal to the original number
        return num == x



*/
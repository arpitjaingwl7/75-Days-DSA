public class Day2 {
    public static void main(String[] args) {
      
    }
}


// Java Sollution
class Solution {
    // Method to check if you can win Nim game
    public boolean canWinNim(int n) {
        // If the number of stones is a multiple of 4, you cannot win
        if (n % 4 == 0) {
            return false;
        }
        // Otherwise, you can win
        return true;
    }
}




//C++ Code //
/* 

#include <iostream>

class Solution {
public:
    bool canWinNim(int n) {
        // If the number of stones is a multiple of 4, you cannot win
        if (n % 4 == 0) {
            return false;
        }
        // Otherwise, you can win
        return true;
    }
};


*/




// python code

/*
  class Solution:
    def canWinNim(self, n: int) -> bool:
        # If the number of stones is a multiple of 4, you cannot win
        if n % 4 == 0:
            return False
        # Otherwise, you can win
        return True


 */

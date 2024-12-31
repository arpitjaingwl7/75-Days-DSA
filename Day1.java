public class Day1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// Solution class to determine if a number is an ugly number
class Solution {
    // Method to check if a number is ugly
    public boolean isUgly(int n) {  
        // If the number is 0, it is not an ugly number
        if (n == 0) {
            return false;
        }
        
        // Divide the number by 2 as long as it is divisible by 2
        while (n % 2 == 0) {
            n = n / 2;
        }
        
        // Divide the number by 3 as long as it is divisible by 3
        while (n % 3 == 0) {
            n = n / 3;
        }
        
        // Divide the number by 5 as long as it is divisible by 5
        while (n % 5 == 0) {
            n = n / 5;
        }
        
        // If the number is reduced to 1, it is an ugly number
        return n == 1;
    }
}



/*
   //C++ Code //

  #include <iostream>

class Solution {
public:
    bool isUgly(int n) {
        if (n == 0) return false;
        
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        
        return n == 1;
    }
};

 
 */



 /*
   // Python Code //
   
    class Solution:
    def isUgly(self, n: int) -> bool:
        if n == 0:
            return False
        
        for p in [2, 3, 5]:
            while n % p == 0:
                n //= p
        
        return n == 1

  */
public class Day24 {
    
}

// Solution class to check if two strings are anagrams
class Solution {
    // Method to check if two strings are anagrams
    public boolean isAnagram(String s, String t) {
        // If the lengths of the strings are not equal, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Calculate the frequency of each character in string s and update in map
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Check the frequency of each character in string t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
            } else {
                return false;
            }
        }

        // If the map is empty, the strings are anagrams
        return map.size() == 0;
    }
}

// C++ Code //
/* 

// Solution class to check if two strings are anagrams
class Solution {
public:
    // Method to check if two strings are anagrams
    bool isAnagram(const std::string& s, const std::string& t) {
        // If the lengths of the strings are not equal, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Calculate the frequency of each character in string s and update in map
        std::unordered_map<char, int> map;
        for (char ch : s) {
            map[ch]++;
        }

        // Check the frequency of each character in string t
        for (char ch : t) {
            if (map.find(ch) != map.end()) {
                map[ch]--;
                if (map[ch] == 0) {
                    map.erase(ch);
                }
            } else {
                return false;
            }
        }

        // If the map is empty, the strings are anagrams
        return map.empty();
    }
};

int main() {
    Solution solution;
    std::string s = "anagram";
    std::string t = "nagaram";
    std::cout << std::boolalpha << solution.isAnagram(s, t) << std::endl; // Output: true
    return 0;
}

// Python Code //
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # If the lengths of the strings are not equal, they cannot be anagrams
        if len(s) != len(t):
            return False

        # Calculate the frequency of each character in string s and update in map
        from collections import Counter
        count_s = Counter(s)
        count_t = Counter(t)

        # If the frequency counts are equal, the strings are anagrams
        return count_s == count_t

*/
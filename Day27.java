
public class Day27 {
    
}

// Solution class to check if all characters in the words can be made equal
class Solution {
    // Method to check if all characters in the words can be made equal
    public boolean makeEqual(String[] words) {
        HashMap<Character, Integer> hm = new HashMap<>();

        // Step 1 -> Update frequency of each character in HashMap
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }
        }

        // Step 2 -> Iterate over HashMap and check if frequency is divisible by n
        int n = words.length;
        for (char key : hm.keySet()) {
            if (hm.get(key) % n != 0) {
                return false;
            }
        }
        return true;
    }
}

// C++ Code //
/* 

// Solution class to check if all characters in the words can be made equal
class Solution {
public:
    // Method to check if all characters in the words can be made equal
    bool makeEqual(std::vector<std::string>& words) {
        std::unordered_map<char, int> hm;

        // Step 1 -> Update frequency of each character in HashMap
        for (const auto& word : words) {
            for (char ch : word) {
                hm[ch]++;
            }
        }

        // Step 2 -> Iterate over HashMap and check if frequency is divisible by n
        int n = words.size();
        for (const auto& pair : hm) {
            if (pair.second % n != 0) {
                return false;
            }
        }
        return true;
    }
};



// Python Code //
class Solution:
    def makeEqual(self, words: list[str]) -> bool:
        from collections import Counter
        hm = Counter()

        # Step 1 -> Update frequency of each character in HashMap
        for word in words:
            hm.update(word)

        # Step 2 -> Iterate over HashMap and check if frequency is divisible by n
        n = len(words)
        for count in hm.values():
            if count % n != 0:
                return False
        return True

*/
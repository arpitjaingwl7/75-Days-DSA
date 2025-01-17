public class Day17 {
    
}

// Solution class to rotate a matrix
class Solution {
    // Method to rotate the matrix
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1 - Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2 - Reverse every row of the matrix
        for (int i = 0; i < n; i++) {
            int[] row = matrix[i];
            int j = 0;
            int k = n - 1;
            while (k > j) {
                int temp = row[j];
                row[j] = row[k];
                row[k] = temp;
                j++;
                k--;
            }
        }
    }
}

// C++ Code //
/* 

// Solution class to rotate a matrix
class Solution {
public:
    // Method to rotate the matrix
    void rotate(std::vector<std::vector<int>>& matrix) {
        int n = matrix.size();

        // Step 1 - Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                std::swap(matrix[i][j], matrix[j][i]);
            }
        }

        // Step 2 - Reverse every row of the matrix
        for (int i = 0; i < n; i++) {
            std::reverse(matrix[i].begin(), matrix[i].end());
        }
    }
};



// Python Code //
class Solution:
    def rotate(self, matrix: list[list[int]]) -> None:
        n = len(matrix)

        # Step 1 - Transpose the matrix
        for i in range(n):
            for j in range(i):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

        # Step 2 - Reverse every row of the matrix
        for i in range(n):
            matrix[i].reverse()
*/
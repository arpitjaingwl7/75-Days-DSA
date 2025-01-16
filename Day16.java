public class Day16 {
    
}

// Solution class to transpose a matrix
class Solution {
    // Method to transpose a non-square matrix
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] ans = new int[m][n];

        // Iterate through the matrix and transpose it
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = matrix[j][i];
            }
        }

        return ans;
    }
}



// GFG problem Solution
// Solution class to transpose a square matrix (GFG solution)
class SolutionSquare {
    // Method to transpose a square matrix
    public void transpose(int n, int[][] mat) {
        // Iterate through the matrix and transpose it
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int x = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = x;
            }
        }
    }
}

// C++ Code //
/* 

// Solution class to transpose a matrix
class Solution {
public:
    // Method to transpose a non-square matrix
    std::vector<std::vector<int>> transpose(std::vector<std::vector<int>>& matrix) {
        int n = matrix.size();
        int m = matrix[0].size();

        std::vector<std::vector<int>> ans(m, std::vector<int>(n));

        // Iterate through the matrix and transpose it
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = matrix[j][i];
            }
        }

        return ans;
    }


//GFG problem Solution
    // Method to transpose a square matrix
    void transposeSquare(int n, std::vector<std::vector<int>>& mat) {
        // Iterate through the matrix and transpose it
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                std::swap(mat[i][j], mat[j][i]);
            }
        }
    }
};



// Python Code //
class Solution:
    def transpose(self, matrix: list[list[int]]) -> list[list[int]]:
        n = len(matrix)
        m = len(matrix[0])

        ans = [[0] * n for _ in range(m)]

        # Iterate through the matrix and transpose it
        for i in range(m):
            for j in range(n):
                ans[i][j] = matrix[j][i]

        return ans

# Solution class to transpose a square matrix (GFG solution)
class SolutionSquare:
    def transpose(self, n: int, mat: list[list[int]]) -> None:
        # Iterate through the matrix and transpose it
        for i in range(n):
            for j in range(i):
                mat[i][j], mat[j][i] = mat[j][i], mat[i][j]

*/
package MultidimensionArrays;
/*
* ou are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.

Return the generated matrix.



Example 1:


Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
Output: [[9,9],[8,6]]
Explanation: The diagram above shows the original matrix and the generated matrix.
Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
Example 2:


Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
Output: [[2,2,2],[2,2,2],[2,2,2]]
Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.


Constraints:

n == grid.length == grid[i].length
3 <= n <= 100
1 <= grid[i][j] <= 100
* */
public class Leetcode2373 {
    // just find the max from the possible grid of 3 * 3 from given grid
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        for (int k = 0; k< n-2; k++){
            for (int l = 0; l< n-2; l++){
                ans[k][l] = findmax(grid, k+1, l+1);
            }
        }
        return ans;
    }

    private int findmax(int[][] grid, int r, int c){
        int n = grid.length;
        int max = grid[r][c];
        for(int i = r-1; i< r+2; i++){
            for (int j = c-1; j<c+2; j++){
                max = Math.max(grid[i][j], max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // code to create the grid

    }
}


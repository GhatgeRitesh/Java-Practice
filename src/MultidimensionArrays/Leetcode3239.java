package MultidimensionArrays;

public class Leetcode3239 {
    // leetcode problem
    public static void main(String[] args) {
        int[][] grid={{0,1},{0,1},{0,0}};
        int rowFlips = 0;
        for (int i = 0; i < grid.length; i++) {
            int s = 0;
            int e = grid[0].length - 1;
            while (s < e) {
                if (grid[i][s] != grid[i][e]) {
                    rowFlips++;
                }
                s++;
                e--;
            }
        }

        int colFlips = 0;
        for (int j = 0; j < grid[0].length; j++) {
            int s = 0;
            int e = grid.length - 1;
            while (s < e) {
                if (grid[s][j] != grid[e][j]) {
                    colFlips++;
                }
                s++;
                e--;
            }
        }

        if (colFlips < rowFlips) {
            System.out.println(colFlips + ": colFlips");
        } else {
            System.out.println(rowFlips + ": rowFlips");
        }
    }
}

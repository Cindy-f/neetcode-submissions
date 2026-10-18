class Solution {
    public int numIslands(char[][] grid) {
        // equivalent to counting the number of connected components
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int islandCount = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1') {
                    islandCount++;
                    dfs(grid, row, col);
                }
            }
        }
        return islandCount;
    }

    // dfs helper method
    private void dfs(char[][] grid, int r, int c) {
        // Base cases: out of bounds or water ('0')
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != '1') {
            return;
        }
        // Mark cell as visited by sinking it to '0'
        grid[r][c] = '0';

        // explore all 4 orthogonal directions
        dfs(grid, r + 1, c);    // down
        dfs(grid, r - 1, c);    // up
        dfs(grid, r, c + 1);    // right
        dfs(grid, r, c - 1);    // left 
    }
}

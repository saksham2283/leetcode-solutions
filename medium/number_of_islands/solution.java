// ============================================================
//  Problem : Number of Islands
//  Difficulty : Medium
//  Topics : Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix
//  Language : java
//  Submitted : 2024-04-19 19:25 UTC
//  Runtime : 4   Memory : 51380000
//  LeetCode URL : https://leetcode.com/problems/number-of-islands/
// ============================================================
//
// Problem Description:
// Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
// 
// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
// 
//  
// Example 1:
// 
// 
// Input: grid = [
//   ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1
// 
// 
// Example 2:
// 
// 
//
// ============================================================

class Solution {
     // Recursive function to mark all connected land cells as visited
    private void solve(int r, int c, char[][] grid, boolean[][] vis) {
        int n = grid.length;
        int m = grid[0].length;
        
        // Mark current cell as visited
        vis[r][c] = true;
        
        // Define movements in up, down, left, and right directions
        int[] dp1 = {1, -1, 0, 0};
        int[] dp2 = {0, 0, -1, 1};
        
        // Check all four adjacent cells
        for (int i = 0; i < 4; i++) {
            int nr = dp1[i] + r; // new row
            int nc = dp2[i] + c; // new column
            
            // Check if the adjacent cell is within the grid boundaries,
            // unvisited, and contains land ('1')
            if (nr >= 0 && nr < n && nc >= 0 && nc < m && !vis[nr][nc] && grid[nr][nc] == '1') {
                // Recursively call solve function for the adjacent land cell
                solve(nr, nc, grid, vis);
            }
        }
    }
    
    // Main function to count the number of islands
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        
        // Matrix to keep track of visited cells
        boolean[][] vis = new boolean[n][m];
        
        // Iterate through each cell in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If current cell is land ('1') and not visited
                if (grid[i][j] == '1' && !vis[i][j]) {
                    // Call solve function to mark all connected land cells as visited
                    solve(i, j, grid, vis);
                    // Increment island count
                    ans++;
                }
            }
        }
        
        // Return the total number of islands
        return ans;
    }
}

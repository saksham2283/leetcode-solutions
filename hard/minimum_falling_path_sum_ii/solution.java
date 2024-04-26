// ============================================================
//  Problem : Minimum Falling Path Sum II
//  Difficulty : Hard
//  Topics : Array, Dynamic Programming, Matrix
//  Language : java
//  Submitted : 2024-04-26 20:12 UTC
//  Runtime : 73   Memory : 49996000
//  LeetCode URL : https://leetcode.com/problems/minimum-falling-path-sum-ii/
// ============================================================
//
// Problem Description:
// Given an n x n integer matrix grid, return the minimum sum of a falling path with non-zero shifts.
// 
// A falling path with non-zero shifts is a choice of exactly one element from each row of grid such that no two elements chosen in adjacent rows are in the same column.
// 
//  
// Example 1:
// 
// 
// Input: grid = [[1,2,3],[4,5,6],[7,8,9]]
// Output: 13
// Explanation: 
// The possible falling paths are:
// [1,5,9], [1,5,7], [1,6,7], [1,6,8],
// [2,4,8], [2,4,9], [2,6,7], [2,6,8],
// [3,4,8], [3,4,9], [3,5,7], [3,5,9]
// The falling path with the smallest sum is [1,5,7], so the answer is 13.
// 
// 
// Example 2:
// 
//
// ============================================================

class Solution {
    public int minFallingPathSum(int[][] grid) {
          int n = grid.length;
        int m = grid[0].length;
        
        // Initialize two rows for DP table
        int[][] dp = new int[2][m];
        
        // Initialize the first row of the DP table with the values from the first row of the grid
        for (int j = 0; j < m; j++) {
            dp[0][j] = grid[0][j];
        }
        
        // Start from the second row and fill the DP table bottom-up
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Initialize the current cell with the value from the grid
                dp[i % 2][j] = grid[i][j];
                
                // Update the current cell with the minimum value from the previous row
                // excluding the current column
                int minPrev = Integer.MAX_VALUE;
                for (int k = 0; k < m; k++) {
                    if (k != j) {
                        minPrev = Math.min(minPrev, dp[(i - 1) % 2][k]);
                    }
                }
                dp[i % 2][j] += minPrev;
            }
        }
        
        // Find the minimum falling path sum in the last row of the DP table
        int minSum = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            minSum = Math.min(minSum, dp[(n - 1) % 2][j]);
        }
        
        return minSum;
    }
}

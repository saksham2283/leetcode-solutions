// ============================================================
//  Problem : Island Perimeter
//  Difficulty : Easy
//  Topics : Array, Depth-First Search, Breadth-First Search, Matrix
//  Language : java
//  Submitted : 2024-04-18 16:55 UTC
//  Runtime : 4   Memory : 45664000
//  LeetCode URL : https://leetcode.com/problems/island-perimeter/
// ============================================================
//
// Problem Description:
// You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
// 
// Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
// 
// The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
// 
//  
// Example 1:
// 
// 
// Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
// Output: 16
// Explanation: The perimeter is the 16 yellow stripes in the image above.
// 
// 
// Example 2:
// 
// 
// Input: grid = [[1]]
// Output: 4
//
// ============================================================

class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    if ((j > 0 && grid[i][j - 1] == 0) || j == 0)
                        cnt++;

                    if ((i > 0 && grid[i - 1][j] == 0) || i == 0)
                        cnt++;

                    if ((j < m - 1 && grid[i][j + 1] == 0) || j == m - 1)
                        cnt++;

                    if ((i < n - 1 && grid[i + 1][j] == 0) || i == n - 1)
                        cnt++;
                }
            }
        }
        return cnt;
    }
}

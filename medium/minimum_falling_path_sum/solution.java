// ============================================================
//  Problem : Minimum Falling Path Sum
//  Difficulty : Medium
//  Topics : Array, Dynamic Programming, Matrix
//  Language : java
//  Submitted : 2024-01-19 17:37 UTC
//  Runtime : 6   Memory : 45352000
//  LeetCode URL : https://leetcode.com/problems/minimum-falling-path-sum/
// ============================================================
//
// Problem Description:
// Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.
// 
// A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right. Specifically, the next element from position (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).
// 
//  
// Example 1:
// 
// 
// Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
// Output: 13
// Explanation: There are two falling paths with a minimum sum as shown.
// 
// 
// Example 2:
// 
// 
// Input: matrix = [[-19,57],[-40,-5]]
// Output: -59
// Explanation: The falling path with a minimum sum is shown.
// 
//
// ============================================================

class Solution {
    public int minFallingPathSum(int[][] matrix) {
         if (matrix.length == 1) {
            return matrix[0][0];
        }
        int[][] dp = Arrays.copyOf(matrix, matrix.length); 
        for (int i = matrix.length - 2; i >= 0; i--) {
            for (int j = 0; j < matrix.length; j++) {
                int minPath = dp[i + 1][j];
                if (j > 0) {
                    minPath = Math.min(minPath, dp[i + 1][j - 1]);
                }
                if (j < matrix.length - 1) {
                    minPath = Math.min(minPath, dp[i + 1][j + 1]);
                }
                dp[i][j] += minPath;
            }
        }

        int result = Integer.MAX_VALUE;
        for (int num : dp[0]) {
            result = Math.min(result, num);
        }
        return result;
    }
}

// ============================================================
//  Problem : Out of Boundary Paths
//  Difficulty : Medium
//  Topics : Dynamic Programming
//  Language : java
//  Submitted : 2024-01-26 18:04 UTC
//  Runtime : 2   Memory : 42272000
//  LeetCode URL : https://leetcode.com/problems/out-of-boundary-paths/
// ============================================================
//
// Problem Description:
// There is an m x n grid with a ball. The ball is initially at the position [startRow, startColumn]. You are allowed to move the ball to one of the four adjacent cells in the grid (possibly out of the grid crossing the grid boundary). You can apply at most maxMove moves to the ball.
// 
// Given the five integers m, n, maxMove, startRow, startColumn, return the number of paths to move the ball out of the grid boundary. Since the answer can be very large, return it modulo 109 + 7.
// 
//  
// Example 1:
// 
// 
// Input: m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0
// Output: 6
// 
// 
// Example 2:
// 
// 
// Input: m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1
// Output: 12
// 
// 
//  
//
// ============================================================

class Solution {
    public Integer[][][] dp;
    public int mod = 1_000_000_000+7;
    public int m, n;
    public int findPaths(int m, int n, int maxMove, int x, int y) {
        dp = new Integer[m][n][maxMove+1];
        this.m=m;
        this.n=n;
        return helper(maxMove, x, y);
    }

    private int helper(int maxMove, int x, int y){
        if(x < 0 || x >= m || y < 0 || y >= n)return 1;
        if(maxMove <= 0)return 0;
        if(dp[x][y][maxMove] != null){
            return dp[x][y][maxMove];
        }
        int res=0;
        
        res=(res+helper(maxMove-1, x+1, y))%mod;
        res=(res+helper(maxMove-1, x, y-1))%mod;
        res=(res+helper(maxMove-1, x-1, y))%mod;
        res=(res+helper(maxMove-1, x, y+1))%mod;

        dp[x][y][maxMove]=res;

        return res;

    }
}

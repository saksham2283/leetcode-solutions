// ============================================================
//  Problem : Cherry Pickup II
//  Difficulty : Hard
//  Topics : Array, Dynamic Programming, Matrix
//  Language : java
//  Submitted : 2024-02-11 18:55 UTC
//  Runtime : 27   Memory : 45648000
//  LeetCode URL : https://leetcode.com/problems/cherry-pickup-ii/
// ============================================================
//
// Problem Description:
// You are given a rows x cols matrix grid representing a field of cherries where grid[i][j] represents the number of cherries that you can collect from the (i, j) cell.
// 
// You have two robots that can collect cherries for you:
// 
// 
// 	Robot #1 is located at the top-left corner (0, 0), and
// 	Robot #2 is located at the top-right corner (0, cols - 1).
// 
// 
// Return the maximum number of cherries collection using both robots by following the rules below:
// 
// 
// 	From a cell (i, j), robots can move to cell (i + 1, j - 1), (i + 1, j), or (i + 1, j + 1).
// 	When any robot passes through a cell, It picks up all cherries, and the cell becomes an empty cell.
// 	When both robots stay in the same cell, only one takes the cherries.
// 	Both robots cannot move outside of the grid at any moment.
// 	Both robots should reach the bottom row in grid.
// 
// 
//  
//
// ============================================================

class Solution {
     int[][][] dp;
       public int cherryPickup(int[][] grid) {
        dp=new int[grid.length][grid[0].length][grid[0].length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                for(int k=0;k<dp[i][j].length;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return rec(grid,0,0,grid[0].length-1);
    }
    public int rec(int[][] grid,int level,int c1,int c2){
        // base case and pruning code
        if(level>=grid.length || c1>=grid[0].length || c2>=grid[0].length || c1<0 || c2<0){
            return 0;
        }

        if(dp[level][c1][c2]!=-1)
        return dp[level][c1][c2];

        int max=Integer.MIN_VALUE;
        for(int di=-1;di<=1;di++){
            for(int dj=-1;dj<=1;dj++){
                int cherry=0;
                if(c1==c2){
                    cherry=grid[level][c1];
                }else{
                    cherry=grid[level][c1]+grid[level][c2];
                }
                max=Math.max(max,cherry+rec(grid,level+1,c1+di,c2+dj));
            }
        }
        return dp[level][c1][c2]=max;
    }
}

// ============================================================
//  Problem : Partition Array for Maximum Sum
//  Difficulty : Medium
//  Topics : Array, Dynamic Programming
//  Language : java
//  Submitted : 2024-02-03 20:18 UTC
//  Runtime : 5   Memory : 42732000
//  LeetCode URL : https://leetcode.com/problems/partition-array-for-maximum-sum/
// ============================================================
//
// Problem Description:
// Given an integer array arr, partition the array into (contiguous) subarrays of length at most k. After partitioning, each subarray has their values changed to become the maximum value of that subarray.
// 
// Return the largest sum of the given array after partitioning. Test cases are generated so that the answer fits in a 32-bit integer.
// 
//  
// Example 1:
// 
// 
// Input: arr = [1,15,7,9,2,5,10], k = 3
// Output: 84
// Explanation: arr becomes [15,15,15,9,10,10,10]
// 
// 
// Example 2:
// 
// 
// Input: arr = [1,4,1,5,7,3,6,1,9,9,3], k = 4
// Output: 83
// 
// 
//
// ============================================================

class Solution {
     public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return help(arr, k, n, dp);
    }

    private int help(int[] arr, int k, int i, int[] dp) {
        if (i == 0) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int curmaxi = 0, best = 0;

        for (int t = 1; t <= k && t <= i; ++t) {
            curmaxi = Math.max(curmaxi, arr[i - t]);
            best = Math.max(best, help(arr, k, i - t, dp) + curmaxi * t);
        }

        dp[i] = best;
        return best;
    }
}

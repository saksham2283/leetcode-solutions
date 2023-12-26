// ============================================================
//  Problem : Number of Dice Rolls With Target Sum
//  Difficulty : Medium
//  Topics : Dynamic Programming
//  Language : java
//  Submitted : 2023-12-26 20:28 UTC
//  Runtime : 8   Memory : 40504000
//  LeetCode URL : https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
// ============================================================
//
// Problem Description:
// You have n dice, and each dice has k faces numbered from 1 to k.
// 
// Given three integers n, k, and target, return the number of possible ways (out of the kn total ways) to roll the dice, so the sum of the face-up numbers equals target. Since the answer may be too large, return it modulo 109 + 7.
// 
//  
// Example 1:
// 
// 
// Input: n = 1, k = 6, target = 3
// Output: 1
// Explanation: You throw one die with 6 faces.
// There is only one way to get a sum of 3.
// 
// 
// Example 2:
// 
// 
// Input: n = 2, k = 6, target = 7
// Output: 6
// Explanation: You throw two dice, each with 6 faces.
//
// ============================================================

class Solution {
    public int numRollsToTarget(int n, int k, int target) {
      final int MOD = 1000000007;

        // Check if it's impossible to reach the target with the given number of dice and faces
        if (n * k < target) {
            return 0;
        }

        // Initialize a 2D array to store the number of ways to achieve each target sum using a specific number of dice
        long[][] dp = new long[n + 1][target + 1];

        // Base case: There is one way to get a sum of 0 with 0 dice
        dp[0][0] = 1;

        // Dynamic Programming: Iterate over the number of dice and target sums
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= Math.min(i * k, target); j++) {
                for (int temp = 1; temp <= Math.min(k, j); temp++) {
                    // Update the number of ways to achieve the current target sum
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - temp]) % MOD;
                }
            }
        }

        // Return the result, cast to integer
        return (int) dp[n][target];
    }
}

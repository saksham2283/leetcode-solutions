// ============================================================
//  Problem : Arithmetic Slices II - Subsequence
//  Difficulty : Hard
//  Topics : Array, Dynamic Programming
//  Language : java
//  Submitted : 2024-01-07 19:57 UTC
//  Runtime : 129   Memory : 90924000
//  LeetCode URL : https://leetcode.com/problems/arithmetic-slices-ii-subsequence/
// ============================================================
//
// Problem Description:
// Given an integer array nums, return the number of all the arithmetic subsequences of nums.
// 
// A sequence of numbers is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
// 
// 
// 	For example, [1, 3, 5, 7, 9], [7, 7, 7, 7], and [3, -1, -5, -9] are arithmetic sequences.
// 	For example, [1, 1, 2, 5, 7] is not an arithmetic sequence.
// 
// 
// A subsequence of an array is a sequence that can be formed by removing some elements (possibly none) of the array.
// 
// 
// 	For example, [2,5,10] is a subsequence of [1,2,1,2,4,1,5,10].
// 
// 
// The test cases are generated so that the answer fits in 32-bit integer.
// 
//  
// Example 1:
// 
//
// ============================================================

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
         int n = nums.length;
        int count = 0;

        Map<Integer, Integer>[] dp = new HashMap[n];
        
        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
            
            for (int j = 0; j < i; j++) {
                long diff = (long)nums[i] - nums[j];
                if (diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE)
                    continue;

                int d = (int) diff;
                int sum = dp[j].getOrDefault(d, 0);
                int original = dp[i].getOrDefault(d, 0);

                dp[i].put(d, original + sum + 1);
                count += sum;
            }
        }
        
        return count;
    }
}

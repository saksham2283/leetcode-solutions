// ============================================================
//  Problem : Count Subarrays With Fixed Bounds
//  Difficulty : Hard
//  Topics : Array, Queue, Sliding Window, Monotonic Queue
//  Language : java
//  Submitted : 2024-03-31 09:51 UTC
//  Runtime : 8   Memory : 59948000
//  LeetCode URL : https://leetcode.com/problems/count-subarrays-with-fixed-bounds/
// ============================================================
//
// Problem Description:
// You are given an integer array nums and two integers minK and maxK.
// 
// A fixed-bound subarray of nums is a subarray that satisfies the following conditions:
// 
// 
// 	The minimum value in the subarray is equal to minK.
// 	The maximum value in the subarray is equal to maxK.
// 
// 
// Return the number of fixed-bound subarrays.
// 
// A subarray is a contiguous part of an array.
// 
//  
// Example 1:
// 
// 
// Input: nums = [1,3,5,2,7,5], minK = 1, maxK = 5
// Output: 2
// Explanation: The fixed-bound subarrays are [1,3,5] and [1,3,5,2].
//
// ============================================================

class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
         int n = nums.length;
        long result = 0;
        int minKIndex = -1;
        int maxKIndex = -1;
        int culpritIndex = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                culpritIndex = i;
            }

            if (nums[i] == minK)
                minKIndex = i;

            if (nums[i] == maxK)
                maxKIndex = i;

            long smaller = Math.min(minKIndex, maxKIndex);
            long temp = smaller - culpritIndex;

            result += temp <= 0 ? 0 : temp;
        }
        return result;
    }
}

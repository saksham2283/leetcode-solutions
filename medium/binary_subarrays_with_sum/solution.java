// ============================================================
//  Problem : Binary Subarrays With Sum
//  Difficulty : Medium
//  Topics : Array, Hash Table, Sliding Window, Prefix Sum
//  Language : java
//  Submitted : 2024-03-14 22:03 UTC
//  Runtime : 2   Memory : 48756000
//  LeetCode URL : https://leetcode.com/problems/binary-subarrays-with-sum/
// ============================================================
//
// Problem Description:
// Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
// 
// A subarray is a contiguous part of the array.
// 
//  
// Example 1:
// 
// 
// Input: nums = [1,0,1,0,1], goal = 2
// Output: 4
// Explanation: The 4 subarrays are bolded and underlined below:
// [1,0,1,0,1]
// [1,0,1,0,1]
// [1,0,1,0,1]
// [1,0,1,0,1]
// 
// 
// Example 2:
// 
// 
//
// ============================================================

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      int totalCount = 0;
        int sum = 0;
        int prefixSum[] = new int[nums.length + 1];
        prefixSum[0] = 1;
        
        for (int num : nums) {
            sum += num;
            if (sum >= goal) {
                totalCount += prefixSum[sum - goal];
            }
            prefixSum[sum]++;
        }
        
        return totalCount;  
    }
}

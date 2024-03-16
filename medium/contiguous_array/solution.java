// ============================================================
//  Problem : Contiguous Array
//  Difficulty : Medium
//  Topics : Array, Hash Table, Prefix Sum
//  Language : java
//  Submitted : 2024-03-16 22:37 UTC
//  Runtime : 23   Memory : 55080000
//  LeetCode URL : https://leetcode.com/problems/contiguous-array/
// ============================================================
//
// Problem Description:
// Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
// 
//  
// Example 1:
// 
// 
// Input: nums = [0,1]
// Output: 2
// Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
// 
// 
// Example 2:
// 
// 
// Input: nums = [0,1,0]
// Output: 2
// Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
// 
// 
// Example 3:
//
// ============================================================

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int zeros = 0, ones = 0, maxLen = 0;
        
        hashmap.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) zeros++; else ones++;
            int diff = zeros - ones;
            
            if (hashmap.containsKey(diff)) {
                maxLen = Math.max(maxLen, i - hashmap.get(diff));
            } else {
                hashmap.put(diff, i);
            }
        }
        
        return maxLen;
    }
}

// ============================================================
//  Problem : Largest Positive Integer That Exists With Its Negative
//  Difficulty : Easy
//  Topics : Array, Hash Table, Two Pointers, Sorting
//  Language : java
//  Submitted : 2024-05-02 19:15 UTC
//  Runtime : 6   Memory : 45056000
//  LeetCode URL : https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/
// ============================================================
//
// Problem Description:
// Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.
// 
// Return the positive integer k. If there is no such integer, return -1.
// 
//  
// Example 1:
// 
// 
// Input: nums = [-1,2,-3,3]
// Output: 3
// Explanation: 3 is the only valid k we can find in the array.
// 
// 
// Example 2:
// 
// 
// Input: nums = [-1,10,6,7,-7,1]
// Output: 7
// Explanation: Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.
// 
//
// ============================================================

class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int ans = -1;
        for(int num : nums){
            hs.add(num);
            int k = num*(-1);
            if(hs.contains(k)){
                ans = Math.max(ans,Math.abs(num));
            }
        }
        return ans; 
    }
}

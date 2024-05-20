// ============================================================
//  Problem : Sum of All Subset XOR Totals
//  Difficulty : Easy
//  Topics : Array, Math, Backtracking, Bit Manipulation, Combinatorics, Enumeration
//  Language : java
//  Submitted : 2024-05-20 20:34 UTC
//  Runtime : 0   Memory : 41408000
//  LeetCode URL : https://leetcode.com/problems/sum-of-all-subset-xor-totals/
// ============================================================
//
// Problem Description:
// The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.
// 
// 
// 	For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.
// 
// 
// Given an array nums, return the sum of all XOR totals for every subset of nums. 
// 
// Note: Subsets with the same elements should be counted multiple times.
// 
// An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b.
// 
//  
// Example 1:
// 
// 
// Input: nums = [1,3]
// Output: 6
// Explanation: The 4 subsets of [1,3] are:
// - The empty subset has an XOR total of 0.
//
// ============================================================

class Solution {
    public int subsetXORSum(int[] nums) {
        return findSum(nums, 0, 0);
    }

    private int findSum(int[] nums, int curInd, int curNum) {
        if (curInd == nums.length) {
            return curNum;
        }

        int includeInXor = findSum(nums, curInd + 1, curNum ^ nums[curInd]);
        int notIncludeInXor = findSum(nums, curInd + 1, curNum);

        return includeInXor + notIncludeInXor;
    }
}

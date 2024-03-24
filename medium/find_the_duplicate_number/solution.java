// ============================================================
//  Problem : Find the Duplicate Number
//  Difficulty : Medium
//  Topics : Array, Two Pointers, Binary Search, Bit Manipulation
//  Language : java
//  Submitted : 2024-03-24 16:25 UTC
//  Runtime : 33   Memory : 58184000
//  LeetCode URL : https://leetcode.com/problems/find-the-duplicate-number/
// ============================================================
//
// Problem Description:
// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// 
// There is only one repeated number in nums, return this repeated number.
// 
// You must solve the problem without modifying the array nums and using only constant extra space.
// 
//  
// Example 1:
// 
// 
// Input: nums = [1,3,4,2,2]
// Output: 2
// 
// 
// Example 2:
// 
// 
// Input: nums = [3,1,3,4,2]
// Output: 3
// 
//
// ============================================================

class Solution {
    public int findDuplicate(int[] nums) {
            Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
            if(nums[i] == nums[i+1]) return nums[i];
        return -1;
    }
}

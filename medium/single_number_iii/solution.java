// ============================================================
//  Problem : Single Number III
//  Difficulty : Medium
//  Topics : Array, Bit Manipulation
//  Language : java
//  Submitted : 2024-05-31 19:14 UTC
//  Runtime : 58   Memory : 45268000
//  LeetCode URL : https://leetcode.com/problems/single-number-iii/
// ============================================================
//
// Problem Description:
// Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.
// 
// You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
// 
//  
// Example 1:
// 
// 
// Input: nums = [1,2,1,3,2,5]
// Output: [3,5]
// Explanation:  [5, 3] is also a valid answer.
// 
// 
// Example 2:
// 
// 
// Input: nums = [-1,0]
// Output: [-1,0]
// 
// 
//
// ============================================================

class Solution {
    public int[] singleNumber(int[] nums) {
      int[] result = new int[2];
        int index = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[index++] = nums[i];
                if (index == 2) {
                    break;
                }
            }
        }

        return result;  
    }
}

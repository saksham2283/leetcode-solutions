// ============================================================
//  Problem : Single Number
//  Difficulty : Easy
//  Topics : Array, Bit Manipulation
//  Language : java
//  Submitted : 2024-01-17 18:19 UTC
//  Runtime : 7   Memory : 45680000
//  LeetCode URL : https://leetcode.com/problems/single-number/
// ============================================================
//
// Problem Description:
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// 
// You must implement a solution with a linear runtime complexity and use only constant extra space.
// 
//  
// Example 1:
// 
// 
// Input: nums = [2,2,1]
// 
// Output: 1
// 
// 
// Example 2:
// 
// 
// Input: nums = [4,1,2,1,2]
// 
// Output: 4
// 
//
// ============================================================

class Solution {
    public int singleNumber(int[] nums) {
        int c=0;int j;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
         c=0;
            for(j=i;j<nums.length;j++){
                if(nums[i]==nums[j])
                 c++;
                 else 
                  break;
            }
            i=j-1;
            if(c==1)
             return nums[i];
        }
        return 0;
    }
}

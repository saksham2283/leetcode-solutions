// ============================================================
//  Problem : Rearrange Array Elements by Sign
//  Difficulty : Medium
//  Topics : Array, Two Pointers, Simulation
//  Language : java
//  Submitted : 2024-02-14 18:39 UTC
//  Runtime : 3   Memory : 81840000
//  LeetCode URL : https://leetcode.com/problems/rearrange-array-elements-by-sign/
// ============================================================
//
// Problem Description:
// You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
// 
// You should return the array of nums such that the array follows the given conditions:
// 
// 
// 	Every consecutive pair of integers have opposite signs.
// 	For all integers with the same sign, the order in which they were present in nums is preserved.
// 	The rearranged array begins with a positive integer.
// 
// 
// Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
// 
//  
// Example 1:
// 
// 
// Input: nums = [3,1,-2,-5,2,-4]
// Output: [3,-2,1,-5,2,-4]
// Explanation:
// The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
//
// ============================================================

class Solution {
    public int[] rearrangeArray(int[] nums) {
         int p = 0, n = 1;
        int[] res = new int[nums.length];
        
        for(int i= 0;i<res.length;i++){
            if(nums[i]>0){
                res[p] = nums[i];
                p += 2;
            }
            else{
                res[n] = nums[i];
                n += 2;
            }
        }
        return res;
    }
}

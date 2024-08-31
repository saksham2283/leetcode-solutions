// ============================================================
//  Problem : Move Zeroes
//  Difficulty : Easy
//  Topics : Array, Two Pointers
//  Language : java
//  Submitted : 2024-08-31 17:08 UTC
//  Runtime : 1   Memory : 45632000
//  LeetCode URL : https://leetcode.com/problems/move-zeroes/
// ============================================================
//
// Problem Description:
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// 
// Note that you must do this in-place without making a copy of the array.
// 
//  
// Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:
// Input: nums = [0]
// Output: [0]
// 
//  
// Constraints:
// 
// 
// 	1 <= nums.length <= 104
// 	-231 <= nums[i] <= 231 - 1
// 
// 
//
// ============================================================

class Solution {
    public void moveZeroes(int[] nums) {
       //Arrays.sort(nums);
       int c=0;
       int k=0;
       int n[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
         c++;
         continue;
        }
        n[k++]=nums[i];
        
       }
       for(int i=0;i<c;i++)
        n[k++]=0;
       for(int i=0;i<nums.length;i++)
        nums[i]=n[i];


    }
}

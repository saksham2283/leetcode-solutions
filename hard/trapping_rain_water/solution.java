// ============================================================
//  Problem : Trapping Rain Water
//  Difficulty : Hard
//  Topics : Array, Two Pointers, Dynamic Programming, Stack, Monotonic Stack
//  Language : java
//  Submitted : 2024-04-12 18:23 UTC
//  Runtime : 0   Memory : 46788000
//  LeetCode URL : https://leetcode.com/problems/trapping-rain-water/
// ============================================================
//
// Problem Description:
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
// 
//  
// Example 1:
// 
// 
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
// 
// 
// Example 2:
// 
// 
// Input: height = [4,2,0,3,2,5]
// Output: 9
// 
// 
//  
// Constraints:
//
// ============================================================

class Solution {
    public int trap(int[] height) {
       int i=0,left_max=height[0],sum=0;
        int j=height.length-1,right_max=height[j];
        while (i<j)
        {
            if(left_max <= right_max)
            {
                sum+=(left_max-height[i]);
                i++;
                left_max=Math.max(left_max,height[i]);
            }
            else 
            {
                sum+=(right_max-height[j]);
                j--;
                right_max=Math.max(right_max,height[j]);
            }
        }
        return sum; 
    }
}

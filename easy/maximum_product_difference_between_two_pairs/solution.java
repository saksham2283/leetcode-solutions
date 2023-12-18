// ============================================================
//  Problem : Maximum Product Difference Between Two Pairs
//  Difficulty : Easy
//  Topics : Array, Sorting
//  Language : java
//  Submitted : 2023-12-18 21:56 UTC
//  Runtime : 348   Memory : 43704000
//  LeetCode URL : https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
// ============================================================
//
// Problem Description:
// The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
// 
// 
// 	For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
// 
// 
// Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.
// 
// Return the maximum such product difference.
// 
//  
// Example 1:
// 
// 
// Input: nums = [5,6,2,7,4]
// Output: 34
// Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
// The product difference is (6 * 7) - (2 * 4) = 34.
// 
// 
//
// ============================================================

class Solution {
    public int maxProductDifference(int[] nums) {
        int m=1;int s=nums[0]*nums[1];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                   int k=(nums[i]*nums[j]);
                   if(k>m)
                    m=k;
                  if(k<s)
                   s=k;
             }

        }
        //System.out.println(m+" "+s);
        return (m-s);
        
    }
}

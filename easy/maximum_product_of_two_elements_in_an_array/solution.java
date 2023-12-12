// ============================================================
//  Problem : Maximum Product of Two Elements in an Array
//  Difficulty : Easy
//  Topics : Array, Sorting, Heap (Priority Queue)
//  Language : java
//  Submitted : 2023-12-12 19:48 UTC
//  Runtime : 4   Memory : 41808000
//  LeetCode URL : https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
// ============================================================
//
// Problem Description:
// Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
//  
// Example 1:
// 
// 
// Input: nums = [3,4,5,2]
// Output: 12 
// Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
// 
// 
// Example 2:
// 
// 
// Input: nums = [1,5,4,5]
// Output: 16
// Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
// 
// 
// Example 3:
// 
//
// ============================================================

class Solution {
    public int maxProduct(int[] nums) {
        int m=1;
        int k=0;
        for(int i=0;i<nums.length;i++){
            for(int j=(i+1);j<nums.length;j++){
                if((nums[i]*nums[j])>m)
                {
                    m=nums[i]*nums[j];
                    k=(nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return k;
    }
}

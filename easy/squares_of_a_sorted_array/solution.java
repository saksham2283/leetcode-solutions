// ============================================================
//  Problem : Squares of a Sorted Array
//  Difficulty : Easy
//  Topics : Array, Two Pointers, Sorting
//  Language : java
//  Submitted : 2024-03-02 20:24 UTC
//  Runtime : 7   Memory : 46432000
//  LeetCode URL : https://leetcode.com/problems/squares-of-a-sorted-array/
// ============================================================
//
// Problem Description:
// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
// 
//  
// Example 1:
// 
// 
// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].
// 
// 
// Example 2:
// 
// 
// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]
// 
// 
//  
//
// ============================================================

class Solution {
    public int[] sortedSquares(int[] n) {
        int a[]=new int[n.length];
        for(int i=0;i<n.length;i++)
         a[i]=n[i]*n[i];
        Arrays.sort(a);
        return a;
    }
}

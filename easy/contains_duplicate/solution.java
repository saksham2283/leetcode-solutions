// ============================================================
//  Problem : Contains Duplicate
//  Difficulty : Easy
//  Topics : Array, Hash Table, Sorting
//  Language : java
//  Submitted : 2024-09-22 00:43 UTC
//  Runtime : 19   Memory : 55076000
//  LeetCode URL : https://leetcode.com/problems/contains-duplicate/
// ============================================================
//
// Problem Description:
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// 
//  
// Example 1:
// 
// 
// Input: nums = [1,2,3,1]
// 
// Output: true
// 
// Explanation:
// 
// The element 1 occurs at the indices 0 and 3.
// 
// 
// Example 2:
// 
// 
// Input: nums = [1,2,3,4]
// 
//
// ============================================================

class Solution {
    public boolean containsDuplicate(int[] n) {
        Arrays.sort(n);
        for(int i=0;i<n.length-1;i++){
            if(n[i]==n[i+1])
             return true;
        }
        return false;
    }
}

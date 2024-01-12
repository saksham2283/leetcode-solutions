// ============================================================
//  Problem : Search Insert Position
//  Difficulty : Easy
//  Topics : Array, Binary Search
//  Language : java
//  Submitted : 2024-01-12 19:11 UTC
//  Runtime : 0   Memory : 42952000
//  LeetCode URL : https://leetcode.com/problems/search-insert-position/
// ============================================================
//
// Problem Description:
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
// 
// You must write an algorithm with O(log n) runtime complexity.
// 
//  
// Example 1:
// 
// 
// Input: nums = [1,3,5,6], target = 5
// Output: 2
// 
// 
// Example 2:
// 
// 
// Input: nums = [1,3,5,6], target = 2
// Output: 1
// 
// 
// Example 3:
//
// ============================================================

class Solution {
    public int searchInsert(int[] n, int t) {
       
       int i=0; for( i=0;i<n.length;i++){
            if(n[i]==t)
             return i;
            if(n[i]>t)
             break;
             
        }
        return i;
        
    }
}

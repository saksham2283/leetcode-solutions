// ============================================================
//  Problem : Binary Search
//  Difficulty : Easy
//  Topics : Array, Binary Search
//  Language : java
//  Submitted : 2024-09-22 00:15 UTC
//  Runtime : 0   Memory : 45740000
//  LeetCode URL : https://leetcode.com/problems/binary-search/
// ============================================================
//
// Problem Description:
// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
// 
// You must write an algorithm with O(log n) runtime complexity.
// 
//  
// Example 1:
// 
// 
// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4
// 
// 
// Example 2:
// 
// 
// Input: nums = [-1,0,3,5,9,12], target = 2
// Output: -1
// Explanation: 2 does not exist in nums so return -1
// 
//
// ============================================================

class Solution {
    public int search(int[] n, int t) {
        int l=0;
        int h=n.length- 1;
        while(l<=h){
            int m=(l+h)/2;
           // System.out.println(n[m]);
            if(t==n[m])
             return m;
            else if(t>n[m])
             l=m+1;
            else 
             h=m-1;
        }
        return -1;
    }
}

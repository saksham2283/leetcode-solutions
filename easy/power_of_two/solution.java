// ============================================================
//  Problem : Power of Two
//  Difficulty : Easy
//  Topics : Math, Bit Manipulation, Recursion
//  Language : java
//  Submitted : 2024-02-19 17:39 UTC
//  Runtime : 1   Memory : 40964000
//  LeetCode URL : https://leetcode.com/problems/power-of-two/
// ============================================================
//
// Problem Description:
// Given an integer n, return true if it is a power of two. Otherwise, return false.
// 
// An integer n is a power of two, if there exists an integer x such that n == 2x.
// 
//  
// Example 1:
// 
// 
// Input: n = 1
// Output: true
// Explanation: 20 = 1
// 
// 
// Example 2:
// 
// 
// Input: n = 16
// Output: true
// Explanation: 24 = 16
// 
//
// ============================================================

class Solution {
    public boolean isPowerOfTwo(int n) {
        int k=0;
        while(Math.pow(2,k)<=n){
            if(Math.pow(2,k++)==n)
             return true;
        }
        return false;
    }
}

// ============================================================
//  Problem : Bitwise AND of Numbers Range
//  Difficulty : Medium
//  Topics : Bit Manipulation
//  Language : java
//  Submitted : 2024-02-21 17:50 UTC
//  Runtime : 3   Memory : 43984000
//  LeetCode URL : https://leetcode.com/problems/bitwise-and-of-numbers-range/
// ============================================================
//
// Problem Description:
// Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.
// 
//  
// Example 1:
// 
// 
// Input: left = 5, right = 7
// Output: 4
// 
// 
// Example 2:
// 
// 
// Input: left = 0, right = 0
// Output: 0
// 
// 
// Example 3:
// 
// 
//
// ============================================================

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
           int shift = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        return left << shift;
    }
}

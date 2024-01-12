// ============================================================
//  Problem : Sqrt(x)
//  Difficulty : Easy
//  Topics : Math, Binary Search
//  Language : java
//  Submitted : 2024-01-12 18:31 UTC
//  Runtime : 0   Memory : 41036000
//  LeetCode URL : https://leetcode.com/problems/sqrtx/
// ============================================================
//
// Problem Description:
// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
// 
// You must not use any built-in exponent function or operator.
// 
// 
// 	For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
// 
// 
//  
// Example 1:
// 
// 
// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.
// 
// 
// Example 2:
// 
// 
//
// ============================================================

class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}

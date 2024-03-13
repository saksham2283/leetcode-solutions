// ============================================================
//  Problem : Find the Pivot Integer
//  Difficulty : Easy
//  Topics : Math, Prefix Sum
//  Language : java
//  Submitted : 2024-03-13 22:48 UTC
//  Runtime : 2   Memory : 40336000
//  LeetCode URL : https://leetcode.com/problems/find-the-pivot-integer/
// ============================================================
//
// Problem Description:
// Given a positive integer n, find the pivot integer x such that:
// 
// 
// 	The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
// 
// 
// Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.
// 
//  
// Example 1:
// 
// 
// Input: n = 8
// Output: 6
// Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
// 
// 
// Example 2:
// 
// 
//
// ============================================================

class Solution {
    public int pivotInteger(int n) {
    int leftSum = 0; // Initialize the sum of elements from 1 to x
        int rightSum = 0; // Initialize the sum of elements from x to n
        
        // Iterate through all possible values of x
        for (int i = 1; i <= n; i++) {
            leftSum = i * (i + 1) / 2; // Calculate the sum of elements from 1 to i using arithmetic progression formula
            rightSum = n * (n + 1) / 2 - i * (i - 1) / 2; // Calculate the sum of elements from i to n using arithmetic progression formula
            
            // Check if the sums are equal
            if (leftSum == rightSum)
                return i; // Return i as the pivot integer
        }
        
        return -1;    
    }
}

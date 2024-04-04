// ============================================================
//  Problem : Maximum Nesting Depth of the Parentheses
//  Difficulty : Easy
//  Topics : String, Stack
//  Language : java
//  Submitted : 2024-04-04 14:56 UTC
//  Runtime : 0   Memory : 41464000
//  LeetCode URL : https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
// ============================================================
//
// Problem Description:
// Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.
// 
//  
// Example 1:
// 
// 
// Input: s = "(1+(2*3)+((8)/4))+1"
// 
// Output: 3
// 
// Explanation:
// 
// Digit 8 is inside of 3 nested parentheses in the string.
// 
// 
// Example 2:
// 
// 
// Input: s = "(1)+((2))+(((3)))"
// 
//
// ============================================================

class Solution {
    public int maxDepth(String s) {
         int count=0,max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') count++;
            max=Math.max(count,max);
            if(s.charAt(i)==')') count--;
        }
        return max;
        
    }
}




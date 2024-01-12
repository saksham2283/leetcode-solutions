// ============================================================
//  Problem : Length of Last Word
//  Difficulty : Easy
//  Topics : String
//  Language : java
//  Submitted : 2024-01-12 18:30 UTC
//  Runtime : 0   Memory : 41188000
//  LeetCode URL : https://leetcode.com/problems/length-of-last-word/
// ============================================================
//
// Problem Description:
// Given a string s consisting of words and spaces, return the length of the last word in the string.
// 
// A word is a maximal substring consisting of non-space characters only.
// 
//  
// Example 1:
// 
// 
// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// 
// 
// Example 2:
// 
// 
// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.
// 
//
// ============================================================

class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int k=s.lastIndexOf(' ');
        return (s.substring(k+1).length());
    }
}

// ============================================================
//  Problem : Palindromic Substrings
//  Difficulty : Medium
//  Topics : Two Pointers, String, Dynamic Programming
//  Language : java
//  Submitted : 2024-02-10 16:16 UTC
//  Runtime : 2   Memory : 41772000
//  LeetCode URL : https://leetcode.com/problems/palindromic-substrings/
// ============================================================
//
// Problem Description:
// Given a string s, return the number of palindromic substrings in it.
// 
// A string is a palindrome when it reads the same backward as forward.
// 
// A substring is a contiguous sequence of characters within the string.
// 
//  
// Example 1:
// 
// 
// Input: s = "abc"
// Output: 3
// Explanation: Three palindromic strings: "a", "b", "c".
// 
// 
// Example 2:
// 
// 
// Input: s = "aaa"
// Output: 6
//
// ============================================================

class Solution {
    public int countSubstrings(String s) {
       int totalCount = 0;
        for (int i = 0; i < s.length(); i++) {
            // Count palindromes with odd length
            totalCount += extendPalindrome(s, i, i);
            // Count palindromes with even length
            totalCount += extendPalindrome(s, i, i + 1);
        }
        return totalCount;
    }

    private int extendPalindrome(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
      
    }
}

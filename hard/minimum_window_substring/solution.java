// ============================================================
//  Problem : Minimum Window Substring
//  Difficulty : Hard
//  Topics : Hash Table, String, Sliding Window
//  Language : java
//  Submitted : 2024-02-04 17:30 UTC
//  Runtime : 2   Memory : 44032000
//  LeetCode URL : https://leetcode.com/problems/minimum-window-substring/
// ============================================================
//
// Problem Description:
// Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
// 
// The testcases will be generated such that the answer is unique.
// 
//  
// Example 1:
// 
// 
// Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"
// Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
// 
// 
// Example 2:
// 
// 
// Input: s = "a", t = "a"
// Output: "a"
// Explanation: The entire string s is the minimum window.
// 
//
// ============================================================

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 ||
                s.length() < t.length()) {
            return new String();
        }
        int[] map = new int[128];
        int count = t.length();
        int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
        /// UPVOTE !
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        char[] chS = s.toCharArray();

        while (end < chS.length) {
            if (map[chS[end++]]-- > 0) {
                count--;
            }
            while (count == 0) {
                if (end - start < minLen) {
                    startIndex = start;
                    minLen = end - start;
                }
                if (map[chS[start++]]++ == 0) {
                    count++;
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? new String() :
                new String(chS, startIndex, minLen);
    }
}

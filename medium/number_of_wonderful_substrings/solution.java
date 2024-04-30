// ============================================================
//  Problem : Number of Wonderful Substrings
//  Difficulty : Medium
//  Topics : Hash Table, String, Bit Manipulation, Prefix Sum
//  Language : java
//  Submitted : 2024-04-30 03:29 UTC
//  Runtime : 17   Memory : 45224000
//  LeetCode URL : https://leetcode.com/problems/number-of-wonderful-substrings/
// ============================================================
//
// Problem Description:
// A wonderful string is a string where at most one letter appears an odd number of times.
// 
// 
// 	For example, "ccjjc" and "abab" are wonderful, but "ab" is not.
// 
// 
// Given a string word that consists of the first ten lowercase English letters ('a' through 'j'), return the number of wonderful non-empty substrings in word. If the same substring appears multiple times in word, then count each occurrence separately.
// 
// A substring is a contiguous sequence of characters in a string.
// 
//  
// Example 1:
// 
// 
// Input: word = "aba"
// Output: 4
// Explanation: The four wonderful substrings are underlined below:
// - "aba" -> "a"
// - "aba" -> "b"
// - "aba" -> "a"
//
// ============================================================

class Solution {
    public long wonderfulSubstrings(String word) {
     long[] cnt = new long[1024]; // cnt[state] stores how many times the state occurs
        cnt[0] = 1; // empty string gives case where all characters occur even number of times
        int mask = 0; // current state
        long ans = 0;
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int idx = c - 'a';
            mask ^= 1 << idx; // update state
            ans += cnt[mask]; // add count of same previous states
            for (int i = 1; i <= 512; i*=2) {
                ans += cnt[mask ^ i];
            }
            cnt[mask]++; // add 1 to count of times we've seen current state
        }
        return ans;   
    }
}

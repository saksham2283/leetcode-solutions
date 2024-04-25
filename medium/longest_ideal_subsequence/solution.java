// ============================================================
//  Problem : Longest Ideal Subsequence
//  Difficulty : Medium
//  Topics : Hash Table, String, Dynamic Programming
//  Language : java
//  Submitted : 2024-04-25 06:27 UTC
//  Runtime : 25   Memory : 44548000
//  LeetCode URL : https://leetcode.com/problems/longest-ideal-subsequence/
// ============================================================
//
// Problem Description:
// You are given a string s consisting of lowercase letters and an integer k. We call a string t ideal if the following conditions are satisfied:
// 
// 
// 	t is a subsequence of the string s.
// 	The absolute difference in the alphabet order of every two adjacent letters in t is less than or equal to k.
// 
// 
// Return the length of the longest ideal string.
// 
// A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.
// 
// Note that the alphabet order is not cyclic. For example, the absolute difference in the alphabet order of 'a' and 'z' is 25, not 1.
// 
//  
// Example 1:
// 
// 
// Input: s = "acfgbd", k = 2
// Output: 4
// Explanation: The longest ideal string is "acbd". The length of this string is 4, so 4 is returned.
//
// ============================================================

class Solution {
    public int longestIdealString(String s, int k) {
        int[] dp = new int[26];
        int ans=1;
        for(int i=0;i<s.length();i++){
            int ele = s.charAt(i) - 'a';
            for(int j=ele;j>=0 && j>=ele-k;j--){
                dp[ele] = Math.max(dp[ele],dp[j]+1);
            }
            for(int j=ele+1;j<26 && j<=ele+k;j++){
                dp[ele] = Math.max(dp[ele],dp[j]+1);
            }
            ans = Math.max(ans,dp[ele]);
        }
        return ans;  
    }
}

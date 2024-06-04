// ============================================================
//  Problem : Longest Palindrome
//  Difficulty : Easy
//  Topics : Hash Table, String, Greedy
//  Language : java
//  Submitted : 2024-06-04 20:10 UTC
//  Runtime : 9   Memory : 41852000
//  LeetCode URL : https://leetcode.com/problems/longest-palindrome/
// ============================================================
//
// Problem Description:
// Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
// 
// Letters are case sensitive, for example, "Aa" is not considered a palindrome.
// 
//  
// Example 1:
// 
// 
// Input: s = "abccccdd"
// Output: 7
// Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
// 
// 
// Example 2:
// 
// 
// Input: s = "a"
// Output: 1
// Explanation: The longest palindrome that can be built is "a", whose length is 1.
// 
//
// ============================================================

public class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        int oddFrequencyCount = 0;
        for (char ch : s.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
            if (charFrequency.get(ch) % 2 == 1)
                oddFrequencyCount++;
            else
                oddFrequencyCount--;
        }
        if (oddFrequencyCount > 1)
            return s.length() - oddFrequencyCount + 1;
        return s.length();
    }
}

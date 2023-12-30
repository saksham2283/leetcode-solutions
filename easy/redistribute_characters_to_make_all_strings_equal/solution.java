// ============================================================
//  Problem : Redistribute Characters to Make All Strings Equal
//  Difficulty : Easy
//  Topics : Hash Table, String, Counting
//  Language : java
//  Submitted : 2023-12-30 22:06 UTC
//  Runtime : 23   Memory : 43748000
//  LeetCode URL : https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
// ============================================================
//
// Problem Description:
// You are given an array of strings words (0-indexed).
// 
// In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].
// 
// Return true if you can make every string in words equal using any number of operations, and false otherwise.
// 
//  
// Example 1:
// 
// 
// Input: words = ["abc","aabc","bc"]
// Output: true
// Explanation: Move the first 'a' in words[1] to the front of words[2],
// to make words[1] = "abc" and words[2] = "abc".
// All the strings are now equal to "abc", so return true.
// 
// 
// Example 2:
// 
// 
//
// ============================================================

class Solution {
    public boolean makeEqual(String[] words) {
        int length = words.length;
        Map<Character, Integer> charCount = new HashMap<>();
        for (String word : words) 
        {
            for (char c : word.toCharArray())       
            {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        for (int count : charCount.values()) 
        {
            if (count % length != 0) 
            {
                return false;
            }
        }
        return true;
    }
}

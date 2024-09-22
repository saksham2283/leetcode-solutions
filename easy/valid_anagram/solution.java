// ============================================================
//  Problem : Valid Anagram
//  Difficulty : Easy
//  Topics : Hash Table, String, Sorting
//  Language : java
//  Submitted : 2024-09-22 00:00 UTC
//  Runtime : 3   Memory : 44556000
//  LeetCode URL : https://leetcode.com/problems/valid-anagram/
// ============================================================
//
// Problem Description:
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// 
//  
// Example 1:
// 
// 
// Input: s = "anagram", t = "nagaram"
// 
// Output: true
// 
// 
// Example 2:
// 
// 
// Input: s = "rat", t = "car"
// 
// Output: false
// 
// 
//  
//
// ============================================================

class Solution {
    public boolean isAnagram(String s, String t) {
          char c[]=s.toCharArray();
          char ch[]=t.toCharArray();
          Arrays.sort(c);
          Arrays.sort(ch);
          if(ch.length>c.length||c.length>ch.length)
           return false;
          for(int i=0;i<c.length;i++)
          {
            if(c[i]!=ch[i])
             return false;
          }
          return true;
    }
}

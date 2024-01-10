// ============================================================
//  Problem : Find the Index of the First Occurrence in a String
//  Difficulty : Easy
//  Topics : Two Pointers, String, String Matching
//  Language : java
//  Submitted : 2024-01-10 16:29 UTC
//  Runtime : 0   Memory : 41656000
//  LeetCode URL : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// ============================================================
//
// Problem Description:
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
// 
//  
// Example 1:
// 
// 
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// 
// 
// Example 2:
// 
// 
// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.
// 
// 
//
// ============================================================

class Solution {
    public int strStr(String h, String n) {
        int k=n.length();
        for(int i=0;i<h.length()-k+1;i++){
            if(n.equals(h.substring(i,i+k)))
             return i;
        }
        return -1;
    }
}

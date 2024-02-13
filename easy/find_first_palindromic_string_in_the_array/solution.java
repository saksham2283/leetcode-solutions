// ============================================================
//  Problem : Find First Palindromic String in the Array
//  Difficulty : Easy
//  Topics : Array, Two Pointers, String
//  Language : java
//  Submitted : 2024-02-13 19:35 UTC
//  Runtime : 77   Memory : 45324000
//  LeetCode URL : https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
// ============================================================
//
// Problem Description:
// Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
// 
// A string is palindromic if it reads the same forward and backward.
// 
//  
// Example 1:
// 
// 
// Input: words = ["abc","car","ada","racecar","cool"]
// Output: "ada"
// Explanation: The first string that is palindromic is "ada".
// Note that "racecar" is also palindromic, but it is not the first.
// 
// 
// Example 2:
// 
// 
// Input: words = ["notapalindrome","racecar"]
// Output: "racecar"
// Explanation: The first and only string that is palindromic is "racecar".
//
// ============================================================

class Solution {
    public String firstPalindrome(String[] w) {
        String s="";
        for(int i=0;i<w.length;i++){
            int l=w[i].length();
            while(l-->0){
              s=s+w[i].charAt(l);
            }
            if(s.equals(w[i]))
             return w[i];
            s=""; 
        }
        return s;
    }
}

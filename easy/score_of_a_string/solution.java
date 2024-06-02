// ============================================================
//  Problem : Score of a String
//  Difficulty : Easy
//  Topics : String
//  Language : java
//  Submitted : 2024-06-02 19:36 UTC
//  Runtime : 1   Memory : 42156000
//  LeetCode URL : https://leetcode.com/problems/score-of-a-string/
// ============================================================
//
// Problem Description:
// You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
// 
// Return the score of s.
// 
//  
// Example 1:
// 
// 
// Input: s = "hello"
// 
// Output: 13
// 
// Explanation:
// 
// The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.
// 
// 
// Example 2:
// 
// 
//
// ============================================================

class Solution {
    public int scoreOfString(String st) {
     char c;
     int s=0;
     for(int i=0;i<st.length()-1;i++){
         c=st.charAt(i);
         s=s+(int)Math.abs(c-st.charAt(i+1));
     }  
     return s;
    }
}

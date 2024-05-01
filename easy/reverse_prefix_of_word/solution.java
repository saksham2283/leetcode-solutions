// ============================================================
//  Problem : Reverse Prefix of Word
//  Difficulty : Easy
//  Topics : Two Pointers, String, Stack
//  Language : java
//  Submitted : 2024-05-01 20:28 UTC
//  Runtime : 6   Memory : 41980000
//  LeetCode URL : https://leetcode.com/problems/reverse-prefix-of-word/
// ============================================================
//
// Problem Description:
// Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
// 
// 
// 	For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
// 
// 
// Return the resulting string.
// 
//  
// Example 1:
// 
// 
// Input: word = "abcdefd", ch = "d"
// Output: "dcbaefd"
// Explanation: The first occurrence of "d" is at index 3. 
// Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
// 
// 
// Example 2:
// 
//
// ============================================================

class Solution {
    public String reversePrefix(String w, char ch) {
        int i=w.indexOf(ch);
        String s="";
        int l=i;
        while(i>=0){
          s=s+w.charAt(i--);
        }
        s=s+w.substring(l+1);
        return s;
            }
}

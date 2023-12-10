// ============================================================
//  Problem : Merge Strings Alternately
//  Difficulty : Easy
//  Topics : Two Pointers, String
//  Language : java
//  Submitted : 2023-12-10 18:59 UTC
//  Runtime : 7   Memory : 41476000
//  LeetCode URL : https://leetcode.com/problems/merge-strings-alternately/
// ============================================================
//
// Problem Description:
// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
// 
// Return the merged string.
// 
//  
// Example 1:
// 
// 
// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
// 
// 
// Example 2:
// 
// 
// Input: word1 = "ab", word2 = "pqrs"
//
// ============================================================

class Solution {
    public String mergeAlternately(String w1, String w2) {
        int l1=w1.length();
        int l2=w2.length();
        int l=(l1>l2)?l2:l1;
        int c=0;
        int k=0;
        String s="";
        for(int i=0;i<(l*2);i++){
            if(i%2==0){
                s=s+w1.charAt(c++);
            }
            else
             s=s+w2.charAt(k++);
        }
        s=(l==l1)?(s+w2.substring(k)):(s+w1.substring(c));
        return s;
}
}


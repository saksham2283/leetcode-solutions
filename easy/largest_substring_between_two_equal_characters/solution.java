// ============================================================
//  Problem : Largest Substring Between Two Equal Characters
//  Difficulty : Easy
//  Topics : Hash Table, String
//  Language : java
//  Submitted : 2023-12-31 20:15 UTC
//  Runtime : 9   Memory : 44560000
//  LeetCode URL : https://leetcode.com/problems/largest-substring-between-two-equal-characters/
// ============================================================
//
// Problem Description:
// Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.
// 
// A substring is a contiguous sequence of characters within a string.
// 
//  
// Example 1:
// 
// 
// Input: s = "aa"
// Output: 0
// Explanation: The optimal substring here is an empty substring between the two 'a's.
// 
// Example 2:
// 
// 
// Input: s = "abca"
// Output: 2
// Explanation: The optimal substring here is "bc".
// 
// 
//
// ============================================================

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int l=s.length();
       int c=-1;
        for(int i=0;i<l;i++){
            for(int j=l-1;j>i;j--){
                if(s.charAt(j)==s.charAt(i)){
                    if( (s.substring(i,j).length()-1)>c)
                     c= s.substring(i,j).length()-1;
                }
            }
        }
        return c;
    }
}

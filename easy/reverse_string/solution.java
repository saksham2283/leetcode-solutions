// ============================================================
//  Problem : Reverse String
//  Difficulty : Easy
//  Topics : Two Pointers, String
//  Language : java
//  Submitted : 2024-06-02 19:48 UTC
//  Runtime : 1   Memory : 48532000
//  LeetCode URL : https://leetcode.com/problems/reverse-string/
// ============================================================
//
// Problem Description:
// Write a function that reverses a string. The input string is given as an array of characters s.
// 
// You must do this by modifying the input array in-place with O(1) extra memory.
// 
//  
// Example 1:
// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:
// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]
// 
//  
// Constraints:
// 
// 
// 	1 <= s.length <= 105
// 	s[i] is a printable ascii character.
//
// ============================================================

class Solution {
    public void reverseString(char[] s) {
        char c[]=new char[s.length];
        int k=0;
        for(int i=s.length-1;i>=0;i--){
         c[k++]=s[i];
         //System.out.println(s[i]);
        }

        k=0;
        for(int i=0;i<s.length;i++){
         s[k++]=c[i];
         //System.out.print(s[k++]);
        }
        
    }
}

// ============================================================
//  Problem : Determine if String Halves Are Alike
//  Difficulty : Easy
//  Topics : String, Counting
//  Language : java
//  Submitted : 2024-01-12 18:24 UTC
//  Runtime : 9   Memory : 41608000
//  LeetCode URL : https://leetcode.com/problems/determine-if-string-halves-are-alike/
// ============================================================
//
// Problem Description:
// You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
// 
// Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
// 
// Return true if a and b are alike. Otherwise, return false.
// 
//  
// Example 1:
// 
// 
// Input: s = "book"
// Output: true
// Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
// 
// 
// Example 2:
// 
// 
// Input: s = "textbook"
// Output: false
//
// ============================================================

class Solution {
    public boolean halvesAreAlike(String s) {
        int k=s.length()/2;
        int c=0;
        int h=0;
        s=s.toUpperCase();
        for(int i=0;i<s.length()/2;i++){
                if(s.charAt(i)=='A'|| s.charAt(i)=='E'|| s.charAt(i)=='I'|| s.charAt(i)=='O'||s.charAt(i)=='U')
                 c++;
                 if(s.charAt(k)=='A'|| s.charAt(k)=='E'|| s.charAt(k)=='I'|| s.charAt(k)=='O'||s.charAt(k)=='U')
                 h++;
                k++;
        }
        return (c==h);
    }
}

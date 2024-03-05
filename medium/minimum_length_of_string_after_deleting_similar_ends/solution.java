// ============================================================
//  Problem : Minimum Length of String After Deleting Similar Ends
//  Difficulty : Medium
//  Topics : Two Pointers, String
//  Language : java
//  Submitted : 2024-03-05 18:33 UTC
//  Runtime : 4   Memory : 45664000
//  LeetCode URL : https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/
// ============================================================
//
// Problem Description:
// Given a string s consisting only of characters 'a', 'b', and 'c'. You are asked to apply the following algorithm on the string any number of times:
// 
// 
// 	Pick a non-empty prefix from the string s where all the characters in the prefix are equal.
// 	Pick a non-empty suffix from the string s where all the characters in this suffix are equal.
// 	The prefix and the suffix should not intersect at any index.
// 	The characters from the prefix and suffix must be the same.
// 	Delete both the prefix and the suffix.
// 
// 
// Return the minimum length of s after performing the above operation any number of times (possibly zero times).
// 
//  
// Example 1:
// 
// 
// Input: s = "ca"
// Output: 2
// Explanation: You can't remove any characters, so the string stays as is.
// 
//
// ============================================================

class Solution {
    public int minimumLength(String s) {
         int l = 0, r = s.length() - 1;
        while (l < r && s.charAt(l) == s.charAt(r)) {
            char ch = s.charAt(l);
            while (l <= r && s.charAt(l) == ch) l++;
            while (l <= r && s.charAt(r) == ch) r--;
        }
        return r - l + 1;
    }
}

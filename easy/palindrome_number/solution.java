// ============================================================
//  Problem : Palindrome Number
//  Difficulty : Easy
//  Topics : Math
//  Language : java
//  Submitted : 2024-01-11 22:16 UTC
//  Runtime : 5   Memory : 44624000
//  LeetCode URL : https://leetcode.com/problems/palindrome-number/
// ============================================================
//
// Problem Description:
// Given an integer x, return true if x is a palindrome, and false otherwise.
// 
//  
// Example 1:
// 
// 
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// 
// 
// Example 2:
// 
// 
// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// 
// 
// Example 3:
//
// ============================================================

class Solution {
    public boolean isPalindrome(int x) {
        int s=0;
        int n=x;
       while(n>0){
           s=(s*10)+(n%10);
           n=n/10;
       }
       return (s==x);
    }
}

// ============================================================
//  Problem : Valid Parenthesis String
//  Difficulty : Medium
//  Topics : String, Dynamic Programming, Stack, Greedy
//  Language : java
//  Submitted : 2024-04-07 18:28 UTC
//  Runtime : 0   Memory : 40984000
//  LeetCode URL : https://leetcode.com/problems/valid-parenthesis-string/
// ============================================================
//
// Problem Description:
// Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.
// 
// The following rules define a valid string:
// 
// 
// 	Any left parenthesis '(' must have a corresponding right parenthesis ')'.
// 	Any right parenthesis ')' must have a corresponding left parenthesis '('.
// 	Left parenthesis '(' must go before the corresponding right parenthesis ')'.
// 	'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
// 
// 
//  
// Example 1:
// Input: s = "()"
// Output: true
// Example 2:
// Input: s = "(*)"
// Output: true
// Example 3:
// Input: s = "(*))"
//
// ============================================================


class Solution {
    public boolean checkValidString(String s) {
        int p1=0,p2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                p1++;
                p2++;
            } else if(s.charAt(i)==')'){
                p1--;
                p2--;
            } else if(s.charAt(i)=='*'){
                p1++;
                p2--;
            }
            if(p1<0){
                return false;
            }
            if(p2<0){
                p2 = 0;
            }
        }
        return p2==0;
        
    }
}

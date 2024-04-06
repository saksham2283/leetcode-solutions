// ============================================================
//  Problem : Minimum Remove to Make Valid Parentheses
//  Difficulty : Medium
//  Topics : String, Stack
//  Language : java
//  Submitted : 2024-04-06 18:26 UTC
//  Runtime : 604   Memory : 45676000
//  LeetCode URL : https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
// ============================================================
//
// Problem Description:
// Given a string s of '(' , ')' and lowercase English characters.
// 
// Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.
// 
// Formally, a parentheses string is valid if and only if:
// 
// 
// 	It is the empty string, contains only lowercase characters, or
// 	It can be written as AB (A concatenated with B), where A and B are valid strings, or
// 	It can be written as (A), where A is a valid string.
// 
// 
//  
// Example 1:
// 
// 
// Input: s = "lee(t(c)o)de)"
// Output: "lee(t(c)o)de"
// Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
// 
//
// ============================================================

class Solution {
    public String minRemoveToMakeValid(String s) {
        int open=0,close=0,flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') {
                open++;
                flag+=1;
            }
            else if(s.charAt(i)==')'&&flag>0) {
                close++;
                flag--;
            }
        }
        int k=Math.min(open,close);
        String ans="";
        open=k;
        close=k;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(open>0) {
                    ans+='(';
                    open--;
                }
                continue;
            } 
            if(s.charAt(i)==')') {
               if(close>0&&close>open) {
                  ans+=')'; 
                  close--;
               }
               continue;
            }
            else ans+=s.charAt(i);
        }
        return ans;
    }
}

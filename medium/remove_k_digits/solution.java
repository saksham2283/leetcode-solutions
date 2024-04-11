// ============================================================
//  Problem : Remove K Digits
//  Difficulty : Medium
//  Topics : String, Stack, Greedy, Monotonic Stack
//  Language : java
//  Submitted : 2024-04-11 19:04 UTC
//  Runtime : 21   Memory : 44812000
//  LeetCode URL : https://leetcode.com/problems/remove-k-digits/
// ============================================================
//
// Problem Description:
// Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.
// 
//  
// Example 1:
// 
// 
// Input: num = "1432219", k = 3
// Output: "1219"
// Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
// 
// 
// Example 2:
// 
// 
// Input: num = "10200", k = 1
// Output: "200"
// Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
// 
// 
// Example 3:
//
// ============================================================

class Solution {
    public String removeKdigits(String num, int k) {
       Stack<Character> stk = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (char c : num.toCharArray()) {
            while (k > 0 && !stk.isEmpty() && stk.peek() > c) {
                stk.pop();
                k--;
            }
            stk.push(c);
        }
        while (k > 0) {
            stk.pop();
            k--;
        }
        for (char c : stk) {
            if (ans.length() == 0 && c == '0') continue;
            ans.append(c);
        }
        return ans.length() == 0 ? "0" : ans.toString(); 
    }
}

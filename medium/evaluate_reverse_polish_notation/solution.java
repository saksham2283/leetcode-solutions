// ============================================================
//  Problem : Evaluate Reverse Polish Notation
//  Difficulty : Medium
//  Topics : Array, Math, Stack
//  Language : java
//  Submitted : 2024-01-30 16:20 UTC
//  Runtime : 6   Memory : 44412000
//  LeetCode URL : https://leetcode.com/problems/evaluate-reverse-polish-notation/
// ============================================================
//
// Problem Description:
// You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
// 
// Evaluate the expression. Return an integer that represents the value of the expression.
// 
// Note that:
// 
// 
// 	The valid operators are '+', '-', '*', and '/'.
// 	Each operand may be an integer or another expression.
// 	The division between two integers always truncates toward zero.
// 	There will not be any division by zero.
// 	The input represents a valid arithmetic expression in a reverse polish notation.
// 	The answer and all the intermediate calculations can be represented in a 32-bit integer.
// 
// 
//  
// Example 1:
// 
// 
// Input: tokens = ["2","1","+","3","*"]
//
// ============================================================

class Solution {
    long resolves(long a, long b, char Operator) {
        if (Operator == '+') return a + b;
        else if (Operator == '-') return a - b;
        else if (Operator == '*') return a * b;
        return a / b;
    }

    public int evalRPN(String[] tokens) {
        Stack<Long> stack = new Stack<>();
        int n = tokens.length;
        for (int i = 0; i < n; i++) {
            if (tokens[i].length() == 1 && tokens[i].charAt(0) < 48) {
                long integer2 = stack.pop();
                long integer1 = stack.pop();
                char operator = tokens[i].charAt(0);
                long resolvedAns = resolves(integer1, integer2, operator);
                stack.push(resolvedAns);
            } else {
                stack.push(Long.parseLong(tokens[i]));
            }
        }
        return stack.pop().intValue();
    }
}

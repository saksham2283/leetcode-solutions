// ============================================================
//  Problem : Number of Steps to Reduce a Number in Binary Representation to One
//  Difficulty : Medium
//  Topics : String, Bit Manipulation, Simulation
//  Language : java
//  Submitted : 2024-05-29 20:55 UTC
//  Runtime : 0   Memory : 41252000
//  LeetCode URL : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
// ============================================================
//
// Problem Description:
// Given the binary representation of an integer as a string s, return the number of steps to reduce it to 1 under the following rules:
// 
// 
// 	
// 	If the current number is even, you have to divide it by 2.
// 	
// 	
// 	If the current number is odd, you have to add 1 to it.
// 	
// 
// 
// It is guaranteed that you can always reach one for all test cases.
// 
//  
// Example 1:
// 
// 
// Input: s = "1101"
// Output: 6
// Explanation: "1101" corressponds to number 13 in their decimal representation.
//
// ============================================================

class Solution {
    public int numSteps(String s) {
        int cnt = 0;
        int cary = 0;

        for(int i = s.length()-1; i >= 1; i--){
            int num = s.charAt(i) -'0';
            if(num == 0 && cary == 0){
                cnt++;
            }else if(num == 1 && cary == 1){
                cnt++;
                cary = 1;
            }else{
                cnt += 2;
                cary = 1;
            }
        }
        if(cary == 1)cnt++;
        return cnt;
    }
}

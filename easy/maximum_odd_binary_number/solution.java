// ============================================================
//  Problem : Maximum Odd Binary Number
//  Difficulty : Easy
//  Topics : Math, String, Greedy
//  Language : java
//  Submitted : 2024-03-01 20:47 UTC
//  Runtime : 1   Memory : 43764000
//  LeetCode URL : https://leetcode.com/problems/maximum-odd-binary-number/
// ============================================================
//
// Problem Description:
// You are given a binary string s that contains at least one '1'.
// 
// You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number that can be created from this combination.
// 
// Return a string representing the maximum odd binary number that can be created from the given combination.
// 
// Note that the resulting string can have leading zeros.
// 
//  
// Example 1:
// 
// 
// Input: s = "010"
// Output: "001"
// Explanation: Because there is just one '1', it must be in the last position. So the answer is "001".
// 
// 
// Example 2:
// 
// 
//
// ============================================================

class Solution {
    public String maximumOddBinaryNumber(String binaryString) {
        int countOnes = 0;
        StringBuilder resultBuilder = new StringBuilder();
        
        for (char ch : binaryString.toCharArray()) {
            if (ch == '1') {
                countOnes++;
            }
        }
        
        for (int i = 0; i < binaryString.length() - 1; i++) {
            if (countOnes > 1) {
                countOnes--;
                resultBuilder.append('1');
            } else {
                resultBuilder.append('0');
            }
        }
        
        resultBuilder.append('1');
        return resultBuilder.toString(); 
    }
}

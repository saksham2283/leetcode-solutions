// ============================================================
//  Problem : Add Binary
//  Difficulty : Easy
//  Topics : Math, String, Bit Manipulation, Simulation
//  Language : java
//  Submitted : 2024-04-06 22:59 UTC
//  Runtime : 1   Memory : 42324000
//  LeetCode URL : https://leetcode.com/problems/add-binary/
// ============================================================
//
// Problem Description:
// Given two binary strings a and b, return their sum as a binary string.
// 
//  
// Example 1:
// Input: a = "11", b = "1"
// Output: "100"
// Example 2:
// Input: a = "1010", b = "1011"
// Output: "10101"
// 
//  
// Constraints:
// 
// 
// 	1 <= a.length, b.length <= 104
// 	a and b consist only of '0' or '1' characters.
// 	Each string does not contain leading zeros except for the zero itself.
//
// ============================================================

class Solution {
    public String addBinary(String a, String b) {
       /* int l1=a.length();
        int l2=b.length();
        char r;
        String s="";
        for(int i=l2-1;i>=0;i--){
            char c=a.charAt(i);
            char ch=b.charAt(i);
            if(c=='1'){
                if(ch=='1'){
                 s=s+'0';
                 r='1';}
                 else 
                  s=s+ch;
            }
            else 
             s=s+ch;
            if(r=='1')
            {
              if(s.charAt(i)=='1')
                  s.charAt(i)=0;
             if(a.charAt(i-1)=='1')
             {
                 if(b.charAt(i-1)=='1')
                     
             }
            }      
        }*/
        StringBuilder sb = new StringBuilder();
int carry = 0;
int i = a.length() - 1;
int j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry == 1) {
    if (i >= 0) {
        carry += a.charAt(i--) - '0';
    }
    if (j >= 0) {
        carry += b.charAt(j--) - '0';
    }
    sb.append(carry % 2);
    carry /= 2;
        }
        return sb.reverse().toString();
    }
}

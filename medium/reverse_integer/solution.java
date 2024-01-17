// ============================================================
//  Problem : Reverse Integer
//  Difficulty : Medium
//  Topics : Math
//  Language : java
//  Submitted : 2024-01-17 19:32 UTC
//  Runtime : 9   Memory : 41760000
//  LeetCode URL : https://leetcode.com/problems/reverse-integer/
// ============================================================
//
// Problem Description:
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// 
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
// 
//  
// Example 1:
// 
// 
// Input: x = 123
// Output: 321
// 
// 
// Example 2:
// 
// 
// Input: x = -123
// Output: -321
// 
// 
// Example 3:
//
// ============================================================

class Solution {
    public int reverse(int x) {
        int n=x;
        x=(int)Math.abs(x);
        //System.out.println((int)Math.pow(2,31));
        
        String r="";
        String s=Integer.toString(x);
        int l=s.length();
        while(l-->0){
            r=r+s.charAt(l);
        }
        //System.out.println(r);
        int z;
        try{ z=Integer.valueOf(r);}
        catch(Exception e){
            return 0;
        }
        //int z=0;
        if(z>=((int)Math.pow(2,31)))
         return 0;
        if(n<0)
         z=z*-1;
        return z;
    }
}

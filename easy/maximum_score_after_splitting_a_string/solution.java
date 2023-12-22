// ============================================================
//  Problem : Maximum Score After Splitting a String
//  Difficulty : Easy
//  Topics : String, Prefix Sum
//  Language : java
//  Submitted : 2023-12-22 22:26 UTC
//  Runtime : 9   Memory : 44504000
//  LeetCode URL : https://leetcode.com/problems/maximum-score-after-splitting-a-string/
// ============================================================
//
// Problem Description:
// Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).
// 
// The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.
// 
//  
// Example 1:
// 
// 
// Input: s = "011101"
// Output: 5 
// Explanation: 
// All possible ways of splitting s into two non-empty substrings are:
// left = "0" and right = "11101", score = 1 + 4 = 5 
// left = "01" and right = "1101", score = 1 + 3 = 4 
// left = "011" and right = "101", score = 1 + 2 = 3 
// left = "0111" and right = "01", score = 1 + 1 = 2 
// left = "01110" and right = "1", score = 2 + 1 = 3
// 
// 
// Example 2:
//
// ============================================================

class Solution {
    public int maxScore(String s) {
        String l,r;
    int t=0;
        for(int i=0;i<s.length()-1;i++){
            l=s.substring(0,i+1);
            r=s.substring(i+1);
            int j=l.length();
            int k=r.length();
            int z=0;
            int o=0;
           // k--;
           // System.out.println(l+" "+r);
            while(j-->0){
                
                if(l.charAt(j)=='0')
                 z++;
                }
                while(k-->0){
                 if(r.charAt(k)=='1')
                  o++;
            }
            if((o+z)>t)
             t=o+z;
            //System.out.println(t);
        }

        return t;
    }
}

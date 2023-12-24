// ============================================================
//  Problem : Minimum Changes To Make Alternating Binary String
//  Difficulty : Easy
//  Topics : String
//  Language : java
//  Submitted : 2023-12-24 21:17 UTC
//  Runtime : 4   Memory : 42276000
//  LeetCode URL : https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
// ============================================================
//
// Problem Description:
// You are given a string s consisting only of the characters '0' and '1'. In one operation, you can change any '0' to '1' or vice versa.
// 
// The string is called alternating if no two adjacent characters are equal. For example, the string "010" is alternating, while the string "0100" is not.
// 
// Return the minimum number of operations needed to make s alternating.
// 
//  
// Example 1:
// 
// 
// Input: s = "0100"
// Output: 1
// Explanation: If you change the last character to '1', s will be "0101", which is alternating.
// 
// 
// Example 2:
// 
// 
// Input: s = "10"
// Output: 0
//
// ============================================================

class Solution {
    public int minOperations(String s) {
        int m=0;
       /* char c=s.charAt(0);
        for(int i=0;i<s.length()-1;i++){
            if(c!=s.charAt(i+1)){
             c=s.charAt(i+1);
             continue;
        }
            c=(s.charAt(i)=='0')?'1':'0';
           // s=s.replace(s.charAt(i),c);
            
            m++;   
        }
        c=s.charAt(s.length()-1);int n=0;
        for(int i=s.length()-1;i>0;i--){
            if(c!=s.charAt(i-1)){
             c=s.charAt(i-1);
             continue;
        }
            c=(s.charAt(i)=='0')?'1':'0';
           // s=s.replace(s.charAt(i),c);
            
            n++;   
        }
       // System.out.println(m+" "+n);
        m=(m>n)?n:m;*/
        int n=0;
        char c='1';
        char k='0';
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(i%2==0)
            {
                if(t!=c)
                  m++;
                if(t!=k)
                 n++;

            }
            else{
                if(t!=k)
                  m++;
                if(t!=c)
                 n++;
            }

        }
        n=(n>m)?m:n;
        return n;
    }
}

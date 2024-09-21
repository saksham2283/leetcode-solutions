// ============================================================
//  Problem : Valid Palindrome
//  Difficulty : Easy
//  Topics : Two Pointers, String
//  Language : java
//  Submitted : 2024-09-21 22:13 UTC
//  Runtime : 23   Memory : 45148000
//  LeetCode URL : https://leetcode.com/problems/valid-palindrome/
// ============================================================
//
// Problem Description:
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// 
// Given a string s, return true if it is a palindrome, or false otherwise.
// 
//  
// Example 1:
// 
// 
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// 
// 
// Example 2:
// 
// 
// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// 
//
// ============================================================

class Solution {
    public static boolean isPalindrome(String s) {
      //  int l=s.length();
        
      // s=s.toUpperCase();
    
        //String st=Solution.pal(s);
        s = s.replaceAll(
          "[^a-zA-Z0-9]", "");
       s= s.toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        StringBuilder sbr=new StringBuilder(s);
       sb.reverse();
       // String str=Solution.pal(st);
        System.out.println(sb);
        System.out.println(s);
    //System.out.println(st+"\n"+str);
        return (s.equals(sb.toString()));
    }
    public static String pal(String s){
       int l=s.length();
       String st="";
        while(l-->0){
            if((s.charAt(l)>='A'&&s.charAt(l)<='Z')||(s.charAt(l)>48&&s.charAt(l)<57))
              st=st+s.charAt(l);  
            
        }
        return st;
    } 
}

// ============================================================
//  Problem : Make The String Great
//  Difficulty : Easy
//  Topics : String, Stack
//  Language : java
//  Submitted : 2024-04-05 17:27 UTC
//  Runtime : 3   Memory : 42368000
//  LeetCode URL : https://leetcode.com/problems/make-the-string-great/
// ============================================================
//
// Problem Description:
// Given a string s of lower and upper case English letters.
// 
// A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:
// 
// 
// 	0 <= i <= s.length - 2
// 	s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
// 
// 
// To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.
// 
// Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
// 
// Notice that an empty string is also good.
// 
//  
// Example 1:
// 
// 
// Input: s = "leEeetcode"
//
// ============================================================

class Solution {
    public String makeGood(String s) {
             int n = s.length();
        ArrayDeque<Character> st = new ArrayDeque<>();
        String ans = "";
        st.push(s.charAt(0));
        char[] arr = s.toCharArray();

        for(int i=1; i<n ;i++){
            if(!st.isEmpty() && (st.peek()-arr[i]==32 || st.peek()-arr[i]==-32)){
                st.pop();
            }else{
                st.push(arr[i]);
            }
            
        }
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}

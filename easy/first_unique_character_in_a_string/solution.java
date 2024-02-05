// ============================================================
//  Problem : First Unique Character in a String
//  Difficulty : Easy
//  Topics : Hash Table, String, Queue, Counting
//  Language : java
//  Submitted : 2024-02-05 19:00 UTC
//  Runtime : 28   Memory : 44404000
//  LeetCode URL : https://leetcode.com/problems/first-unique-character-in-a-string/
// ============================================================
//
// Problem Description:
// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
// 
//  
// Example 1:
// 
// 
// Input: s = "leetcode"
// 
// Output: 0
// 
// Explanation:
// 
// The character 'l' at index 0 is the first character that does not occur at any other index.
// 
// 
// Example 2:
// 
// 
// Input: s = "loveleetcode"
// 
//
// ============================================================

class Solution {
    public int firstUniqChar(String s) {
         int n = s.length();
        if(n == 0){
            return -1;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if(map.get(ch)==1) {
                return i;
            }
        }
        return -1;
    }
}

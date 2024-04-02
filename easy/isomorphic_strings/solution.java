// ============================================================
//  Problem : Isomorphic Strings
//  Difficulty : Easy
//  Topics : Hash Table, String
//  Language : java
//  Submitted : 2024-04-02 18:53 UTC
//  Runtime : 11   Memory : 42116000
//  LeetCode URL : https://leetcode.com/problems/isomorphic-strings/
// ============================================================
//
// Problem Description:
// Given two strings s and t, determine if they are isomorphic.
// 
// Two strings s and t are isomorphic if the characters in s can be replaced to get t.
// 
// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
// 
//  
// Example 1:
// 
// 
// Input: s = "egg", t = "add"
// 
// Output: true
// 
// Explanation:
// 
// The strings s and t can be made identical by:
// 
// 
// 	Mapping 'e' to 'a'.
//
// ============================================================

class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character, Character> mapS2T = new HashMap<>();
        HashMap<Character, Character> mapT2S = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            // Check if there's a mapping for charS in mapS2T and if it maps to the same character in t
            if (mapS2T.containsKey(charS)) {
                if (mapS2T.get(charS) != charT) {
                    return false;
                }
            } else { // If no mapping exists, check if charT is already mapped to some other character in mapT2S
                if (mapT2S.containsKey(charT)) {
                    return false;
                }
                
                // Create new mapping since it's valid
                mapS2T.put(charS, charT);
                mapT2S.put(charT, charS);
            }
        }
        
        return true;   
    }
}

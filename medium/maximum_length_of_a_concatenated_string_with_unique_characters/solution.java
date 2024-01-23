// ============================================================
//  Problem : Maximum Length of a Concatenated String with Unique Characters
//  Difficulty : Medium
//  Topics : Array, String, Backtracking, Bit Manipulation
//  Language : java
//  Submitted : 2024-01-23 17:29 UTC
//  Runtime : 19   Memory : 48784000
//  LeetCode URL : https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/
// ============================================================
//
// Problem Description:
// You are given an array of strings arr. A string s is formed by the concatenation of a subsequence of arr that has unique characters.
// 
// Return the maximum possible length of s.
// 
// A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
// 
//  
// Example 1:
// 
// 
// Input: arr = ["un","iq","ue"]
// Output: 4
// Explanation: All the valid concatenations are:
// - ""
// - "un"
// - "iq"
// - "ue"
// - "uniq" ("un" + "iq")
// - "ique" ("iq" + "ue")
// Maximum length is 4.
//
// ============================================================

class Solution {
    public int maxLength(List<String> arr) {
        List<String> ansList = new ArrayList<>();
        int ans = 0;

        ansList.add("");
        for(String str : arr) {
            if(!uniqueCharacterString(str)) {
                continue;
            }
            List<String> currStr = new ArrayList<>();

            for(String candidate : ansList) {
                String temp = candidate+str;
                if(uniqueCharacterString(temp)) {
                    currStr.add(temp);
                    ans = Math.max(ans, temp.length());
                }
            }
            ansList.addAll(currStr);
        }
        return ans;
    }
     private boolean uniqueCharacterString(String str) {
        if(str.length() > 26) return false;
        int[] freq = new int[26];

        for(char ch : str.toCharArray()) {
            freq[ch-'a']++;
            if(freq[ch-'a'] > 1) {
                return false;
            }
        }
        return true;
    }
}

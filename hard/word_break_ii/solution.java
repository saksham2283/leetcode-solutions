// ============================================================
//  Problem : Word Break II
//  Difficulty : Hard
//  Topics : Array, Hash Table, String, Dynamic Programming, Backtracking, Trie, Memoization
//  Language : java
//  Submitted : 2024-05-26 20:55 UTC
//  Runtime : 0   Memory : 41732000
//  LeetCode URL : https://leetcode.com/problems/word-break-ii/
// ============================================================
//
// Problem Description:
// Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences in any order.
// 
// Note that the same word in the dictionary may be reused multiple times in the segmentation.
// 
//  
// Example 1:
// 
// 
// Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
// Output: ["cats and dog","cat sand dog"]
// 
// 
// Example 2:
// 
// 
// Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
// Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
// Explanation: Note that you are allowed to reuse a dictionary word.
// 
// 
//
// ============================================================

class Solution {
    List<String> results;
    HashSet<String> dict;
    public List<String> wordBreak(String s, List<String> wordDict) {
        results = new ArrayList<>();
        dict = new HashSet<String>();
        for(String word: wordDict)dict.add(word);
        backTrack(s,0,new StringBuilder());
        return results;
        
    }
    
    public void backTrack(String s, int start, StringBuilder currentSentence){
        if(start==s.length()) results.add(currentSentence.toString().trim());
        for(int i = start; i<s.length();i++){
            if(dict.contains(s.substring(start,i+1))) {
                int len = currentSentence.length();
                currentSentence.append(s.substring(start,i+1));
                currentSentence.append(" ");
                backTrack(s,i+1,currentSentence);
                currentSentence.setLength(len);
            }
        }
    }
}

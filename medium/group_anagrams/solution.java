// ============================================================
//  Problem : Group Anagrams
//  Difficulty : Medium
//  Topics : Array, Hash Table, String, Sorting
//  Language : java
//  Submitted : 2024-02-06 18:38 UTC
//  Runtime : 7   Memory : 47376000
//  LeetCode URL : https://leetcode.com/problems/group-anagrams/
// ============================================================
//
// Problem Description:
// Given an array of strings strs, group the anagrams together. You can return the answer in any order.
// 
//  
// Example 1:
// 
// 
// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// 
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// 
// Explanation:
// 
// 
// 	There is no string in strs that can be rearranged to form "bat".
// 	The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
// 	The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
// 
// 
// 
// Example 2:
//
// ============================================================

class Solution {
    public List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
        
        // Iterate through each word in the input array
        for (String word : words) {
            // Sort the characters in the word to create a key
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            
            // If key is not in the map, add a new entry with the word as a list
            if (!anagramGroups.containsKey(key)) {
                anagramGroups.put(key, new ArrayList<>(List.of(word)));
            }
            // If key is already present, append the word to the existing list
            else {
                anagramGroups.get(key).add(word);
            }
        }
             // Convert map values to a list and return
        return new ArrayList<>(anagramGroups.values());
    }
}

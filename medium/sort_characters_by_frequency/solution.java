// ============================================================
//  Problem : Sort Characters By Frequency
//  Difficulty : Medium
//  Topics : Hash Table, String, Sorting, Heap (Priority Queue), Bucket Sort, Counting
//  Language : java
//  Submitted : 2024-02-07 20:11 UTC
//  Runtime : 15   Memory : 45040000
//  LeetCode URL : https://leetcode.com/problems/sort-characters-by-frequency/
// ============================================================
//
// Problem Description:
// Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
// 
// Return the sorted string. If there are multiple answers, return any of them.
// 
//  
// Example 1:
// 
// 
// Input: s = "tree"
// Output: "eert"
// Explanation: 'e' appears twice while 'r' and 't' both appear once.
// So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
// 
// 
// Example 2:
// 
// 
// Input: s = "cccaaa"
// Output: "aaaccc"
// Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
//
// ============================================================

class Solution {
    public String frequencySort(String s) {
            // Step 1: Count the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Step 2: Sort characters based on their frequency in descending order
        List<Character> sortedChars = new ArrayList<>(charCount.keySet());
        Collections.sort(sortedChars, (a, b) -> charCount.get(b) - charCount.get(a));

        // Step 3: Build the result string by repeating characters according to their frequency
        StringBuilder result = new StringBuilder();
        for (char c : sortedChars) {
            result.append(String.valueOf(c).repeat(charCount.get(c)));
        }

        // Step 4: Return the final sorted string
        return result.toString();
    }
}

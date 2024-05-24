// ============================================================
//  Problem : Maximum Score Words Formed by Letters
//  Difficulty : Hard
//  Topics : Array, Hash Table, String, Dynamic Programming, Backtracking, Bit Manipulation, Counting, Bitmask
//  Language : java
//  Submitted : 2024-05-24 19:30 UTC
//  Runtime : 5   Memory : 43788000
//  LeetCode URL : https://leetcode.com/problems/maximum-score-words-formed-by-letters/
// ============================================================
//
// Problem Description:
// Given a list of words, list of  single letters (might be repeating) and score of every character.
// 
// Return the maximum score of any valid set of words formed by using the given letters (words[i] cannot be used two or more times).
// 
// It is not necessary to use all characters in letters and each letter can only be used once. Score of letters 'a', 'b', 'c', ... ,'z' is given by score[0], score[1], ... , score[25] respectively.
// 
//  
// Example 1:
// 
// 
// Input: words = ["dog","cat","dad","good"], letters = ["a","a","c","d","d","d","g","o","o"], score = [1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0]
// Output: 23
// Explanation:
// Score  a=1, c=9, d=5, g=3, o=2
// Given letters, we can form the words "dad" (5+1+5) and "good" (3+2+2+5) with a score of 23.
// Words "dad" and "dog" only get a score of 21.
// 
// Example 2:
// 
// 
//
// ============================================================

class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        // Step 1: Count the available letters
        Map<Character, Integer> lettersCounter = new HashMap<>();
        for (char letter : letters) {
            lettersCounter.put(letter, lettersCounter.getOrDefault(letter, 0) + 1);
        }

        // Step 2: Initialize the totalScore
        int[] totalScore = new int[1];

        // Step 3: Define the recursive function to explore all combinations
        explore(words, lettersCounter, score, 0, 0, totalScore);

        // Step 4: Return the maximum score found
        return totalScore[0];
    }

    private void explore(String[] words, Map<Character, Integer> letterCounter, int[] score, int index, int currScore,
            int[] totalScore) {
        // Update the total score with the current score if it's higher
        totalScore[0] = Math.max(totalScore[0], currScore);

        // Base case: if all words have been considered, return
        if (index == words.length) {
            return;
        }

        // Step 3: Try each word starting from the current index
        for (int i = index; i < words.length; i++) {
            Map<Character, Integer> tmpCounter = new HashMap<>(letterCounter);
            String word = words[i];
            int wordScore = 0;
            boolean isValid = true;

            // Check if the word can be formed with the available letters
            for (char ch : word.toCharArray()) {
                if (tmpCounter.getOrDefault(ch, 0) > 0) {
                    tmpCounter.put(ch, tmpCounter.get(ch) - 1);
                    wordScore += score[ch - 'a'];
                } else {
                    isValid = false;
                    break;
                }
            }

            // If the word can be formed, explore further with the updated state
            if (isValid) {
                explore(words, tmpCounter, score, i + 1, currScore + wordScore, totalScore);
            }
        }
    }
}

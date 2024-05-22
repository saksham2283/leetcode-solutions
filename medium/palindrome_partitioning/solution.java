// ============================================================
//  Problem : Palindrome Partitioning
//  Difficulty : Medium
//  Topics : String, Dynamic Programming, Backtracking
//  Language : java
//  Submitted : 2024-05-22 16:44 UTC
//  Runtime : 8   Memory : 57048000
//  LeetCode URL : https://leetcode.com/problems/palindrome-partitioning/
// ============================================================
//
// Problem Description:
// Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.
// 
//  
// Example 1:
// Input: s = "aab"
// Output: [["a","a","b"],["aa","b"]]
// Example 2:
// Input: s = "a"
// Output: [["a"]]
// 
//  
// Constraints:
// 
// 
// 	1 <= s.length <= 16
// 	s contains only lowercase English letters.
//
// ============================================================

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        int lenS = s.length();

        explore(0, s, curr, result, lenS);
        return result;
    }

    private void explore(int index, String s, List<String> curr, List<List<String>> result, int lenS) {
        if (index >= lenS) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = index; i < lenS; ++i) {
            String subStr = s.substring(index, i + 1);
            if (isPalindrome(subStr)) {
                curr.add(subStr);
                explore(i + 1, s, curr, result, lenS);
                curr.remove(curr.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}

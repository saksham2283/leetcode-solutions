// ============================================================
//  Problem : First Missing Positive
//  Difficulty : Hard
//  Topics : Array, Hash Table
//  Language : java
//  Submitted : 2024-03-26 19:32 UTC
//  Runtime : 11   Memory : 60332000
//  LeetCode URL : https://leetcode.com/problems/first-missing-positive/
// ============================================================
//
// Problem Description:
// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
// 
// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
// 
//  
// Example 1:
// 
// 
// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.
// 
// 
// Example 2:
// 
// 
// Input: nums = [3,4,-1,1]
// Output: 2
// Explanation: 1 is in the array but 2 is missing.
// 
//
// ============================================================

class Solution {
    public int firstMissingPositive(int[] nums) {
         HashMap<Integer, Boolean> mp = new HashMap<>();
        int maxi = Integer.MIN_VALUE;
        for (int num : nums) {
            mp.put(num, true);
            maxi = Math.max(maxi, num);
        }
        for (int i = 1; i < maxi; i++) {
            if (!mp.containsKey(i))
                return i;
        }
        return maxi < 0 ? 1 : maxi + 1;
    }
}

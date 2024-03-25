// ============================================================
//  Problem : Find All Duplicates in an Array
//  Difficulty : Medium
//  Topics : Array, Hash Table, Sorting
//  Language : java
//  Submitted : 2024-03-25 18:16 UTC
//  Runtime : 6   Memory : 53448000
//  LeetCode URL : https://leetcode.com/problems/find-all-duplicates-in-an-array/
// ============================================================
//
// Problem Description:
// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
// 
// You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output
// 
//  
// Example 1:
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]
// Example 2:
// Input: nums = [1,1,2]
// Output: [1]
// Example 3:
// Input: nums = [1]
// Output: []
// 
//  
// Constraints:
// 
// 
// 	n == nums.length
//
// ============================================================

class Solution {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> result = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int num = Math.abs(nums[i]);

            int idx = num - 1;

            if (nums[idx] < 0)

                result.add(num);

            nums[idx] *= -1;

        }

        return result;

    }

}

        



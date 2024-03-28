// ============================================================
//  Problem : Length of Longest Subarray With at Most K Frequency
//  Difficulty : Medium
//  Topics : Array, Hash Table, Sliding Window
//  Language : java
//  Submitted : 2024-03-28 03:24 UTC
//  Runtime : 80   Memory : 60584000
//  LeetCode URL : https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/
// ============================================================
//
// Problem Description:
// You are given an integer array nums and an integer k.
// 
// The frequency of an element x is the number of times it occurs in an array.
// 
// An array is called good if the frequency of each element in this array is less than or equal to k.
// 
// Return the length of the longest good subarray of nums.
// 
// A subarray is a contiguous non-empty sequence of elements within an array.
// 
//  
// Example 1:
// 
// 
// Input: nums = [1,2,3,1,2,3,1,2], k = 2
// Output: 6
// Explanation: The longest possible good subarray is [1,2,3,1,2,3] since the values 1, 2, and 3 occur at most twice in this subarray. Note that the subarrays [2,3,1,2,3,1] and [3,1,2,3,1,2] are also good.
// It can be shown that there are no good subarrays with length more than 6.
// 
// 
//
// ============================================================

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
         int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);
            while (mp.get(nums[r]) > k) {
                mp.put(nums[l], mp.get(nums[l]) - 1);
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}

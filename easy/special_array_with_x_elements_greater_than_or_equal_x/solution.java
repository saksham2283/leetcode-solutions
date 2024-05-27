// ============================================================
//  Problem : Special Array With X Elements Greater Than or Equal X
//  Difficulty : Easy
//  Topics : Array, Binary Search, Sorting
//  Language : java
//  Submitted : 2024-05-27 22:14 UTC
//  Runtime : 2   Memory : 41072000
//  LeetCode URL : https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
// ============================================================
//
// Problem Description:
// You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.
// 
// Notice that x does not have to be an element in nums.
// 
// Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.
// 
//  
// Example 1:
// 
// 
// Input: nums = [3,5]
// Output: 2
// Explanation: There are 2 values (3 and 5) that are greater than or equal to 2.
// 
// 
// Example 2:
// 
// 
// Input: nums = [0,0]
// Output: -1
//
// ============================================================

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int candidateNumber = 1; candidateNumber <= n; ++candidateNumber) {
            if (candidateNumber == findNumberOfNums(nums, n, candidateNumber)) {
                return candidateNumber;
            }
        }

        return -1;
    }

    private int findNumberOfNums(int[] nums, int n, int curNum) {
        int left = 0, right = n - 1;
        int firstIndex = n;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] >= curNum) {
                firstIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return n - firstIndex;
    }
}

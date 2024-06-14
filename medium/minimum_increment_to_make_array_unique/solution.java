// ============================================================
//  Problem : Minimum Increment to Make Array Unique
//  Difficulty : Medium
//  Topics : Array, Greedy, Sorting, Counting
//  Language : java
//  Submitted : 2024-06-14 22:54 UTC
//  Runtime : 37   Memory : 59916000
//  LeetCode URL : https://leetcode.com/problems/minimum-increment-to-make-array-unique/
// ============================================================
//
// Problem Description:
// You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1.
// 
// Return the minimum number of moves to make every value in nums unique.
// 
// The test cases are generated so that the answer fits in a 32-bit integer.
// 
//  
// Example 1:
// 
// 
// Input: nums = [1,2,2]
// Output: 1
// Explanation: After 1 move, the array could be [1, 2, 3].
// 
// 
// Example 2:
// 
// 
// Input: nums = [3,2,1,2,1,7]
// Output: 6
//
// ============================================================

class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                ans += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }
        return ans;
    }
}

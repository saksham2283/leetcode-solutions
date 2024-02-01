// ============================================================
//  Problem : Divide Array Into Arrays With Max Difference
//  Difficulty : Medium
//  Topics : Array, Greedy, Sorting
//  Language : java
//  Submitted : 2024-02-01 20:09 UTC
//  Runtime : 20   Memory : 61092000
//  LeetCode URL : https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/
// ============================================================
//
// Problem Description:
// You are given an integer array nums of size n where n is a multiple of 3 and a positive integer k.
// 
// Divide the array nums into n / 3 arrays of size 3 satisfying the following condition:
// 
// 
// 	The difference between any two elements in one array is less than or equal to k.
// 
// 
// Return a 2D array containing the arrays. If it is impossible to satisfy the conditions, return an empty array. And if there are multiple answers, return any of them.
// 
//  
// Example 1:
// 
// 
// Input: nums = [1,3,4,8,7,9,3,5,1], k = 2
// 
// Output: [[1,1,3],[3,4,5],[7,8,9]]
// 
// Explanation:
// 
//
// ============================================================

class Solution {
     public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> res = new ArrayList<>();
        for (int i = 2; i < nums.length; i += 3) {
            if (nums[i] - nums[i - 2] > k) return new int[][]{};
            res.add(new int[]{nums[i - 2], nums[i - 1], nums[i]});
        }
        return res.toArray(new int[res.size()][]);
    }
}

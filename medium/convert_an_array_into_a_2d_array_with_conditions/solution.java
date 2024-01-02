// ============================================================
//  Problem : Convert an Array Into a 2D Array With Conditions
//  Difficulty : Medium
//  Topics : Array, Hash Table
//  Language : java
//  Submitted : 2024-01-02 19:01 UTC
//  Runtime : 6   Memory : 44440000
//  LeetCode URL : https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
// ============================================================
//
// Problem Description:
// You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:
// 
// 
// 	The 2D array should contain only the elements of the array nums.
// 	Each row in the 2D array contains distinct integers.
// 	The number of rows in the 2D array should be minimal.
// 
// 
// Return the resulting array. If there are multiple answers, return any of them.
// 
// Note that the 2D array can have a different number of elements on each row.
// 
//  
// Example 1:
// 
// 
// Input: nums = [1,3,4,1,2,3,1]
// Output: [[1,3,4,2],[1,3],[1]]
// Explanation: We can create a 2D array that contains the following rows:
// - 1,3,4,2
//
// ============================================================

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> lol = new ArrayList<>();
        Arrays.sort(nums);
        int count = 1, max = 1;
        int a = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(count, max);
        }

        for (int j = 0; j < max; j++) {
            lol.add(new ArrayList<>());
        }

        lol.get(0).add(nums[0]);
        for (int k = 1; k < nums.length; k++) {
            if (nums[k] == nums[k - 1]) {
                a = a + 1;
            } else {
                a = 0;
            }
            if (a < max) {
                lol.get(a).add(nums[k]);
            }
        }

        return lol;
    }
}

// ============================================================
//  Problem : The Number of Beautiful Subsets
//  Difficulty : Medium
//  Topics : Array, Hash Table, Math, Dynamic Programming, Backtracking, Sorting, Combinatorics
//  Language : java
//  Submitted : 2024-05-23 22:43 UTC
//  Runtime : 882   Memory : 44948000
//  LeetCode URL : https://leetcode.com/problems/the-number-of-beautiful-subsets/
// ============================================================
//
// Problem Description:
// You are given an array nums of positive integers and a positive integer k.
// 
// A subset of nums is beautiful if it does not contain two integers with an absolute difference equal to k.
// 
// Return the number of non-empty beautiful subsets of the array nums.
// 
// A subset of nums is an array that can be obtained by deleting some (possibly none) elements from nums. Two subsets are different if and only if the chosen indices to delete are different.
// 
//  
// Example 1:
// 
// 
// Input: nums = [2,4,6], k = 2
// Output: 4
// Explanation: The beautiful subsets of the array nums are: [2], [4], [6], [2, 6].
// It can be proved that there are only 4 beautiful subsets in the array [2,4,6].
// 
// 
// Example 2:
// 
//
// ============================================================

public class Solution {
    private int count;
    private Map<Integer, Integer> visited;

    public Solution() {
        this.count = 0;
        this.visited = new HashMap<>();
    }

    public int beautifulSubsets(int[] nums, int k) {
        explore(nums, k, 0);
        return count - 1; // Subtract 1 to exclude the empty subset
    }

    private void explore(int[] nums, int k, int index) {
        if (index == nums.length) {
            count++;
            return;
        }

        int num = nums[index];

        if (!visited.containsKey(num - k) && !visited.containsKey(num + k)) {
            visited.put(num, visited.getOrDefault(num, 0) + 1);
            explore(nums, k, index + 1);
            visited.put(num, visited.get(num) - 1);
            if (visited.get(num) == 0) {
                visited.remove(num);
            }
        }

        explore(nums, k, index + 1);
    }
}

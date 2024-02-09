// ============================================================
//  Problem : Largest Divisible Subset
//  Difficulty : Medium
//  Topics : Array, Math, Dynamic Programming, Sorting
//  Language : java
//  Submitted : 2024-02-09 20:33 UTC
//  Runtime : 13   Memory : 43180000
//  LeetCode URL : https://leetcode.com/problems/largest-divisible-subset/
// ============================================================
//
// Problem Description:
// Given a set of distinct positive integers nums, return the largest subset answer such that every pair (answer[i], answer[j]) of elements in this subset satisfies:
// 
// 
// 	answer[i] % answer[j] == 0, or
// 	answer[j] % answer[i] == 0
// 
// 
// If there are multiple solutions, return any of them.
// 
//  
// Example 1:
// 
// 
// Input: nums = [1,2,3]
// Output: [1,2]
// Explanation: [1,3] is also accepted.
// 
// 
// Example 2:
// 
//
// ============================================================

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
         Arrays.sort(nums);
        int n = nums.length;
       
        int[] groupSize = new int[n];
        int[] prevElement = new int[n];
        int maxIndex = 0;

        for(int i=0;i<n;i++) {
            groupSize[i] = 1;
            prevElement[i] = -1;
            for(int j=0;j<i;j++) {
                if(nums[i]%nums[j] == 0) {
                    if(groupSize[i] < 1 + groupSize[j]) {
                        groupSize[i] = 1 + groupSize[j];
                        prevElement[i] = j;
                    }
                }
            }
            if(groupSize[i] > groupSize[maxIndex]) {
                maxIndex = i;
            }
        }

        List<Integer> result = new ArrayList();
        while(maxIndex != -1) {
            result.add(0, nums[maxIndex]);
            maxIndex = prevElement[maxIndex];
        }

        return result;
    }
}

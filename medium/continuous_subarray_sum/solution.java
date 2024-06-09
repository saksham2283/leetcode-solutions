// ============================================================
//  Problem : Continuous Subarray Sum
//  Difficulty : Medium
//  Topics : Array, Hash Table, Math, Prefix Sum
//  Language : java
//  Submitted : 2024-06-09 22:34 UTC
//  Runtime : 21   Memory : 57672000
//  LeetCode URL : https://leetcode.com/problems/continuous-subarray-sum/
// ============================================================
//
// Problem Description:
// Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
// 
// A good subarray is a subarray where:
// 
// 
// 	its length is at least two, and
// 	the sum of the elements of the subarray is a multiple of k.
// 
// 
// Note that:
// 
// 
// 	A subarray is a contiguous part of the array.
// 	An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
// 
// 
//  
// Example 1:
// 
// 
//
// ============================================================

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
/* int pro = nums[0];
        int i = 0, j = 1;
        while (j < nums.length) {
            if(pro<k){
                pro *= nums[j];
                j++;
            }
           else if (pro % k > 0) {
                pro /= nums[i];
                i++;
            } else if (pro % k == 0 && j - i >= 1) {
                return true;
            }
        }
        return false;
        */
         Map<Integer, Integer> remainderIndexMap = new HashMap<>();
        remainderIndexMap.put(0, -1); // To handle the case where the subarray starts from index 0
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;

            if (remainderIndexMap.containsKey(remainder)) {
                if (i - remainderIndexMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                remainderIndexMap.put(remainder, i);
            }
        }

        return false;
    }
}

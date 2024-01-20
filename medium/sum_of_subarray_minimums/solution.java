// ============================================================
//  Problem : Sum of Subarray Minimums
//  Difficulty : Medium
//  Topics : Array, Dynamic Programming, Stack, Monotonic Stack
//  Language : java
//  Submitted : 2024-01-20 22:04 UTC
//  Runtime : 2631   Memory : 50536000
//  LeetCode URL : https://leetcode.com/problems/sum-of-subarray-minimums/
// ============================================================
//
// Problem Description:
// Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray of arr. Since the answer may be large, return the answer modulo 109 + 7.
// 
//  
// Example 1:
// 
// 
// Input: arr = [3,1,2,4]
// Output: 17
// Explanation: 
// Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4]. 
// Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.
// Sum is 17.
// 
// 
// Example 2:
// 
// 
// Input: arr = [11,81,94,43,3]
// Output: 444
// 
//
// ============================================================

class Solution {
   public static final int MOD = 1_000_000_007;

    public int sumSubarrayMins(int[] arr) {
        long sumOfMin = 0;

        for(int i = 0; i < arr.length; i++){
            sumOfMin = (sumOfMin + findSubArrayMin(arr, i)) % MOD;
        }
        return (int)sumOfMin;
    }

    public static int findSubArrayMin(int[] arr, int start){
        int minVal = arr[start];
        int result = 0;

        for(int i = start; i < arr.length; i++){
            minVal = Math.min(minVal, arr[i]);
            result += minVal;
        }
        return result;
    }
}

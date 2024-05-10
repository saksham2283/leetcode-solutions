// ============================================================
//  Problem : K-th Smallest Prime Fraction
//  Difficulty : Medium
//  Topics : Array, Two Pointers, Binary Search, Sorting, Heap (Priority Queue)
//  Language : java
//  Submitted : 2024-05-10 18:22 UTC
//  Runtime : 4   Memory : 42068000
//  LeetCode URL : https://leetcode.com/problems/k-th-smallest-prime-fraction/
// ============================================================
//
// Problem Description:
// You are given a sorted integer array arr containing 1 and prime numbers, where all the integers of arr are unique. You are also given an integer k.
// 
// For every i and j where 0 <= i < j < arr.length, we consider the fraction arr[i] / arr[j].
// 
// Return the kth smallest fraction considered. Return your answer as an array of integers of size 2, where answer[0] == arr[i] and answer[1] == arr[j].
// 
//  
// Example 1:
// 
// 
// Input: arr = [1,2,3,5], k = 3
// Output: [2,5]
// Explanation: The fractions to be considered in sorted order are:
// 1/5, 1/3, 2/5, 1/2, 3/5, and 2/3.
// The third fraction is 2/5.
// 
// 
// Example 2:
// 
// 
//
// ============================================================

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
       int n = arr.length;
        double left = 0, right = 1, mid;
        int[] res = new int[2];

        while (left <= right) {
            mid = left + (right - left) / 2;
            int j = 1, total = 0, num = 0, den = 0;
            double maxFrac = 0;
            for (int i = 0; i < n; ++i) {
                while (j < n && arr[i] >= arr[j] * mid) {
                    ++j;
                }
                
                total += n - j;

                if (j < n && maxFrac < arr[i] * 1.0 / arr[j]) {
                    maxFrac = arr[i] * 1.0 / arr[j];
                    num = i;
                    den = j;
                }
            }

            if (total == k) {
                res[0] = arr[num];
                res[1] = arr[den];
                break;
            }

            if (total > k) {
                right = mid;
            } else {
                left = mid;
            }
        }

        return res;  
    }
}

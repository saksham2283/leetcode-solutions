// ============================================================
//  Problem : Count Triplets That Can Form Two Arrays of Equal XOR
//  Difficulty : Medium
//  Topics : Array, Hash Table, Math, Bit Manipulation, Prefix Sum
//  Language : java
//  Submitted : 2024-05-30 20:24 UTC
//  Runtime : 2   Memory : 41456000
//  LeetCode URL : https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/
// ============================================================
//
// Problem Description:
// Given an array of integers arr.
// 
// We want to select three indices i, j and k where (0 <= i < j <= k < arr.length).
// 
// Let's define a and b as follows:
// 
// 
// 	a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
// 	b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]
// 
// 
// Note that ^ denotes the bitwise-xor operation.
// 
// Return the number of triplets (i, j and k) Where a == b.
// 
//  
// Example 1:
// 
// 
// Input: arr = [2,3,1,6,7]
//
// ============================================================

class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] ^ arr[i];
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (prefix[i] == prefix[k + 1]) {
                    count += (k - i);
                }
            }
        }
        
        return count;
    }
}

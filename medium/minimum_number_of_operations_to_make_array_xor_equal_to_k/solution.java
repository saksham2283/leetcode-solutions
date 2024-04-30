// ============================================================
//  Problem : Minimum Number of Operations to Make Array XOR Equal to K
//  Difficulty : Medium
//  Topics : Array, Bit Manipulation
//  Language : java
//  Submitted : 2024-04-30 03:28 UTC
//  Runtime : 1   Memory : 57152000
//  LeetCode URL : https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/
// ============================================================
//
// Problem Description:
// You are given a 0-indexed integer array nums and a positive integer k.
// 
// You can apply the following operation on the array any number of times:
// 
// 
// 	Choose any element of the array and flip a bit in its binary representation. Flipping a bit means changing a 0 to 1 or vice versa.
// 
// 
// Return the minimum number of operations required to make the bitwise XOR of all elements of the final array equal to k.
// 
// Note that you can flip leading zero bits in the binary representation of elements. For example, for the number (101)2 you can flip the fourth bit and obtain (1101)2.
// 
//  
// Example 1:
// 
// 
// Input: nums = [2,1,3,4], k = 1
// Output: 2
// Explanation: We can do the following operations:
// - Choose element 2 which is 3 == (011)2, we flip the first bit and we obtain (010)2 == 2. nums becomes [2,1,2,4].
//
// ============================================================

class Solution {
    public int minOperations(int[] nums, int k) {
               int ans = 0;
        for (int x : nums) {
            ans = ans ^ x;
        }
        ans = ans ^ k;
        int res = 0;
        while (ans > 0) {
            if ((ans & 1) != 0)
                res++;
            ans = ans >> 1;
        }
        return res;
 
    }
}

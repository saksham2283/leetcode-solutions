// ============================================================
//  Problem : Find the Maximum Sum of Node Values
//  Difficulty : Hard
//  Topics : Array, Dynamic Programming, Greedy, Bit Manipulation, Tree, Sorting
//  Language : java
//  Submitted : 2024-05-19 22:05 UTC
//  Runtime : 15   Memory : 58200000
//  LeetCode URL : https://leetcode.com/problems/find-the-maximum-sum-of-node-values/
// ============================================================
//
// Problem Description:
// There exists an undirected tree with n nodes numbered 0 to n - 1. You are given a 0-indexed 2D integer array edges of length n - 1, where edges[i] = [ui, vi] indicates that there is an edge between nodes ui and vi in the tree. You are also given a positive integer k, and a 0-indexed array of non-negative integers nums of length n, where nums[i] represents the value of the node numbered i.
// 
// Alice wants the sum of values of tree nodes to be maximum, for which Alice can perform the following operation any number of times (including zero) on the tree:
// 
// 
// 	Choose any edge [u, v] connecting the nodes u and v, and update their values as follows:
// 
// 	
// 		nums[u] = nums[u] XOR k
// 		nums[v] = nums[v] XOR k
// 	
// 	
// 
// 
// Return the maximum possible sum of the values Alice can achieve by performing the operation any number of times.
// 
//  
// Example 1:
// 
// 
//
// ============================================================

class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int n = nums.length;
        long[][] temp = new long[n][2]; // temp[current_index(node)][is_even]
        for (int i = 0; i < n; i++) {
            temp[i][0] = -1;
            temp[i][1] = -1;
        }

        return calculateMax(nums, n, k, 0, 1, temp);  // is_even == 1 because we have XORed 0 nodes which is even
    }

    // calculate_max -> cur_ind -> cur_index of the tree and is_even represents whether we have already changed (XOR) even or odd number of nodes 
    private long calculateMax(int[] nums, int n, int k, int curInd, int isEven, long[][] temp) {
        if (curInd == n) {  // if we go to node which doesn't exist
            return isEven == 1 ? 0 : Long.MIN_VALUE;
        }
        if (temp[curInd][isEven] != -1) {  // if we've already encountered this state
            return temp[curInd][isEven];
        }

        // checking all possible variants (no XOR or XOR)
        long noXor = nums[curInd] + calculateMax(nums, n, k, curInd + 1, isEven, temp);  // we don't change the number of XOR nodes
        long withXor = (nums[curInd] ^ k) + calculateMax(nums, n, k, curInd + 1, 1 - isEven, temp);  // we added 1 XORed node

        long mxPossible = Math.max(noXor, withXor);
        temp[curInd][isEven] = mxPossible;
        return mxPossible;
    }
}

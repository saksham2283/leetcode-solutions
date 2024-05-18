// ============================================================
//  Problem : Distribute Coins in Binary Tree
//  Difficulty : Medium
//  Topics : Tree, Depth-First Search, Binary Tree
//  Language : java
//  Submitted : 2024-05-18 19:12 UTC
//  Runtime : 0   Memory : 41884000
//  LeetCode URL : https://leetcode.com/problems/distribute-coins-in-binary-tree/
// ============================================================
//
// Problem Description:
// You are given the root of a binary tree with n nodes where each node in the tree has node.val coins. There are n coins in total throughout the whole tree.
// 
// In one move, we may choose two adjacent nodes and move one coin from one node to another. A move may be from parent to child, or from child to parent.
// 
// Return the minimum number of moves required to make every node have exactly one coin.
// 
//  
// Example 1:
// 
// 
// Input: root = [3,0,0]
// Output: 2
// Explanation: From the root of the tree, we move one coin to its left child, and one coin to its right child.
// 
// 
// Example 2:
// 
// 
// Input: root = [0,3,0]
// Output: 3
//
// ============================================================

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     private int moves = 0;
    
    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int left_excess = dfs(node.left);
        int right_excess = dfs(node.right);
        moves += Math.abs(left_excess) + Math.abs(right_excess);
        return node.val + left_excess + right_excess - 1;
    }

    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }
}

// ============================================================
//  Problem : Same Tree
//  Difficulty : Easy
//  Topics : Tree, Depth-First Search, Breadth-First Search, Binary Tree
//  Language : java
//  Submitted : 2024-02-26 18:17 UTC
//  Runtime : 0   Memory : 41040000
//  LeetCode URL : https://leetcode.com/problems/same-tree/
// ============================================================
//
// Problem Description:
// Given the roots of two binary trees p and q, write a function to check if they are the same or not.
// 
// Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
// 
//  
// Example 1:
// 
// 
// Input: p = [1,2,3], q = [1,2,3]
// Output: true
// 
// 
// Example 2:
// 
// 
// Input: p = [1,2], q = [1,null,2]
// Output: false
// 
// 
// Example 3:
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
      
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); 
    }
}

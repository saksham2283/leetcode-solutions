// ============================================================
//  Problem : Maximum Difference Between Node and Ancestor
//  Difficulty : Medium
//  Topics : Tree, Depth-First Search, Binary Tree
//  Language : java
//  Submitted : 2024-01-11 19:16 UTC
//  Runtime : 0   Memory : 41700000
//  LeetCode URL : https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
// ============================================================
//
// Problem Description:
// Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b where v = |a.val - b.val| and a is an ancestor of b.
// 
// A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.
// 
//  
// Example 1:
// 
// 
// Input: root = [8,3,10,1,6,null,14,null,null,4,7,13]
// Output: 7
// Explanation: We have various ancestor-node differences, some of which are given below :
// |8 - 3| = 5
// |3 - 7| = 4
// |8 - 1| = 7
// |10 - 13| = 3
// Among all possible differences, the maximum value of 7 is obtained by |8 - 1| = 7.
// 
// Example 2:
// 
// 
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
    int diff=Integer.MIN_VALUE;
    public int maxAncestorDiff(TreeNode root) {
        dfs(root,root.val,root.val);
        return diff;
    }
    public void dfs(TreeNode root,int max,int min){
        if(root==null)
            return;
        max=Math.max(max,root.val);
        min=Math.min(min,root.val);
        diff=Math.max(diff,max-min);
        dfs(root.left,max,min);
        dfs(root.right,max,min);
    }
}

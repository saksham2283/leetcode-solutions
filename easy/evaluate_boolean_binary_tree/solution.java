// ============================================================
//  Problem : Evaluate Boolean Binary Tree
//  Difficulty : Easy
//  Topics : Tree, Depth-First Search, Binary Tree
//  Language : java
//  Submitted : 2024-05-16 13:13 UTC
//  Runtime : 0   Memory : 44104000
//  LeetCode URL : https://leetcode.com/problems/evaluate-boolean-binary-tree/
// ============================================================
//
// Problem Description:
// You are given the root of a full binary tree with the following properties:
// 
// 
// 	Leaf nodes have either the value 0 or 1, where 0 represents False and 1 represents True.
// 	Non-leaf nodes have either the value 2 or 3, where 2 represents the boolean OR and 3 represents the boolean AND.
// 
// 
// The evaluation of a node is as follows:
// 
// 
// 	If the node is a leaf node, the evaluation is the value of the node, i.e. True or False.
// 	Otherwise, evaluate the node's two children and apply the boolean operation of its value with the children's evaluations.
// 
// 
// Return the boolean result of evaluating the root node.
// 
// A full binary tree is a binary tree where each node has either 0 or 2 children.
// 
// A leaf node is a node that has zero children.
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
   public boolean helper(TreeNode root) {
        if(root.val == 0 || root.val == 1) {
            return root.val == 1;
        } else if(root.val == 2) {
            return helper(root.left) || helper(root.right);
        } else if(root.val == 3) {
            return helper(root.left) && helper(root.right);
        } 

        return false;
    }
    public boolean evaluateTree(TreeNode root) {
        return helper(root);
    }
}

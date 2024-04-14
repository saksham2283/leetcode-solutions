// ============================================================
//  Problem : Sum of Left Leaves
//  Difficulty : Easy
//  Topics : Tree, Depth-First Search, Breadth-First Search, Binary Tree
//  Language : java
//  Submitted : 2024-04-14 23:20 UTC
//  Runtime : 0   Memory : 41424000
//  LeetCode URL : https://leetcode.com/problems/sum-of-left-leaves/
// ============================================================
//
// Problem Description:
// Given the root of a binary tree, return the sum of all left leaves.
// 
// A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
// 
//  
// Example 1:
// 
// 
// Input: root = [3,9,20,null,null,15,7]
// Output: 24
// Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
// 
// 
// Example 2:
// 
// 
// Input: root = [1]
// Output: 0
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
     public int sumOfLeftLeaves(TreeNode root) {
        return find_val(root,1);
    }
    public static int find_val(TreeNode root,int flag){
        if(root==null) return 0;
        if(flag==0&&root.right==null&&root.left==null) return root.val;
        return find_val(root.left,0)+find_val(root.right,1); 
    }
}

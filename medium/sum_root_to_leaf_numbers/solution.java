// ============================================================
//  Problem : Sum Root to Leaf Numbers
//  Difficulty : Medium
//  Topics : Tree, Depth-First Search, Binary Tree
//  Language : java
//  Submitted : 2024-04-15 17:33 UTC
//  Runtime : 0   Memory : 41240000
//  LeetCode URL : https://leetcode.com/problems/sum-root-to-leaf-numbers/
// ============================================================
//
// Problem Description:
// You are given the root of a binary tree containing digits from 0 to 9 only.
// 
// Each root-to-leaf path in the tree represents a number.
// 
// 
// 	For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
// 
// 
// Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.
// 
// A leaf node is a node with no children.
// 
//  
// Example 1:
// 
// 
// Input: root = [1,2,3]
// Output: 25
// Explanation:
// The root-to-leaf path 1->2 represents the number 12.
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
    public int sumTree(TreeNode root,int sum){
        if(root==null) return 0;
        sum=sum*10+root.val;
        if(root.left==null && root.right==null) return sum;
        return sumTree(root.left,sum)+sumTree(root.right,sum);
    }
    public int sumNumbers(TreeNode root) {
                return sumTree(root,0);
    }
}

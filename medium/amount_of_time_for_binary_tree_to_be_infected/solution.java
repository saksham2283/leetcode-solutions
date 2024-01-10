// ============================================================
//  Problem : Amount of Time for Binary Tree to Be Infected
//  Difficulty : Medium
//  Topics : Hash Table, Tree, Depth-First Search, Breadth-First Search, Binary Tree
//  Language : java
//  Submitted : 2024-01-10 19:08 UTC
//  Runtime : 7   Memory : 78708000
//  LeetCode URL : https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/
// ============================================================
//
// Problem Description:
// You are given the root of a binary tree with unique values, and an integer start. At minute 0, an infection starts from the node with value start.
// 
// Each minute, a node becomes infected if:
// 
// 
// 	The node is currently uninfected.
// 	The node is adjacent to an infected node.
// 
// 
// Return the number of minutes needed for the entire tree to be infected.
// 
//  
// Example 1:
// 
// 
// Input: root = [1,5,3,null,4,10,6,9,2], start = 3
// Output: 4
// Explanation: The following nodes are infected during:
// - Minute 0: Node 3
// - Minute 1: Nodes 1, 10 and 6
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
    private int result;

    public int amountOfTime(TreeNode root, int start) {
        DFS(root, start);
        return result;
    }
     private int DFS(TreeNode node, int start){
        if(node == null) return 0;

        int leftDepth = DFS(node.left, start);
        int rightDepth = DFS(node.right, start);

        if(node.val == start){
            result = Math.max(leftDepth, rightDepth);
            return -1;
        }
        else if(leftDepth >= 0 && rightDepth >= 0)
            return Math.max(leftDepth, rightDepth)+1;
        
        result = Math.max(result, Math.abs(leftDepth - rightDepth));
        return Math.min(leftDepth, rightDepth) - 1;
    }
}

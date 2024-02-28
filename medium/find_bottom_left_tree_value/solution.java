// ============================================================
//  Problem : Find Bottom Left Tree Value
//  Difficulty : Medium
//  Topics : Tree, Depth-First Search, Breadth-First Search, Binary Tree
//  Language : java
//  Submitted : 2024-02-28 20:01 UTC
//  Runtime : 1   Memory : 44496000
//  LeetCode URL : https://leetcode.com/problems/find-bottom-left-tree-value/
// ============================================================
//
// Problem Description:
// Given the root of a binary tree, return the leftmost value in the last row of the tree.
// 
//  
// Example 1:
// 
// 
// Input: root = [2,1,3]
// Output: 1
// 
// 
// Example 2:
// 
// 
// Input: root = [1,2,3,4,null,5,6,null,null,7]
// Output: 7
// 
// 
//  
// Constraints:
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
    public int findBottomLeftValue(TreeNode root) {
           if (root == null)
            return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int leftNode = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            leftNode = q.peek().val;

            for (int i = 0; i < size; i++) {
                TreeNode tmp = q.poll();
                if (tmp.left != null)
                    q.add(tmp.left);
                if (tmp.right != null)
                    q.add(tmp.right);
            }
        }

        return leftNode;
    }
}

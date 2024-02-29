// ============================================================
//  Problem : Even Odd Tree
//  Difficulty : Medium
//  Topics : Tree, Breadth-First Search, Binary Tree
//  Language : java
//  Submitted : 2024-02-29 17:51 UTC
//  Runtime : 20   Memory : 57316000
//  LeetCode URL : https://leetcode.com/problems/even-odd-tree/
// ============================================================
//
// Problem Description:
// A binary tree is named Even-Odd if it meets the following conditions:
// 
// 
// 	The root of the binary tree is at level index 0, its children are at level index 1, their children are at level index 2, etc.
// 	For every even-indexed level, all nodes at the level have odd integer values in strictly increasing order (from left to right).
// 	For every odd-indexed level, all nodes at the level have even integer values in strictly decreasing order (from left to right).
// 
// 
// Given the root of a binary tree, return true if the binary tree is Even-Odd, otherwise return false.
// 
//  
// Example 1:
// 
// 
// Input: root = [1,10,4,3,null,7,9,12,8,6,null,null,2]
// Output: true
// Explanation: The node values on each level are:
// Level 0: [1]
// Level 1: [10,4]
// Level 2: [3,7,9]
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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        int res = 1;
        int c = 0;
        int prev = 0;
        while(!que.isEmpty()){
            if(res%2==0)
                prev = Integer.MAX_VALUE;
            else
                prev = Integer.MIN_VALUE;
            while(que.peek()!=null) {
                if(que.peek().val%2!=res%2){
                    return false;
                }
                if(res%2==0 && prev<=que.peek().val){
                    return false;
                }

                if(res%2!=0 && prev>=que.peek().val)
                    return false;
                if (que.peek().left != null)
                    que.add(que.peek().left);
                if (que.peek().right != null)
                    que.add(que.peek().right);
                prev = que.poll().val;
            }
            que.poll();
            if(que.isEmpty()){
                break;
            }
        res++;
            que.add(null);

        }
        return true;
    }
}

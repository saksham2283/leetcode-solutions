// ============================================================
//  Problem : Remove Nodes From Linked List
//  Difficulty : Medium
//  Topics : Linked List, Stack, Recursion, Monotonic Stack
//  Language : java
//  Submitted : 2024-05-06 19:02 UTC
//  Runtime : 73   Memory : 61984000
//  LeetCode URL : https://leetcode.com/problems/remove-nodes-from-linked-list/
// ============================================================
//
// Problem Description:
// You are given the head of a linked list.
// 
// Remove every node which has a node with a greater value anywhere to the right side of it.
// 
// Return the head of the modified linked list.
// 
//  
// Example 1:
// 
// 
// Input: head = [5,2,13,3,8]
// Output: [13,8]
// Explanation: The nodes that should be removed are 5, 2 and 3.
// - Node 13 is to the right of node 5.
// - Node 13 is to the right of node 2.
// - Node 8 is to the right of node 3.
// 
// 
// Example 2:
// 
//
// ============================================================

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode cur = head;
        Stack<ListNode> stack = new Stack<>();
        
        while (cur != null) {
            while (!stack.isEmpty() && stack.peek().val < cur.val) {
                stack.pop();
            }
            stack.push(cur);
            cur = cur.next;
        }
        
        ListNode nxt = null;
        while (!stack.isEmpty()) {
            cur = stack.pop();
            cur.next = nxt;
            nxt = cur;
        }
        
        return cur;
    }
}

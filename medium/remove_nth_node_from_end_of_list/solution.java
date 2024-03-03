// ============================================================
//  Problem : Remove Nth Node From End of List
//  Difficulty : Medium
//  Topics : Linked List, Two Pointers
//  Language : java
//  Submitted : 2024-03-03 17:50 UTC
//  Runtime : 0   Memory : 41848000
//  LeetCode URL : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// ============================================================
//
// Problem Description:
// Given the head of a linked list, remove the nth node from the end of the list and return its head.
// 
//  
// Example 1:
// 
// 
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// 
// 
// Example 2:
// 
// 
// Input: head = [1], n = 1
// Output: []
// 
// 
// Example 3:
// 
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        
        // Step 1: Traverse the linked list to find its length
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        
        // Reset temp to the head of the list
        temp = head;
        ListNode prev = null;
        int pos = len - n;
        
        // Special case: If the node to be removed is the head itself
        if(pos == 0) return head.next;
        
        // Step 2: Traverse the list again to reach the node just before the one to be removed
        for(int i = 0; i < pos; i++) {
            prev = temp;
            temp = temp.next;
        }
        
        // Step 3: Update the pointers to remove the node
        prev.next = temp.next;
        
        // Step 4: Delete the removed node
        temp = null;
        
        return head;
    }
}

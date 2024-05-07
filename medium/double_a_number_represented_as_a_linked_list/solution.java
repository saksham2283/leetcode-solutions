// ============================================================
//  Problem : Double a Number Represented as a Linked List
//  Difficulty : Medium
//  Topics : Linked List, Math, Stack
//  Language : java
//  Submitted : 2024-05-07 18:17 UTC
//  Runtime : 3   Memory : 46520000
//  LeetCode URL : https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/
// ============================================================
//
// Problem Description:
// You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes.
// 
// Return the head of the linked list after doubling it.
// 
//  
// Example 1:
// 
// 
// Input: head = [1,8,9]
// Output: [3,7,8]
// Explanation: The figure above corresponds to the given linked list which represents the number 189. Hence, the returned linked list represents the number 189 * 2 = 378.
// 
// 
// Example 2:
// 
// 
// Input: head = [9,9,9]
// Output: [1,9,9,8]
// Explanation: The figure above corresponds to the given linked list which represents the number 999. Hence, the returned linked list reprersents the number 999 * 2 = 1998. 
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
    public ListNode doubleIt(ListNode head) {
        if (head.val > 4) {
            head = new ListNode(0, head);
        }
        
        ListNode temp = head;
        while (temp != null) {
            // Double the value and take modulo 10 to handle carry
            temp.val = (temp.val * 2) % 10;
            
            // If the next node exists and its value is greater than 4, 
            // increment current node's value
            if (temp.next != null && temp.next.val > 4) {
                temp.val++;
            }
            
            temp = temp.next; // Move to the next node
        }
        
        return head; 
    }
}

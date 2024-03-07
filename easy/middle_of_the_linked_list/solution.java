// ============================================================
//  Problem : Middle of the Linked List
//  Difficulty : Easy
//  Topics : Linked List, Two Pointers
//  Language : java
//  Submitted : 2024-03-07 17:52 UTC
//  Runtime : 0   Memory : 41340000
//  LeetCode URL : https://leetcode.com/problems/middle-of-the-linked-list/
// ============================================================
//
// Problem Description:
// Given the head of a singly linked list, return the middle node of the linked list.
// 
// If there are two middle nodes, return the second middle node.
// 
//  
// Example 1:
// 
// 
// Input: head = [1,2,3,4,5]
// Output: [3,4,5]
// Explanation: The middle node of the list is node 3.
// 
// 
// Example 2:
// 
// 
// Input: head = [1,2,3,4,5,6]
// Output: [4,5,6]
// Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
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
    public ListNode middleNode(ListNode head) {
         if (head == null || head.next == null)
            return head;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }

        return slow;
    }
}

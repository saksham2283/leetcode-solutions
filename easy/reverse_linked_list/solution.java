// ============================================================
//  Problem : Reverse Linked List
//  Difficulty : Easy
//  Topics : Linked List, Recursion
//  Language : java
//  Submitted : 2024-03-21 18:19 UTC
//  Runtime : 0   Memory : 42200000
//  LeetCode URL : https://leetcode.com/problems/reverse-linked-list/
// ============================================================
//
// Problem Description:
// Given the head of a singly linked list, reverse the list, and return the reversed list.
// 
//  
// Example 1:
// 
// 
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]
// 
// 
// Example 2:
// 
// 
// Input: head = [1,2]
// Output: [2,1]
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
    public ListNode reverseList(ListNode head) {
                ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode = null;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;

    }
}

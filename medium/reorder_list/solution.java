// ============================================================
//  Problem : Reorder List
//  Difficulty : Medium
//  Topics : Linked List, Two Pointers, Stack, Recursion
//  Language : java
//  Submitted : 2024-03-23 18:09 UTC
//  Runtime : 2   Memory : 48212000
//  LeetCode URL : https://leetcode.com/problems/reorder-list/
// ============================================================
//
// Problem Description:
// You are given the head of a singly linked-list. The list can be represented as:
// 
// 
// L0 &rarr; L1 &rarr; &hellip; &rarr; Ln - 1 &rarr; Ln
// 
// 
// Reorder the list to be on the following form:
// 
// 
// L0 &rarr; Ln &rarr; L1 &rarr; Ln - 1 &rarr; L2 &rarr; Ln - 2 &rarr; &hellip;
// 
// 
// You may not modify the values in the list's nodes. Only nodes themselves may be changed.
// 
//  
// Example 1:
// 
// 
// Input: head = [1,2,3,4]
// Output: [1,4,2,3]
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
     public ListNode reverse(ListNode head) {
        if (head == null) return null;
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
    public void reorderList(ListNode head) {
         if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = null;
        ListNode list1 = head;
        ListNode list2 = reverse(slow);
        merge(list1, list2);
    }
      public void merge(ListNode list1, ListNode list2) {
        while (list2 != null) {
            ListNode nextNode = list1.next;
            list1.next = list2;
            list1 = list2;
            list2 = nextNode;
        }
    }
}

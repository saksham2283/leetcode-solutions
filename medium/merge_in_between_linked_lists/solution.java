// ============================================================
//  Problem : Merge In Between Linked Lists
//  Difficulty : Medium
//  Topics : Linked List
//  Language : java
//  Submitted : 2024-03-20 21:51 UTC
//  Runtime : 2   Memory : 46612000
//  LeetCode URL : https://leetcode.com/problems/merge-in-between-linked-lists/
// ============================================================
//
// Problem Description:
// You are given two linked lists: list1 and list2 of sizes n and m respectively.
// 
// Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
// 
// The blue edges and nodes in the following figure indicate the result:
// 
// Build the result list and return its head.
// 
//  
// Example 1:
// 
// 
// Input: list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
// Output: [10,1,13,1000000,1000001,1000002,5]
// Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.
// 
// 
// Example 2:
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev = list1, temp1 = list1, curr = list1;
        a--; // Adjust a to match zero-based indexing
        
        // Traverse list1 to find the node at position (a-1)
        while (temp1 != null && a-- > 0) {
            temp1 = temp1.next;
            prev = temp1;
        }
        
        temp1 = list1; // Reset temp1 to traverse list1 again
        
        // Traverse list1 to find the node at position (b+1)
        while (temp1 != null && b-- > 0) {
            temp1 = temp1.next;
            curr = temp1;
        }
        
        ListNode temp2 = list2; // Initialize pointer to traverse list2
        
        // Traverse list2 to find the last node
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        
        prev.next = list2; // Connect the node before position 'a' to the head of list2
        temp2.next = curr.next; // Connect the last node of list2 to the node after position 'b'
        
        return list1;
    }
}

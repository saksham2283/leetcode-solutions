// ============================================================
//  Problem : Time Needed to Buy Tickets
//  Difficulty : Easy
//  Topics : Array, Queue, Simulation
//  Language : java
//  Submitted : 2024-04-09 16:08 UTC
//  Runtime : 2   Memory : 40884000
//  LeetCode URL : https://leetcode.com/problems/time-needed-to-buy-tickets/
// ============================================================
//
// Problem Description:
// There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.
// 
// You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].
// 
// Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.
// 
// Return the time taken for the person initially at position k (0-indexed) to finish buying tickets.
// 
//  
// Example 1:
// 
// 
// Input: tickets = [2,3,2], k = 2
// 
// Output: 6
// 
// Explanation:
// 
// 
// 	The queue starts as [2,3,2], where the kth person is underlined.
//
// ============================================================

class Solution {
    public int timeRequiredToBuy(int[] v, int k) {
     int n = v.length;
        int t = 0;
        while (true) {
            for (int i = 0; i < n; i++) {
                if (v[i] > 0) {
                    v[i] = v[i] - 1;
                    t++;
                }
                if (i == k && v[i] == 0)
                    return t;   
    }
}
    }
}

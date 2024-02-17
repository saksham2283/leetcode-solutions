// ============================================================
//  Problem : Furthest Building You Can Reach
//  Difficulty : Medium
//  Topics : Array, Greedy, Heap (Priority Queue)
//  Language : java
//  Submitted : 2024-02-17 20:31 UTC
//  Runtime : 11   Memory : 59520000
//  LeetCode URL : https://leetcode.com/problems/furthest-building-you-can-reach/
// ============================================================
//
// Problem Description:
// You are given an integer array heights representing the heights of buildings, some bricks, and some ladders.
// 
// You start your journey from building 0 and move to the next building by possibly using bricks or ladders.
// 
// While moving from building i to building i+1 (0-indexed),
// 
// 
// 	If the current building's height is greater than or equal to the next building's height, you do not need a ladder or bricks.
// 	If the current building's height is less than the next building's height, you can either use one ladder or (h[i+1] - h[i]) bricks.
// 
// 
// Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.
// 
//  
// Example 1:
// 
// 
// Input: heights = [4,2,7,6,9,14,12], bricks = 5, ladders = 1
// Output: 4
// Explanation: Starting at building 0, you can follow these steps:
//
// ============================================================

class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        if (n == 1)
            return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a); // Max heap
        int i = 0;
        for (; i < n - 1; i++) {
            if (heights[i + 1] <= heights[i])
                continue;
            int diff = heights[i + 1] - heights[i];
            if (bricks >= diff) {
                bricks -= diff;
                pq.offer(diff);
            } else if (ladders > 0) {
                if (!pq.isEmpty()) {
                    int pastBricks = pq.peek();
                    if (pastBricks > diff) {
                        bricks += pastBricks;
                        pq.poll();
                        bricks -= diff;
                        pq.offer(diff);
                    }
                }
                ladders--;
            } else
                break;
        }
        return i;
    }
}

// ============================================================
//  Problem : Minimum Number of Arrows to Burst Balloons
//  Difficulty : Medium
//  Topics : Array, Greedy, Sorting
//  Language : java
//  Submitted : 2024-03-18 22:53 UTC
//  Runtime : 54   Memory : 68704000
//  LeetCode URL : https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
// ============================================================
//
// Problem Description:
// There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.
// 
// Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis. A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend. There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.
// 
// Given the array points, return the minimum number of arrows that must be shot to burst all balloons.
// 
//  
// Example 1:
// 
// 
// Input: points = [[10,16],[2,8],[1,6],[7,12]]
// Output: 2
// Explanation: The balloons can be burst by 2 arrows:
// - Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
// - Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
// 
// 
// Example 2:
// 
// 
//
// ============================================================

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int count = 0;
        long prevlast = points[0][1]; // Use long to handle large numbers

        for (int i = 1; i < points.length; i++) {
            if (prevlast >= points[i][0]) {
                if (prevlast > points[i][1]) {
                    prevlast = points[i][1];
                }
            } else {
                prevlast = points[i][1];
                count++;
            }
        }

        return count + 1;
    }
}

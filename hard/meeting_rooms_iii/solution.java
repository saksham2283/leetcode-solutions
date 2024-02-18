// ============================================================
//  Problem : Meeting Rooms III
//  Difficulty : Hard
//  Topics : Array, Hash Table, Sorting, Heap (Priority Queue), Simulation
//  Language : java
//  Submitted : 2024-02-18 17:48 UTC
//  Runtime : 49   Memory : 101196000
//  LeetCode URL : https://leetcode.com/problems/meeting-rooms-iii/
// ============================================================
//
// Problem Description:
// You are given an integer n. There are n rooms numbered from 0 to n - 1.
// 
// You are given a 2D integer array meetings where meetings[i] = [starti, endi] means that a meeting will be held during the half-closed time interval [starti, endi). All the values of starti are unique.
// 
// Meetings are allocated to rooms in the following manner:
// 
// 
// 	Each meeting will take place in the unused room with the lowest number.
// 	If there are no available rooms, the meeting will be delayed until a room becomes free. The delayed meeting should have the same duration as the original meeting.
// 	When a room becomes unused, meetings that have an earlier original start time should be given the room.
// 
// 
// Return the number of the room that held the most meetings. If there are multiple rooms, return the room with the lowest number.
// 
// A half-closed interval [a, b) is the interval between a and b including a and not including b.
// 
//  
// Example 1:
// 
// 
//
// ============================================================

class Solution {
    public int mostBooked(int n, int[][] meetings) {
         int[] ans = new int[n];
        long[] times = new long[n];
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < meetings.length; i++) {
            int start = meetings[i][0], end = meetings[i][1];
            boolean flag = false;
            int minind = -1;
            long val = Long.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (times[j] < val) {
                    val = times[j];
                    minind = j;
                }
                if (times[j] <= start) {
                    flag = true;
                    ans[j]++;
                    times[j] = end;
                    break;
                }
            }
            if (!flag) {
                ans[minind]++;
                times[minind] += (end - start);
            }
        }

        int maxi = -1, id = -1;
        for (int i = 0; i < n; i++) {
            if (ans[i] > maxi) {
                maxi = ans[i];
                id = i;
            }
        }
        return id;
    }
}

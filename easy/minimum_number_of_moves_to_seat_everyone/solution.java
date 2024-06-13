// ============================================================
//  Problem : Minimum Number of Moves to Seat Everyone
//  Difficulty : Easy
//  Topics : Array, Greedy, Sorting, Counting Sort
//  Language : java
//  Submitted : 2024-06-13 20:55 UTC
//  Runtime : 3   Memory : 44168000
//  LeetCode URL : https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
// ============================================================
//
// Problem Description:
// There are n availabe seats and n students standing in a room. You are given an array seats of length n, where seats[i] is the position of the ith seat. You are also given the array students of length n, where students[j] is the position of the jth student.
// 
// You may perform the following move any number of times:
// 
// 
// 	Increase or decrease the position of the ith student by 1 (i.e., moving the ith student from position x to x + 1 or x - 1)
// 
// 
// Return the minimum number of moves required to move each student to a seat such that no two students are in the same seat.
// 
// Note that there may be multiple seats or students in the same position at the beginning.
// 
//  
// Example 1:
// 
// 
// Input: seats = [3,1,5], students = [2,7,4]
// Output: 4
// Explanation: The students are moved as follows:
// - The first student is moved from position 2 to position 1 using 1 move.
//
// ============================================================

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int s=0;
        for(int i=0;i<seats.length;i++){
           s+=(int)Math.abs(students[i]-seats[i]);
        }
        return s;
    }
}

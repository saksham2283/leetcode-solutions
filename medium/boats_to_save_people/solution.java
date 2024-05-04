// ============================================================
//  Problem : Boats to Save People
//  Difficulty : Medium
//  Topics : Array, Two Pointers, Greedy, Sorting
//  Language : java
//  Submitted : 2024-05-04 18:03 UTC
//  Runtime : 15   Memory : 54808000
//  LeetCode URL : https://leetcode.com/problems/boats-to-save-people/
// ============================================================
//
// Problem Description:
// You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.
// 
// Return the minimum number of boats to carry every given person.
// 
//  
// Example 1:
// 
// 
// Input: people = [1,2], limit = 3
// Output: 1
// Explanation: 1 boat (1, 2)
// 
// 
// Example 2:
// 
// 
// Input: people = [3,2,2,1], limit = 3
// Output: 3
// Explanation: 3 boats (1, 2), (2) and (3)
// 
//
// ============================================================

class Solution {
    public int numRescueBoats(int[] people, int limit) {
          int boats = 0;
        Arrays.sort(people);
        int i=0,j=people.length-1;
        while(i<=j){
            if((people[j]+people[i])<=limit){
                i++;
            }
            j--;
            boats++;
        }
        return boats; 
    }
}

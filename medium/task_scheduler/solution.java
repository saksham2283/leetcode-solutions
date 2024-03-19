// ============================================================
//  Problem : Task Scheduler
//  Difficulty : Medium
//  Topics : Array, Hash Table, Greedy, Sorting, Heap (Priority Queue), Counting
//  Language : java
//  Submitted : 2024-03-19 17:24 UTC
//  Runtime : 2   Memory : 46148000
//  LeetCode URL : https://leetcode.com/problems/task-scheduler/
// ============================================================
//
// Problem Description:
// You are given an array of CPU tasks, each labeled with a letter from A to Z, and a number n. Each CPU interval can be idle or allow the completion of one task. Tasks can be completed in any order, but there's a constraint: there has to be a gap of at least n intervals between two tasks with the same label.
// 
// Return the minimum number of CPU intervals required to complete all tasks.
// 
//  
// Example 1:
// 
// 
// Input: tasks = ["A","A","A","B","B","B"], n = 2
// 
// Output: 8
// 
// Explanation: A possible sequence is: A -> B -> idle -> A -> B -> idle -> A -> B.
// 
// After completing task A, you must wait two intervals before doing A again. The same applies to task B. In the 3rd interval, neither A nor B can be done, so you idle. By the 4th interval, you can do A again as 2 intervals have passed.
// 
// 
// Example 2:
// 
// 
//
// ============================================================

class Solution {
    public int leastInterval(char[] tasks, int n) {
       int []taskFreqMp = new int[26];
        for(char c : tasks){
            taskFreqMp[c- 'A']++;
        }
        Arrays.sort(taskFreqMp);
        int batchCnt = taskFreqMp[25];
        int vacantSlots = --batchCnt * n;
        for(int indx = 0; indx < 25; indx++){
            vacantSlots -= Math.min(taskFreqMp[indx], batchCnt); 
        }
        return vacantSlots > 0 ? tasks.length + vacantSlots : tasks.length;   
    }
}

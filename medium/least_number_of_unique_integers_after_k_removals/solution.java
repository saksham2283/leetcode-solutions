// ============================================================
//  Problem : Least Number of Unique Integers after K Removals
//  Difficulty : Medium
//  Topics : Array, Hash Table, Greedy, Sorting, Counting
//  Language : java
//  Submitted : 2024-02-16 21:47 UTC
//  Runtime : 28   Memory : 57040000
//  LeetCode URL : https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/
// ============================================================
//
// Problem Description:
// Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.
// 
// 
// 
// 
//  
// Example 1:
// 
// 
// Input: arr = [5,5,4], k = 1
// Output: 1
// Explanation: Remove the single 4, only 5 is left.
// 
// Example 2:
// 
// 
// Input: arr = [4,3,1,1,3,3,2], k = 3
// Output: 2
// Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
// 
//
// ============================================================

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
        }
        int unique = count.size();

        int[] countArray = new int[100000];
        for(Integer key : count.keySet()) {
            int keyCount = count.get(key);
            countArray[keyCount]++;
        }

        for (int i = 1; i < 100000; i++) {
            if (countArray[i]!= 0) {
                int remove = k / i;
                if (remove == 0) {
                    break;
                } else {
                    remove = Math.min(remove, countArray[i]);
                    unique -= remove;
                    k -= remove * i;
                }
            }
        }
        return unique; 
    }
}

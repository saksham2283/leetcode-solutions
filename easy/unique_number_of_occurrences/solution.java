// ============================================================
//  Problem : Unique Number of Occurrences
//  Difficulty : Easy
//  Topics : Array, Hash Table
//  Language : java
//  Submitted : 2024-01-17 17:09 UTC
//  Runtime : 2   Memory : 41136000
//  LeetCode URL : https://leetcode.com/problems/unique-number-of-occurrences/
// ============================================================
//
// Problem Description:
// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
// 
//  
// Example 1:
// 
// 
// Input: arr = [1,2,2,1,1,3]
// Output: true
// Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
// 
// Example 2:
// 
// 
// Input: arr = [1,2]
// Output: false
// 
// 
// Example 3:
// 
// 
//
// ============================================================

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> a=new ArrayList<Integer>();
        int j;
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(j=i;j<arr.length;j++){
                if(arr[i]==arr[j])
                 c++;
                else
                 break;
            }
            i=j-1;
           // System.out.println(c);
            if(a.contains(c))
             return false;
            a.add(c);
            
        }
        return true;
    }
}

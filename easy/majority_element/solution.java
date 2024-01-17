// ============================================================
//  Problem : Majority Element
//  Difficulty : Easy
//  Topics : Array, Hash Table, Divide and Conquer, Sorting, Counting
//  Language : java
//  Submitted : 2024-01-17 18:28 UTC
//  Runtime : 5   Memory : 50784000
//  LeetCode URL : https://leetcode.com/problems/majority-element/
// ============================================================
//
// Problem Description:
// Given an array nums of size n, return the majority element.
// 
// The majority element is the element that appears more than &lfloor;n / 2&rfloor; times. You may assume that the majority element always exists in the array.
// 
//  
// Example 1:
// Input: nums = [3,2,3]
// Output: 3
// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
// 
//  
// Constraints:
// 
// 
// 	n == nums.length
// 	1 <= n <= 5 * 104
// 	-109 <= nums[i] <= 109
// 	The input is generated such that a majority element will exist in the array.
//
// ============================================================

class Solution {
    public int majorityElement(int[] n) {
        int l=n.length/2;
        if(n.length==1)
         return n[0];
         Arrays.sort(n);
        int c=0;int j,i;
        for( i=0;i<n.length;i++){
           c=0;
           for(j=i;j<n.length;j++){
               if(n[i]==n[j])
                c++;
              else break;
           }
           i=j-1;
           if(c>l)
            return n[j-1];
            
        }
        return n[i-1];
    }
}

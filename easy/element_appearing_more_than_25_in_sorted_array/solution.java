// ============================================================
//  Problem : Element Appearing More Than 25% In Sorted Array
//  Difficulty : Easy
//  Topics : Array
//  Language : java
//  Submitted : 2023-12-11 20:21 UTC
//  Runtime : 1   Memory : 43552000
//  LeetCode URL : https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
// ============================================================
//
// Problem Description:
// Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.
// 
//  
// Example 1:
// 
// 
// Input: arr = [1,2,2,6,6,6,6,7,10]
// Output: 6
// 
// 
// Example 2:
// 
// 
// Input: arr = [1,1]
// Output: 1
// 
// 
//  
// Constraints:
// 
//
// ============================================================

class Solution {
    public int findSpecialInteger(int[] arr) {
        int c=0;int s=0;int t=arr[0];int i;
        int m=(int)(0.25*arr.length);
        for( i=0;i<arr.length-1;i++){
           if(arr[i]==arr[i+1])
           {
               c++;
               
           }
           else 
           c=0;
           if(c>=m)
           {
               t=arr[i];
               break;
           }
        }
        
        return t;
    }
}

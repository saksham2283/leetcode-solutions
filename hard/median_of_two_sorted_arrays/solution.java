// ============================================================
//  Problem : Median of Two Sorted Arrays
//  Difficulty : Hard
//  Topics : Array, Binary Search, Divide and Conquer
//  Language : java
//  Submitted : 2023-07-25 11:56 UTC
//  Runtime : 6   Memory : 45368000
//  LeetCode URL : https://leetcode.com/problems/median-of-two-sorted-arrays/
// ============================================================
//
// Problem Description:
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// 
// The overall run time complexity should be O(log (m+n)).
// 
//  
// Example 1:
// 
// 
// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// 
// 
// Example 2:
// 
// 
// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
// 
//
// ============================================================

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m[]=new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0;i<nums1.length+nums2.length;i++){
            if(i<nums1.length)
             m[i]=nums1[i];
             else{
                 m[i]=nums2[k++];
             }          
        }
        Arrays.sort(m);
        int l=m.length;
        double b;
        if(l%2==0){
            b=m[l/2]+m[l/2-1];
            b=b/2;
            return b;
        }   
        else
         b=m[l/2];
         return b;
    }
}

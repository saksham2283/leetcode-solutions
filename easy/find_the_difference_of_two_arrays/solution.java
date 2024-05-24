// ============================================================
//  Problem : Find the Difference of Two Arrays
//  Difficulty : Easy
//  Topics : Array, Hash Table
//  Language : java
//  Submitted : 2024-05-24 15:14 UTC
//  Runtime : 87   Memory : 45460000
//  LeetCode URL : https://leetcode.com/problems/find-the-difference-of-two-arrays/
// ============================================================
//
// Problem Description:
// Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
// 
// 
// 	answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
// 	answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
// 
// 
// Note that the integers in the lists may be returned in any order.
// 
//  
// Example 1:
// 
// 
// Input: nums1 = [1,2,3], nums2 = [2,4,6]
// Output: [[1,3],[4,6]]
// Explanation:
// For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
// For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums1. Therefore, answer[1] = [4,6].
// 
// Example 2:
//
// ============================================================

class Solution {
    public static List<Integer> dis(int n1[],int n2[]){
        int f=-1;
        List<Integer> g=new ArrayList<>();
        for(int i=0;i<n1.length;i++){
            f=-1;
            for(int j=0;j<n2.length;j++){
                if(n1[i]==n2[j]){
                    f=0;
                   // System.out.println(n1[i]);
                    break;
                }
            }
            if(f==-1 && !g.contains(n1[i]))
             g.add(n1[i]);
        }
        return g;
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        List<List<Integer>> ab=new ArrayList<>();
        a=dis(nums1,nums2);
        ab.add(a);
        b=dis(nums2,nums1);
        ab.add(b);
        return ab;

    }
}

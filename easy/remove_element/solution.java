// ============================================================
//  Problem : Remove Element
//  Difficulty : Easy
//  Topics : Array, Two Pointers
//  Language : java
//  Submitted : 2026-05-30 09:48 UTC
//  Runtime : 6   Memory : 44040000
//  LeetCode URL : https://leetcode.com/problems/remove-element/
// ============================================================
//
// Problem Description:
// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
// 
// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
// 
// 
// 	Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// 	Return k.
// 
// 
// Custom Judge:
// 
// The judge will test your solution with the following code:
// 
// 
// int[] nums = [...]; // Input array
// int val = ...; // Value to remove
// int[] expectedNums = [...]; // The expected answer with correct length.
//                             // It is sorted with no values equaling val.
// 
// int k = removeElement(nums, val); // Calls your implementation
//
// ============================================================

class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0)
         return 0;
        int i,c=0,t;
        
        
        for(i=0;i<nums.length;i++){       
            if(val==nums[i]){
             c++;
             nums[i]=-1;
             }
        }
        int k=0;
        Arrays.sort(nums);
        int n[]=new int[nums.length];
       for(i=nums.length-1;i>=0;i--){
            n[k++]=nums[i];
        }
      for(i=0;i<nums.length;i++)
       nums[i]=n[i];

       System.out.println(Arrays.toString(n));
        return (c==0)?nums.length:(nums.length-c);
    }
}

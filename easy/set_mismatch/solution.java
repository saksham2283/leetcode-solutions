// ============================================================
//  Problem : Set Mismatch
//  Difficulty : Easy
//  Topics : Array, Hash Table, Bit Manipulation, Sorting
//  Language : java
//  Submitted : 2024-01-22 19:44 UTC
//  Runtime : 3   Memory : 45364000
//  LeetCode URL : https://leetcode.com/problems/set-mismatch/
// ============================================================
//
// Problem Description:
// You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
// 
// You are given an integer array nums representing the data status of this set after the error.
// 
// Find the number that occurs twice and the number that is missing and return them in the form of an array.
// 
//  
// Example 1:
// Input: nums = [1,2,2,4]
// Output: [2,3]
// Example 2:
// Input: nums = [1,1]
// Output: [1,2]
// 
//  
// Constraints:
// 
// 
// 	2 <= nums.length <= 104
// 	1 <= nums[i] <= 104
//
// ============================================================

class Solution {
    public int[] findErrorNums(int[] nums) {
       /* Arrays.sort(n);
        int a[]=new int[2];
        int c=0;
        System.out.println(n[0]);
        for(int i=0;i<n.length;i++){
            if(n[i]==n[i+1]){
                a[0]=n[i];
            }
            else if(n[i]-n[i-1]!=1){
                a[1]=i+1;
            }
        }
        return a;*/
          int n = nums.length;
        int i = 0;
        int mis = 0;
        int dub = 0;
        int res[] = new int[2];

        while (i < n) {
            if (nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < n; i++) {
            if (nums[i] != (i + 1)) {
                res[0] = nums[i];
                res[1] = i + 1;
            }
        }
        return res;  
    }
}

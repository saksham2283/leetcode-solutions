// ============================================================
//  Problem : Minimum Number of Operations to Make Array Empty
//  Difficulty : Medium
//  Topics : Array, Hash Table, Greedy, Counting
//  Language : java
//  Submitted : 2024-01-04 23:44 UTC
//  Runtime : 24   Memory : 62940000
//  LeetCode URL : https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/
// ============================================================
//
// Problem Description:
// You are given a 0-indexed array nums consisting of positive integers.
// 
// There are two types of operations that you can apply on the array any number of times:
// 
// 
// 	Choose two elements with equal values and delete them from the array.
// 	Choose three elements with equal values and delete them from the array.
// 
// 
// Return the minimum number of operations required to make the array empty, or -1 if it is not possible.
// 
//  
// Example 1:
// 
// 
// Input: nums = [2,3,3,2,2,4,2,3,4]
// Output: 4
// Explanation: We can apply the following operations to make the array empty:
// - Apply the first operation on the elements at indices 0 and 3. The resulting array is nums = [3,3,2,4,2,3,4].
// - Apply the first operation on the elements at indices 2 and 4. The resulting array is nums = [3,3,4,3,4].
//
// ============================================================

class Solution {
    public int minOperations(int[] nums) {
       /* Arrays.sort(n);
        int l=n.length;
        int c=0;int m=0;
        int i,j;
        for(i=0;i<l-1;i++){
            c=1;
            for( j=i+1;j<l;j++){
                if(n[i]==n[j]){
                    c++;
                }
                if(n[i]!=n[j]){
                    i=j-1;
                    break;
                }
            }
         //   System.out.println(c);
            if(c<=1)
             return -1;
            c=(c%3!=0)?((c/3)+1):c/3;
            m+=c;
          //  System.out.println(m);
            
            
            //i=j-1;

        }
        return m;*/
         Map<Integer, Integer> counts = new HashMap<>();
        int second;
        int result = 0;
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            second = entry.getValue();
            if (second == 1) {
                return -1;
            }
            if (second % 3 == 1) {
                result += (second / 3) - 1;
                result += 2;
            } else {
                result += (second / 3);
                result += ((second % 3) / 2);
            }
        }
        return result;
    }
}

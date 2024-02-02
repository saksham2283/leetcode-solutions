// ============================================================
//  Problem : Sequential Digits
//  Difficulty : Medium
//  Topics : Enumeration
//  Language : java
//  Submitted : 2024-02-02 20:12 UTC
//  Runtime : 0   Memory : 40904000
//  LeetCode URL : https://leetcode.com/problems/sequential-digits/
// ============================================================
//
// Problem Description:
// An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
// 
// Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
// 
//  
// Example 1:
// Input: low = 100, high = 300
// Output: [123,234]
// Example 2:
// Input: low = 1000, high = 13000
// Output: [1234,2345,3456,4567,5678,6789,12345]
// 
//  
// Constraints:
// 
// 
// 	10 <= low <= high <= 10^9
//
// ============================================================

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
                List<Integer> ans = new ArrayList<>();
        int digitsLow = (int) Math.log10(low) + 1;
        int digitsHigh = (int) Math.log10(high) + 1;
        String superset = "123456789";

        for (int i = digitsLow; i <= digitsHigh; i++) {
            for (int j = 0; j <= 9 - i; j++) {
                String subString = superset.substring(j, j + i);
                int num = Integer.parseInt(subString);
                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }
        return ans;

    }
}

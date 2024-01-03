// ============================================================
//  Problem : Number of Laser Beams in a Bank
//  Difficulty : Medium
//  Topics : Array, Math, String, Matrix
//  Language : java
//  Submitted : 2024-01-03 20:02 UTC
//  Runtime : 11   Memory : 45068000
//  LeetCode URL : https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
// ============================================================
//
// Problem Description:
// Anti-theft security devices are activated inside a bank. You are given a 0-indexed binary string array bank representing the floor plan of the bank, which is an m x n 2D matrix. bank[i] represents the ith row, consisting of '0's and '1's. '0' means the cell is empty, while'1' means the cell has a security device.
// 
// There is one laser beam between any two security devices if both conditions are met:
// 
// 
// 	The two devices are located on two different rows: r1 and r2, where r1 < r2.
// 	For each row i where r1 < i < r2, there are no security devices in the ith row.
// 
// 
// Laser beams are independent, i.e., one beam does not interfere nor join with another.
// 
// Return the total number of laser beams in the bank.
// 
//  
// Example 1:
// 
// 
// Input: bank = ["011001","000000","010100","001000"]
// Output: 8
// Explanation: Between each of the following device pairs, there is one beam. In total, there are 8 beams:
//
// ============================================================

class Solution {
    public int numberOfBeams(String[] bank) {
         int curr, prev = 0;
        int n = bank.length;    // Number of rows in the bank
        int m = bank[0].length(); // Number of columns in the bank
        int ans1 = 0;           // Variable to store the total number of laser beams

        // Iterate through each row of the bank
        for (int i = 0; i < n; i++) {
            curr = 0; // Reset the current count of security devices for each row

            // Iterate through each column of the current row
            for (int j = 0; j < m; j++) {
                if (bank[i].charAt(j) == '1') {
                    curr++; // Count the number of security devices in the current row
                }
            }
             // If there are security devices in the current row
            if (curr != 0) {
                // Accumulate the product of current count and previous count
                ans1 += curr * prev;
                prev = curr; // Update the previous count for the next iteration
            }
        }

        // Return the total number of laser beams
        return ans1;

    }
}

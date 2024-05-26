// ============================================================
//  Problem : Student Attendance Record II
//  Difficulty : Hard
//  Topics : Dynamic Programming
//  Language : java
//  Submitted : 2024-05-26 20:56 UTC
//  Runtime : 356   Memory : 71072000
//  LeetCode URL : https://leetcode.com/problems/student-attendance-record-ii/
// ============================================================
//
// Problem Description:
// An attendance record for a student can be represented as a string where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:
// 
// 
// 	'A': Absent.
// 	'L': Late.
// 	'P': Present.
// 
// 
// Any student is eligible for an attendance award if they meet both of the following criteria:
// 
// 
// 	The student was absent ('A') for strictly fewer than 2 days total.
// 	The student was never late ('L') for 3 or more consecutive days.
// 
// 
// Given an integer n, return the number of possible attendance records of length n that make a student eligible for an attendance award. The answer may be very large, so return it modulo 109 + 7.
// 
//  
// Example 1:
// 
//
// ============================================================

class Solution {
    private static final int MOD = 1000000007;

    private int check_all_records(int cur_ind, int count_a, int count_l, int n, int[][][] temp) {
        if (cur_ind == n) {
            return 1;
        }
        if (temp[cur_ind][count_a][count_l] != -1) {
            return temp[cur_ind][count_a][count_l];
        }
        int with_a_next = (count_a == 0) ? check_all_records(cur_ind + 1, count_a + 1, 0, n, temp) : 0;
        int with_l_next = (count_l == 2) ? 0 : check_all_records(cur_ind + 1, count_a, count_l + 1, n, temp);
        int with_p_next = check_all_records(cur_ind + 1, count_a, 0, n, temp);
        int total = ((with_a_next + with_l_next) % MOD + with_p_next) % MOD;

        temp[cur_ind][count_a][count_l] = total;
        return total;
    }

    public int checkRecord(int n) {
        int[][][] temp = new int[n][2][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    temp[i][j][k] = -1;
                }
            }
        }
        return check_all_records(0, 0, 0, n, temp);
    }
}

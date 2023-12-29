// ============================================================
//  Problem : Minimum Difficulty of a Job Schedule
//  Difficulty : Hard
//  Topics : Array, Dynamic Programming
//  Language : java
//  Submitted : 2023-12-29 21:42 UTC
//  Runtime : 9   Memory : 41276000
//  LeetCode URL : https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/
// ============================================================
//
// Problem Description:
// You want to schedule a list of jobs in d days. Jobs are dependent (i.e To work on the ith job, you have to finish all the jobs j where 0 <= j < i).
// 
// You have to finish at least one task every day. The difficulty of a job schedule is the sum of difficulties of each day of the d days. The difficulty of a day is the maximum difficulty of a job done on that day.
// 
// You are given an integer array jobDifficulty and an integer d. The difficulty of the ith job is jobDifficulty[i].
// 
// Return the minimum difficulty of a job schedule. If you cannot find a schedule for the jobs return -1.
// 
//  
// Example 1:
// 
// 
// Input: jobDifficulty = [6,5,4,3,2,1], d = 2
// Output: 7
// Explanation: First day you can finish the first 5 jobs, total difficulty = 6.
// Second day you can finish the last job, total difficulty = 1.
// The difficulty of the schedule = 6 + 1 = 7 
// 
// 
// Example 2:
//
// ============================================================

class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
         int jobs = jobDifficulty.length;

        // Check if it's impossible to do at least 1 job every day
        if (jobs < d)
            return -1;

        // Initialize a 2D array to store difficulty for each day and job
        int[][] dp = new int[d][jobs];

        // Fill the first day's difficulties
        dp[0][0] = jobDifficulty[0];
        for (int i = 1; i < jobs; i++)
            dp[0][i] = Math.max(dp[0][i - 1], jobDifficulty[i]);

        // Iterate over each day
        for (int days = 1; days < d; days++) {
            // Iterate over each job
            for (int i = days; i < jobs; i++) {
                int localMax = jobDifficulty[i];
                dp[days][i] = Integer.MAX_VALUE; // Set an initial high value

                // Iterate over previous jobs to find optimal difficulty
                for (int j = i; j >= days; j--) {
                    localMax = Math.max(localMax, jobDifficulty[j]);
                    dp[days][i] = Math.min(dp[days][i], dp[days - 1][j - 1] + localMax);
                }
            }
        }

        // Return the minimum difficulty for the last day
        return dp[d - 1][jobs - 1];
    }
}

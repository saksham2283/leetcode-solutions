// ============================================================
//  Problem : Maximum Profit in Job Scheduling
//  Difficulty : Hard
//  Topics : Array, Binary Search, Dynamic Programming, Sorting
//  Language : java
//  Submitted : 2024-01-06 22:43 UTC
//  Runtime : 83   Memory : 55324000
//  LeetCode URL : https://leetcode.com/problems/maximum-profit-in-job-scheduling/
// ============================================================
//
// Problem Description:
// We have n jobs, where every job is scheduled to be done from startTime[i] to endTime[i], obtaining a profit of profit[i].
// 
// You're given the startTime, endTime and profit arrays, return the maximum profit you can take such that there are no two jobs in the subset with overlapping time range.
// 
// If you choose a job that ends at time X you will be able to start another job that starts at time X.
// 
//  
// Example 1:
// 
// 
// 
// 
// Input: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
// Output: 120
// Explanation: The subset chosen is the first and fourth job. 
// Time range [1-3]+[3-6] , we get profit of 120 = 50 + 70.
// 
// 
// Example 2:
// 
//
// ============================================================

class Solution {
     private class Job {
        private int startTime;
        private int endTime;
        private int profit;

        Job(int startTime, int endTime, int profit) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.profit = profit;
        }
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
         List<Job> jobs = new ArrayList<>();
        for(int i=0; i<startTime.length; i++) {
            jobs.add(new Job(startTime[i], endTime[i], profit[i]));
        }

        Collections.sort(jobs, (a,b) -> a.endTime - b.endTime);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int ans = 0;

        for(Job currJob : jobs) {
            Integer entryTillStartTime = map.floorKey(currJob.startTime);
            int maxProfitStartTime = entryTillStartTime==null ? 0 : map.get(entryTillStartTime);
            ans = Math.max(ans, maxProfitStartTime + currJob.profit);
            map.put(currJob.endTime, ans);
        }
        return ans;
    }
}

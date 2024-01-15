// ============================================================
//  Problem : Find Players With Zero or One Losses
//  Difficulty : Medium
//  Topics : Array, Hash Table, Sorting, Counting
//  Language : java
//  Submitted : 2024-01-15 20:20 UTC
//  Runtime : 74   Memory : 91588000
//  LeetCode URL : https://leetcode.com/problems/find-players-with-zero-or-one-losses/
// ============================================================
//
// Problem Description:
// You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.
// 
// Return a list answer of size 2 where:
// 
// 
// 	answer[0] is a list of all players that have not lost any matches.
// 	answer[1] is a list of all players that have lost exactly one match.
// 
// 
// The values in the two lists should be returned in increasing order.
// 
// Note:
// 
// 
// 	You should only consider the players that have played at least one match.
// 	The testcases will be generated such that no two matches will have the same outcome.
// 
// 
//  
// Example 1:
//
// ============================================================

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Update counts based on matches
        for (int i = 0; i < matches.length; i++) {
            hm.put(matches[i][1], hm.getOrDefault(matches[i][1], 0) + 1);
            hm.put(matches[i][0], hm.getOrDefault(matches[i][0], 0));
        }

        // Initialize winner and loser lists
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        // Populate winners and losers lists
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 0)
                ans.get(0).add(entry.getKey());
            else if (entry.getValue() == 1)
                ans.get(1).add(entry.getKey());
        }

        // Sort the lists in ascending order
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));

        return ans;
    }
}

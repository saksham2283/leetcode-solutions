// ============================================================
//  Problem : Path Crossing
//  Difficulty : Easy
//  Topics : Hash Table, String
//  Language : java
//  Submitted : 2023-12-23 23:54 UTC
//  Runtime : 5   Memory : 42856000
//  LeetCode URL : https://leetcode.com/problems/path-crossing/
// ============================================================
//
// Problem Description:
// Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.
// 
// Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.
// 
//  
// Example 1:
// 
// 
// Input: path = "NES"
// Output: false 
// Explanation: Notice that the path doesn't cross any point more than once.
// 
// 
// Example 2:
// 
// 
// Input: path = "NESWW"
// Output: true
// Explanation: Notice that the path visits the origin twice.
// 
//
// ============================================================

class Solution {
    public boolean isPathCrossing(String path) {
         int x = 0, y = 0;
        HashSet<String> visited = new HashSet<>();
        visited.add("0,0");

        for (char direction : path.toCharArray()) {
            switch (direction) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }

            String currentLocation = x + "," + y;

            if (visited.contains(currentLocation)) {
                return true; // Path crosses itself
            }

            visited.add(currentLocation);
        }

        return false; // Path does not cross itself
    
    }
}

// ============================================================
//  Problem : Minimum Time to Make Rope Colorful
//  Difficulty : Medium
//  Topics : Array, String, Dynamic Programming, Greedy
//  Language : java
//  Submitted : 2023-12-27 21:14 UTC
//  Runtime : 11   Memory : 60348000
//  LeetCode URL : https://leetcode.com/problems/minimum-time-to-make-rope-colorful/
// ============================================================
//
// Problem Description:
// Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.
// 
// Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help. Bob can remove some balloons from the rope to make it colorful. You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.
// 
// Return the minimum time Bob needs to make the rope colorful.
// 
//  
// Example 1:
// 
// 
// Input: colors = "abaac", neededTime = [1,2,3,4,5]
// Output: 3
// Explanation: In the above image, 'a' is blue, 'b' is red, and 'c' is green.
// Bob can remove the blue balloon at index 2. This takes 3 seconds.
// There are no longer two consecutive balloons of the same color. Total time = 3.
// 
// Example 2:
// 
// 
// Input: colors = "abc", neededTime = [1,2,3]
//
// ============================================================

class Solution {
    public int minCost(String s, int[] neededTime) {
        /*int t=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                int k=(n[i]>n[i+1])?n[i+1]:n[i];
                t=t+k;
            
            }
        }
        return t;*/
        int sum = 0;
        char curr = s.charAt(0);
        int maxTime = neededTime[0];
        
        for(int i = 1;i<neededTime.length;i++){
            if(curr == s.charAt(i)){
                if(neededTime[i]>maxTime){
                    sum+=maxTime;
                    maxTime = neededTime[i];
                }else{
                    sum+=neededTime[i];
                }
            }else{
                curr = s.charAt(i);
                maxTime = neededTime[i];
            }
        }
        return sum;
    }
}

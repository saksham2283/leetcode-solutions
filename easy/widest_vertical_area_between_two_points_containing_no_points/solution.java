// ============================================================
//  Problem : Widest Vertical Area Between Two Points Containing No Points
//  Difficulty : Easy
//  Topics : Array, Sorting
//  Language : java
//  Submitted : 2023-12-21 18:55 UTC
//  Runtime : 46   Memory : 72764000
//  LeetCode URL : https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
// ============================================================
//
// Problem Description:
// Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical area between two points such that no points are inside the area.
// 
// A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height). The widest vertical area is the one with the maximum width.
// 
// Note that points on the edge of a vertical area are not considered included in the area.
// 
//  
// Example 1:
// ​
// 
// Input: points = [[8,7],[9,9],[7,4],[9,7]]
// Output: 1
// Explanation: Both the red and the blue area are optimal.
// 
// 
// Example 2:
// 
// 
// Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
// Output: 3
//
// ============================================================

class Solution {
    public int maxWidthOfVerticalArea(int[][] p) {
        int r=p.length;
        int c=p[0].length;
        int l=0;int m=0;
        int n[][]=new int[r][c];
        c=0;
        Arrays.sort(p, (a, b) -> Integer.compare(a[0], b[0]));
        l=0;m=0;
        for(int i=0;i<r-1;i++){
            if(p[i][0]==p[i+1][0])
             continue;
            l=p[i+1][0]-p[i][0];
            if(l>m)
             m=l;
        }

        return m;
    }
}

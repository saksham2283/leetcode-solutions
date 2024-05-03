// ============================================================
//  Problem : Compare Version Numbers
//  Difficulty : Medium
//  Topics : Two Pointers, String
//  Language : java
//  Submitted : 2024-05-03 12:25 UTC
//  Runtime : 1   Memory : 41624000
//  LeetCode URL : https://leetcode.com/problems/compare-version-numbers/
// ============================================================
//
// Problem Description:
// Given two version strings, version1 and version2, compare them. A version string consists of revisions separated by dots '.'. The value of the revision is its integer conversion ignoring leading zeros.
// 
// To compare version strings, compare their revision values in left-to-right order. If one of the version strings has fewer revisions, treat the missing revision values as 0.
// 
// Return the following:
// 
// 
// 	If version1 < version2, return -1.
// 	If version1 > version2, return 1.
// 	Otherwise, return 0.
// 
// 
//  
// Example 1:
// 
// 
// Input: version1 = "1.2", version2 = "1.10"
// 
// Output: -1
// 
//
// ============================================================

class Solution {
    public int compareVersion(String version1, String version2) {
         var v1 = version1.split("\\.");
    var v2 = version2.split("\\.");

    for (var i=0; i < Math.max(v1.length, v2.length); i++) {
      var num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
      var num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

      if (num1 < num2) return -1;
      if (num1 > num2) return 1;
    }
    return 0;
    }
}

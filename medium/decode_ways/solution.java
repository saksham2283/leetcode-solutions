// ============================================================
//  Problem : Decode Ways
//  Difficulty : Medium
//  Topics : String, Dynamic Programming
//  Language : java
//  Submitted : 2023-12-25 21:03 UTC
//  Runtime : 1   Memory : 41704000
//  LeetCode URL : https://leetcode.com/problems/decode-ways/
// ============================================================
//
// Problem Description:
// You have intercepted a secret message encoded as a string of numbers. The message is decoded via the following mapping:
// 
// "1" -> 'A'
// "2" -> 'B'
// ...
// "25" -> 'Y'
// "26" -> 'Z'
// 
// However, while decoding the message, you realize that there are many different ways you can decode the message because some codes are contained in other codes ("2" and "5" vs "25").
// 
// For example, "11106" can be decoded into:
// 
// 
// 	"AAJF" with the grouping (1, 1, 10, 6)
// 	"KJF" with the grouping (11, 10, 6)
// 	The grouping (1, 11, 06) is invalid because "06" is not a valid code (only "6" is valid).
// 
// 
// Note: there may be strings that are impossible to decode.
// 
//
// ============================================================

class Solution {
    public int numDecodings(String s) {
         if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            // Check if the single digit is valid
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }

            // Check if the two digits form a valid mapping
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}

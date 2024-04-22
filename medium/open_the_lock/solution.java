// ============================================================
//  Problem : Open the Lock
//  Difficulty : Medium
//  Topics : Array, Hash Table, String, Breadth-First Search
//  Language : java
//  Submitted : 2024-04-22 18:18 UTC
//  Runtime : 93   Memory : 46196000
//  LeetCode URL : https://leetcode.com/problems/open-the-lock/
// ============================================================
//
// Problem Description:
// You have a lock in front of you with 4 circular wheels. Each wheel has 10 slots: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'. The wheels can rotate freely and wrap around: for example we can turn '9' to be '0', or '0' to be '9'. Each move consists of turning one wheel one slot.
// 
// The lock initially starts at '0000', a string representing the state of the 4 wheels.
// 
// You are given a list of deadends dead ends, meaning if the lock displays any of these codes, the wheels of the lock will stop turning and you will be unable to open it.
// 
// Given a target representing the value of the wheels that will unlock the lock, return the minimum total number of turns required to open the lock, or -1 if it is impossible.
// 
//  
// Example 1:
// 
// 
// Input: deadends = ["0201","0101","0102","1212","2002"], target = "0202"
// Output: 6
// Explanation: 
// A sequence of valid moves would be "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202".
// Note that a sequence like "0000" -> "0001" -> "0002" -> "0102" -> "0202" would be invalid,
// because the wheels of the lock become stuck after the display becomes the dead end "0102".
// 
// 
//
// ============================================================

class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> seen = new HashSet<>(Arrays.asList(deadends));
    if (seen.contains("0000"))
      return -1;
    if (target.equals("0000"))
      return 0;

    int ans = 0;
    Queue<String> q = new ArrayDeque<>(Arrays.asList("0000"));

    while (!q.isEmpty()) {
      ++ans;
      for (int sz = q.size(); sz > 0; --sz) {
        StringBuilder sb = new StringBuilder(q.poll());
        for (int i = 0; i < 4; ++i) {
          final char cache = sb.charAt(i);
          // Increase the i-th digit by 1.
          sb.setCharAt(i, sb.charAt(i) == '9' ? '0' : (char) (sb.charAt(i) + 1));
          String word = sb.toString();
          if (word.equals(target))
            return ans;
          if (!seen.contains(word)) {
            q.offer(word);
            seen.add(word);
          }
          sb.setCharAt(i, cache);
          // Decrease the i-th digit by 1.
          sb.setCharAt(i, sb.charAt(i) == '0' ? '9' : (char) (sb.charAt(i) - 1));
          word = sb.toString();
          if (word.equals(target))
            return ans;
          if (!seen.contains(word)) {
            q.offer(word);
            seen.add(word);
          }
          sb.setCharAt(i, cache);
        }
      }
    }

    return -1;
    }
}

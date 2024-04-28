// ============================================================
//  Problem : Sum of Distances in Tree
//  Difficulty : Hard
//  Topics : Dynamic Programming, Tree, Depth-First Search, Graph Theory
//  Language : java
//  Submitted : 2024-04-28 07:43 UTC
//  Runtime : 36   Memory : 63476000
//  LeetCode URL : https://leetcode.com/problems/sum-of-distances-in-tree/
// ============================================================
//
// Problem Description:
// There is an undirected connected tree with n nodes labeled from 0 to n - 1 and n - 1 edges.
// 
// You are given the integer n and the array edges where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the tree.
// 
// Return an array answer of length n where answer[i] is the sum of the distances between the ith node in the tree and all other nodes.
// 
//  
// Example 1:
// 
// 
// Input: n = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
// Output: [8,12,6,10,10,10]
// Explanation: The tree is shown above.
// We can see that dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5)
// equals 1 + 1 + 2 + 2 + 2 = 8.
// Hence, answer[0] = 8, and so on.
// 
// 
// Example 2:
// 
//
// ============================================================

class Solution {
     List<List<Integer>> tree;
    int[] count;
    int[] ans;
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        tree = new ArrayList<>();
        count = new int[n];
        ans = new int[n];
        
        // Initialize adjacency list representation of the tree
        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            tree.get(u).add(v);
            tree.get(v).add(u);
        }
        
        dfs(0, -1); // Calculate subtree sizes and initial answers
        dfs2(0, -1); // Calculate answers for each node
        
        return ans;
    }

    // Calculate subtree sizes and initial answers
    private void dfs(int node, int parent) {
        count[node] = 1;
        for (int child : tree.get(node)) {
            if (child != parent) {
                dfs(child, node);
                count[node] += count[child];
                ans[node] += ans[child] + count[child];
            }
        }
    }
    
    // Calculate answers for each node
    private void dfs2(int node, int parent) {
        for (int child : tree.get(node)) {
            if (child != parent) {
                ans[child] = ans[node] - count[child] + count.length - count[child];
                dfs2(child, node);
            }
        }
    }
}

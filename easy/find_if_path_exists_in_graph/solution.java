// ============================================================
//  Problem : Find if Path Exists in Graph
//  Difficulty : Easy
//  Topics : Depth-First Search, Breadth-First Search, Union-Find, Graph Theory
//  Language : java
//  Submitted : 2024-04-22 18:17 UTC
//  Runtime : 131   Memory : 145956000
//  LeetCode URL : https://leetcode.com/problems/find-if-path-exists-in-graph/
// ============================================================
//
// Problem Description:
// There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.
// 
// You want to determine if there is a valid path that exists from vertex source to vertex destination.
// 
// Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise.
// 
//  
// Example 1:
// 
// 
// Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
// Output: true
// Explanation: There are two paths from vertex 0 to vertex 2:
// - 0 &rarr; 1 &rarr; 2
// - 0 &rarr; 2
// 
// 
// Example 2:
// 
// 
//
// ============================================================

class Solution {
    public boolean solve(List<List<Integer>> graph, int source, int destination, int[] visited) {
        // If source and destination are the same, a path is found
        if (source == destination)
            return true;
        
        // Mark the current node as visited
        visited[source] = 1;
        
        // Traverse through all adjacent vertices of the current vertex
        for (int neighbor : graph.get(source)) {
            // If the neighbor is not visited, recursively search for a path
            if (visited[neighbor] == 0) {
                if (solve(graph, neighbor, destination, visited))
                    return true; // If a path is found, return true
            }
        }
        return false; // No path found from source to destination
    }
    
    // Function to determine if a valid path exists from source to destination
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Create an adjacency list representation of the graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        // Initialize an array to keep track of visited vertices
        int[] visited = new int[n];
        
        // Call the helper function to find a path from source to destination
        return solve(graph, source, destination, visited);
    }
}

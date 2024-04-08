// ============================================================
//  Problem : Number of Students Unable to Eat Lunch
//  Difficulty : Easy
//  Topics : Array, Stack, Queue, Simulation
//  Language : java
//  Submitted : 2024-04-08 19:42 UTC
//  Runtime : 3   Memory : 41400000
//  LeetCode URL : https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
// ============================================================
//
// Problem Description:
// The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers 0 and 1 respectively. All students stand in a queue. Each student either prefers square or circular sandwiches.
// 
// The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a stack. At each step:
// 
// 
// 	If the student at the front of the queue prefers the sandwich on the top of the stack, they will take it and leave the queue.
// 	Otherwise, they will leave it and go to the queue's end.
// 
// 
// This continues until none of the queue students want to take the top sandwich and are thus unable to eat.
// 
// You are given two integer arrays students and sandwiches where sandwiches[i] is the type of the i​​​​​​th sandwich in the stack (i = 0 is the top of the stack) and students[j] is the preference of the j​​​​​​th student in the initial queue (j = 0 is the front of the queue). Return the number of students that are unable to eat.
// 
//  
// Example 1:
// 
// 
// Input: students = [1,1,0,0], sandwiches = [0,1,0,1]
// Output: 0 
// Explanation:
//
// ============================================================

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
         int len = students.length;
        Queue<Integer> studentQueue = new LinkedList<>();
        for (int student : students)
            studentQueue.add(student);
        Stack<Integer> sandwichStack = new Stack<>();
        for (int i = len - 1; i >= 0; i--)
            sandwichStack.push(sandwiches[i]);
        int served = 0;
        while (!studentQueue.isEmpty() && served < studentQueue.size()) {
            if (sandwichStack.peek().equals(studentQueue.peek())) {
                sandwichStack.pop();
                studentQueue.poll();
                served = 0;
            } else {
                studentQueue.add(studentQueue.peek());
                studentQueue.poll();
                served++;
            }
        }
        return studentQueue.size();
    }
}

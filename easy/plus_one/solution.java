// ============================================================
//  Problem : Plus One
//  Difficulty : Easy
//  Topics : Array, Math
//  Language : java
//  Submitted : 2024-01-19 22:03 UTC
//  Runtime : 0   Memory : 41796000
//  LeetCode URL : https://leetcode.com/problems/plus-one/
// ============================================================
//
// Problem Description:
// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
// 
// Increment the large integer by one and return the resulting array of digits.
// 
//  
// Example 1:
// 
// 
// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
// 
// 
// Example 2:
// 
// 
// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
//
// ============================================================

class Solution {
    public int[] plusOne(int[] digits) {
       /* int l=d.length;
        int s=0;int i=0;
        while(i<l){
            s=(s*10)+d[i++];
        }
         System.out.println(s);
        if(s%10==9){
            s=s+1;
        
            String st=Integer.toString(s);
            int a[]=new int[st.length()];
            int k=st.length();
             //System.out.println(st);
             int j=Integer.valueOf(st);
            while(k-->0 ){
                a[k]=j%10;
                j=j/10;
                
            }
            return a;
        }
       
        s=s+1;
        
        d[l-1]=s%10;
        return d;*/
        for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;

    }
}

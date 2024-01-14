// ============================================================
//  Problem : Determine if Two Strings Are Close
//  Difficulty : Medium
//  Topics : Hash Table, String, Sorting, Counting
//  Language : java
//  Submitted : 2024-01-14 23:17 UTC
//  Runtime : 11   Memory : 45488000
//  LeetCode URL : https://leetcode.com/problems/determine-if-two-strings-are-close/
// ============================================================
//
// Problem Description:
// Two strings are considered close if you can attain one from the other using the following operations:
// 
// 
// 	Operation 1: Swap any two existing characters.
// 
// 	
// 		For example, abcde -> aecdb
// 	
// 	
// 	Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
// 	
// 		For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
// 	
// 	
// 
// 
// You can use the operations on either string as many times as necessary.
// 
// Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
// 
//
// ============================================================

class Solution {
    public boolean closeStrings(String word1, String word2) {
       /* if(w1.length()!=w2.length())
         return false;
        int c[]=new int[26];int s[]=new int[26];
        char ch='a';int k=0;int f1=0;int f2=0;
        while(ch<='z'){
           for(int i=0;i<w1.length();i++){
               if(ch==w1.charAt(i))
                c[k]=f1++;
               if(ch==w2.charAt(i))
                 s[k]=f2++;
           }
         /*  System.out.println(c+" "+s);
           if(c!=s)
            return false;
        ch++;
        f1=0;
        f2=0;
        k++;
        }
        Arrays.sort(s);
        Arrays.sort(c);
        for(int i=0;i<26;i++){
            if(s[i]!=c[i])
            {System.out.println(c+" "+s);
             return false;}
        }
        return true;*/
         if (word1.length() != word2.length())
            return false;

        int[] f1 = new int[26];
        int[] f2 = new int[26];

        // Count frequency of each character in both words
        for (int i = 0; i < word1.length(); i++) {
            f1[word1.charAt(i) - 'a']++;
            f2[word2.charAt(i) - 'a']++;
        }

        // Check if the set of characters is the same for both words
        for (int i = 0; i < 26; i++) {
            if ((f1[i] == 0 && f2[i] != 0) || (f1[i] != 0 && f2[i] == 0))
                return false;
        }

        // Sort frequency arrays
        Arrays.sort(f1);
        Arrays.sort(f2);

        // Check if the frequency of each character is the same
        for (int i = 0; i < 26; i++) {
            if (f1[i] != f2[i])
                return false;
        }

        return true;
    }
}

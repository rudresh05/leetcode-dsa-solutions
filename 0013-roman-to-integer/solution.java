/*
 * Problem: 13. Roman to Integer
 * Link: https://leetcode.com/problems/roman-to-integer/
 * Difficulty: Medium
 * Language: java
 * Runtime: ms | Memory: MB
 */

class Solution {
    public int romanToInt(String s) {
        int num =0; 
        int prev =0;
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            int curr = 0;
            switch (ch){
                case 'I' :
                   curr = 1;
                   break;
                case 'V' :
                   curr = 5;
                   break;
                case 'X' :
                 curr = 10;
                 break;


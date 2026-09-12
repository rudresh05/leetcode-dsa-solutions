/*
 * Problem: . Longest Substring Without Repeating Characters
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Difficulty: Medium
 * Language: java
 * Runtime: ms | Memory: MB
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int start =0; 
        int end=0; 
        List<Character> list = new ArrayList<>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max = Math.max(max, list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }


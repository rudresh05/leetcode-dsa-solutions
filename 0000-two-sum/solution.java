/*
 * Problem: . Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 * Difficulty: Medium
 * Language: java
 * Runtime: (nums[i], i); | Memory: MB
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int req= target - nums[i];
            if(map.containsKey(req)){
                return new int[] {map.get(req), i};
            }
            map.put(nums[i], i);
        } 
        return new int[] {};   
             
        
    }
}


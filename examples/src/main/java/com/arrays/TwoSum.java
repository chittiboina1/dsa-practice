package com.arrays;

import java.util.HashMap;

public class TwoSum {

    /**
     * Solution 1 to find out two sums using brute force
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    /**
     * Solution 2 to find out two sums using HashMap
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> previousMap = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int number = nums[i];
            int diff = target-number;
            if(previousMap.containsKey(diff)){
                return new int[]{previousMap.get(diff),i};
            }
            previousMap.put(number,i);
        }
        return new int[0];
    }
}

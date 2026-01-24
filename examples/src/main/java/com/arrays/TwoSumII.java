package com.arrays;

import java.util.HashMap;

public class TwoSumII {

    /**
     * Solution 1 to find out 2 sum that equals to target using standard process i.e., brute force
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] numbers, int target){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1, j+1};
                }
            }
        }
        return new int[0];
    }

    /**
     * Solution 2 to find out 2 sum that equals to target using HashMap
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] numbers, int target){
        HashMap<Integer, Integer> map  = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            int temp = target - numbers[i];
           if(map.containsKey(temp)){
               return new int[]{map.get(temp), i+1};
           }
           map.put(numbers[i], i+1);
        }
        return new int[0];
    }

    /**
     * Solution 3 to find out 2 sum that equals to target using two pointers
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum3(int[] numbers, int target){
        int l=0, r=numbers.length-1;
        while(l < r){
            int sum = numbers[l]+numbers[r];
            if (sum > target) {
                r--;
            }else if(sum<target){
                l++;
            }else {
                return new int[]{l+1, r+1};
            }

        }
        return new int[0];
    }

}

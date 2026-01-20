package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicates {

    /**
     * Solution 1 to find out duplicates using brute force
     * @param nums
     * @return
     */
    public static boolean containsDuplicates1(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if (nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Solution 2 to find out the duplicates using sort
     * @param nums
     * @return
     */
    public static boolean containsDuplicates2(int[] nums){
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }

    /**
     * Solution 3 to find out duplicates using HashSet
     * @param nums
     * @return
     */
    public static boolean containsDuplicates3(int[] nums){
        Set<Integer> seen = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            int number = nums[i];
            if(seen.contains(number)){
                return true;
            }
            seen.add(number);
        }
        return false;
    }

}

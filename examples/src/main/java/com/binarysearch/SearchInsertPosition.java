package com.binarysearch;

public class SearchInsertPosition {

    /**
     * Solution 1 to find out the index of target in a given array and if it's not then find out an index where we can insert the target - using linear search.
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert1(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    /**
     * Solution 2 to find out the index of target in a given array and if it's not then find out an index where we can insert the target - using binary search.
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert2(int[] nums, int target){
        int l=0, r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }else if(nums[m]>target){
                r=m-1;
            }else {
                l=m+1;
            }
        }
        return l;
    }
}

package com.binarysearch;

public class FindMinimumInRotatedSortedArray {

    /**
     * Solution 1 to find out minimum number in a given array using (log n) - implemented with linear search
     * @param nums
     * @return
     */
    public static int findMin1(int[] nums){
        int minNum = nums[0];
        for(int i=1; i<nums.length; i++){
            minNum = Math.min(minNum, nums[i]);
        }
        return minNum;
    }

    /**
     * Solution 2 to find out minimum number in a given array using (log n) - implemented with binary search
     * @param nums
     * @return
     */
    public static int findMin2(int[] nums){
        int minNum = nums[0];
        int l=0, r=nums.length-1;
        while(l<=r){
            if(nums[l] < nums[r]){
                minNum = Math.min(minNum, nums[l]);
                break;
            }

            int m = l+(r-l)/2;
            minNum = Math.min(minNum, nums[m]);
            if(nums[m] >= nums[l]){
                l=m+1;
            }else {
                r=m-1;
            }
        }
        return minNum;
    }
}

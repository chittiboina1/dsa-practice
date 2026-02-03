package com.binarysearch;

public class SearchInRotatedSortedArray {

    /**
     * Solution 1 to find out the target value index in a given array using (log n) and if doesn't exist return -1 - implemented with linear search
     * @param nums
     * @param target
     * @return
     */
    public static int search1(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    /**
     * Solution 2 to find out the target value index in a given array using (log n) and if doesn't exist return -1 - implemented with binary search
     * @param nums
     * @param target
     * @return
     */
    public static int search2(int[] nums, int target){
        int l=0, r=nums.length-1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }

            if(nums[m] >= nums[l]){ // left sorted portion
                if(target > nums[m] || target < nums[l]){
                    l=m+1;
                }else {
                    r=m-1;
                }
            }else { // right sorted portion
                if(target < nums[m] || target > nums[r]){
                    r=m-1;
                }else {
                    l=m+1;
                }
            }
        }
        return -1;
    }
}

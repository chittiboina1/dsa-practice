package com.binarysearch;

public class BinarySearch {

    /**
     * Solution 1 to find out the target in a given array and if its exists return the index otherwise return -1 using recursive search.
     * @param nums
     * @param target
     * @return
     */
    public static int search1(int[] nums, int target){
        return binary_search(0, nums.length-1, nums, target);
    }


    /**
     * Solution 2 to find out the target in a given array and if its exists return the index otherwise return -1 using binary search (mid-point).
     * @param nums
     * @param target
     * @return
     */
    public static int search2(int[] nums, int target){
        int l=0, r=nums.length-1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(nums[m]>target){
                r = m-1;
            }else if(nums[m] < target){
                l = m+1;
            }else {
                return m;
            }
        }
        return -1;
    }


    /**
     * Binary search using recursive
     * @param l
     * @param r
     * @param nums
     * @param target
     * @return
     */
    public static int binary_search(int l, int r, int[] nums, int target){
        if(l>r) {
            return -1;
        }
        int m = l+(r-l)/2;
        if(nums[m]==target){
            return m;
        }
        return (nums[m]<target ?
                binary_search(m+1, r, nums, target):
                binary_search(l, m-1, nums, target)
        );
    }
}

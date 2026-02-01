package com.main;

import com.binarysearch.BinarySearch;
import com.binarysearch.SearchInsertPosition;

public class BinaryMain {
    /**
     * this method is used to execute all binary search problems from one place.
     */
    public static void executeAll(){
        int[] nums = {-1,0,2,4,6,8};
        int target = 3;

        // Binary Search problem
        int index = BinarySearch.search2(nums, target);
        System.out.println("Binary Search Results - "+index);

        // Search Insert Position problem
        int ind = SearchInsertPosition.searchInsert2(nums, target);
        System.out.println("Search Insert Position Results - "+ind);
    }
}

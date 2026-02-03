package com.main;

import com.binarysearch.BinarySearch;
import com.binarysearch.FindMinimumInRotatedSortedArray;
import com.binarysearch.SearchInRotatedSortedArray;
import com.binarysearch.SearchInsertPosition;

public class BinaryMain {
    /**
     * this method is used to execute all binary search problems from one place.
     */
    public static void executeAll(){
        int[] nums = {-1,0,2,4,6,8};
        int[] rotatedNums = {3,4,5,6,1,2};
        int target = 5;

        // Binary Search problem
        int index = BinarySearch.search2(nums, target);
        System.out.println("Binary Search Results - "+index);

        // Search Insert Position problem
        int ind = SearchInsertPosition.searchInsert2(nums, target);
        System.out.println("Search Insert Position Results - "+ind);

        // Find Minimum In Rotated Sorted Array problem
        int minNum = FindMinimumInRotatedSortedArray.findMin2(rotatedNums);
        System.out.println("Find Minimum In Rotated Sorted Array Results - "+minNum);

        // Search In Rotated Sorted Array problem
        int searchIndx = SearchInRotatedSortedArray.search2(rotatedNums, target);
        System.out.println("Search In Rotated Sorted Array Results - "+searchIndx);
    }
}

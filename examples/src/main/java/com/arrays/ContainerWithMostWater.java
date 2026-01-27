package com.arrays;

import java.util.HashMap;

public class ContainerWithMostWater {


    /**
     * Solution 1 to find out max area where we can fill the water in a container using brute force
     * @param heights
     * @return
     */
    public static int maxArea1(int[] heights){
       int maxArea=0;
       for(int i=0; i<heights.length; i++){
           for(int j=i+1; j<heights.length; j++) {
               int area = (j - i) * Math.min(heights[i], heights[j]);
               maxArea = Math.max(maxArea, area);
           }
       }
       return maxArea;
    }

    /**
     * Solution 2 to find out max area where we can fill the water in a container using two pointers
     * @param heights
     * @return
     */
    public static int maxArea2(int[] heights){
        int maxArea=0;
        int l=0, r=heights.length-1;
        while(l < r){
            int area = (r - l) * Math.min(heights[l], heights[r]);
            maxArea = Math.max(maxArea, area);
            if(heights[l] < heights[r]){
                l++;
            }else {
                r--;
            }

        }
        return maxArea;
    }

}

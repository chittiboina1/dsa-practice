package com.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1 {

    /**
     * Solution 1 to find out the next greater element in the second array for each element in the first array and have -1 if that doesn't exist using brute force.
     * @return
     */
    public static int[] nextGreaterElement1(int[] nums1, int[] nums2){
        int[] result = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            int nextGreater = -1;
            for(int j=nums2.length-1; j>=0; j--){
                if(nums2[j]>nums1[i]){
                    nextGreater = nums2[j];
                }else if(nums2[j]==nums1[i]){
                    break;
                }
            }
            result[i] = nextGreater;
        }
        return result;
    }

    /**
     * Solution 2 to find out the next greater element in the second array for each element in the first array and have -1 if that doesn't exist using HashMap.
     * @return
     */
    public static int[] nextGreaterElement2(int[] nums1, int[] nums2){
        int[] result = new int[nums1.length];
        Map<Integer, Integer> numsIndex = new HashMap<>();
        for(int i=0; i< nums1.length; i++){
            numsIndex.put(nums1[i], i);
        }
        Arrays.fill(result,-1);
        for(int i=0; i<nums2.length; i++){
           int current = nums2[i];
            if (!numsIndex.containsKey(current)) {
                continue;
            }
            for(int j=i+1; j<nums2.length; j++){
                if(nums2[j] > nums2[i]){
                    result[numsIndex.get(current)]=nums2[j];
                    break;
                }
            }
        }
        return result;
    }


    /**
     * Solution 3 to find out the next greater element in the second array for each element in the first array and have -1 if that doesn't exist using Stack.
     * @return
     */
    public static int[] nextGreaterElement3(int[] nums1, int[] nums2){
        int[] result = new int[nums1.length];
        Map<Integer, Integer> numsIndex = new HashMap<>();
        for(int i=0; i< nums1.length; i++){
            numsIndex.put(nums1[i], i);
        }
        Arrays.fill(result,-1);
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<nums2.length; i++){
            int cur = nums2[i];
            while(!stack.isEmpty() && cur > stack.peek()){
                int value = stack.pop();
                int index = numsIndex.get(value);
                result[index] = cur;
            }
            if(numsIndex.containsKey(cur)){
                stack.push(cur);
            }
        }
        return result;
    }

}

package com.arrays;

// Products of Array Except Self
public class ProductsOfArray {

    /**
     * Solution 1 to find out product of array except self using brute force.
     * @param nums
     * @return
     */
    public static int[] productExceptSelf1(int[] nums){
        int len = nums.length;
        int[] result = new int[len];
        for(int i=0; i<len; i++){
            int value = 1;
            for(int j=0; j<len; j++){
                if(i!=j) {
                    value = value * nums[j];
                }
            }
            result[i] = value;
        }
        return result;
    }


    /**
     * Solution 2 to find out product of array except self using prefix and suffix.
     * @param nums
     * @return
     */
    public static int[] productExceptSelf2(int[] nums){
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        int[] result = new int[len];

        prefix[0] = 1;
        suffix[len-1] = 1;
        for(int i=1; i<len; i++){
           prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int i=len-2; i>=0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for(int i=0; i<len; i++){
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }

    /**
     * Solution 3 to find out product of array except self using optimized prefix and suffix.
     * @param nums
     * @return
     */
    public static int[] productExceptSelf3(int[] nums){
        int len = nums.length;
        int prefix = 1;
        int suffix = 1;
        int[] result = new int[len];
        result[0] = 1;
        for(int i=0; i<len; i++){
            result[i] = prefix;
            prefix = prefix * nums[i];
        }
        for(int i=len-1; i>=0; i--){
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }
        return result;
    }

}

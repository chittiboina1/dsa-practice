package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    /**
     * Solution 1 to find out the top K frequent elements using sorting and HashMap.
     * @param nums
     * @param k
     * @return
     */
    public static int[] topKFrequent1(int[] nums, int k){
        HashMap<Integer, Integer> countMap = new HashMap<>();
        List<int[]> listArray = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            listArray.add(new int[]{entry.getValue(), entry.getKey()});
        }
        listArray.sort((a,b) -> b[0] - a[0]);
        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = listArray.get(i)[1];
        }
        return result;
    }


    /**
     * Solution 2 to find out the top K frequent elements using Bucket Sort
     * @param nums
     * @param k
     * @return
     */
    public static int[] topKFrequent2(int[] nums, int k){
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int length = nums.length;
        List<Integer>[] frequency = new List[length+1];
        for(int i=0; i<frequency.length; i++){
            frequency[i] = new ArrayList<>();
        }
        for(int i=0; i<length; i++){
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            frequency[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for(int i=frequency.length-1; i>0 && index < k; i--){
            List<Integer> list = frequency[i];
            for(int j=0; j<list.size(); j++){
               result[index++] = list.get(j);
               if(index==k){
                   return result;
               }
            }
        }
        return result;
    }
}

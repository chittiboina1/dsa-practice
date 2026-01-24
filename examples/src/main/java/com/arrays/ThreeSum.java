package com.arrays;

import java.util.*;

public class ThreeSum {

    /**
     * Solution 1 to find out three sum is equals to 0 or not using brute force.
     * @param numbers
     * @return
     */
    public static List<List<Integer>> threeSum1(int[] numbers){
        Arrays.sort(numbers);
        Set<List<Integer>> list = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        List<Integer> subList = new ArrayList<>();
                        subList.add(numbers[i]);
                        subList.add(numbers[j]);
                        subList.add(numbers[k]);
                        list.add(subList);
                    }
                }
            }
        }
        return new ArrayList<>(list);
    }

    /**
     * Solution 2 to find out three sum is equals to 0 or not using two pointers
     * @param numbers
     * @return
     */
    public static List<List<Integer>> threeSum2(int[] numbers){
        Arrays.sort(numbers);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            if(i>0 && numbers[i]==numbers[i-1]){
                continue;
            }
            int l=i+1, r=numbers.length-1;
            while(l<r){
                int sum = numbers[i]+numbers[l]+numbers[r];
                if(sum>0){
                    r--;
                }else if(sum<0){
                    l++;
                }else {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(numbers[i]);
                    subList.add(numbers[l]);
                    subList.add(numbers[r]);
                    list.add(subList);
                    l++;
                    while(l<r && numbers[l]==numbers[l-1]){
                        l++;
                    }
                }
            }
        }
        return list;
    }
}

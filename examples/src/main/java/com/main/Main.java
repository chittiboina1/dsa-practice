package com.main;


import com.arrays.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         System.out.println("Hello and welcome!");
         int[] numbers = {8,1,4,6,4};
         int target = 11;
         int[] results = TwoSum.twoSum2(numbers, target);
         System.out.println("TwoSum Result - "+Arrays.toString(results));
    }
}
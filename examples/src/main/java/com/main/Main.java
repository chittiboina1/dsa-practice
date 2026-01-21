package com.main;


import com.arrays.Anagram;
import com.arrays.Duplicates;
import com.arrays.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         System.out.println("Hello and welcome!");

         // Input values
         int[] numbers = {4,2,5,5,1};
         int target = 9;
         String s = "anagram";
         String t = "nagaram";

         // TwoSum problem
         int[] results = TwoSum.twoSum2(numbers, target);
         System.out.println("TwoSum Result - "+Arrays.toString(results));

         // Duplicates problem
         boolean duplicateExists = Duplicates.containsDuplicates3(numbers);
         System.out.println("Duplicates Results - "+duplicateExists);

         // Anagram problem
        boolean isAnagram = Anagram.isAnagram3(s, t);
        System.out.println("Anagram Results - "+isAnagram);
    }
}
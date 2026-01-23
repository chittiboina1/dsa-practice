package com.main;


import com.arrays.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         System.out.println("Hello and welcome!");

         // Input values
         int[] numbers = {4,2,5,1,2};
         int target = 9;
         int k = 2;
         String s = "anagram";
         String t = "nagaram";
         String longSubstring = "zxyzxyz";
         String palindromeString = "A man, a plan, a canal: Panama";

         String[] strs = {"act","pots","tops","cat","stop","hat"};

         // TwoSum problem
         int[] results = TwoSum.twoSum2(numbers, target);
         System.out.println("TwoSum Result - "+Arrays.toString(results));

         // Duplicates problem
         boolean duplicateExists = Duplicates.containsDuplicates3(numbers);
         System.out.println("Duplicates Results - "+duplicateExists);

         // Anagram problem
        boolean isAnagram = Anagram.isAnagram3(s, t);
        System.out.println("Anagram Results - "+isAnagram);

        // Group Anagrams problem
        List<List<String>> outputList = GroupAnagrams.groupAnagrams2(strs);
        System.out.println("Group Anagrams Results - "+outputList);

        // Top K Frequent Elements problem
        int[] outputArray = TopKFrequentElements.topKFrequent2(numbers,k);
        System.out.println("Top K Frequent Elements Results - "+Arrays.toString(outputArray));

        // Products of Array Except Self problem
        int[] productArray = ProductsOfArray.productExceptSelf3(numbers);
        System.out.println("Products of Array Except Self Results - "+Arrays.toString(productArray));

        // Longest Substring without duplicates problem
        int longestCount = LongestSubString.lengthOfLongestSubstring3(longSubstring);
        System.out.println("Longest Substring Without Duplicates Results - "+longestCount);

        // Valid Palindrome problem
        boolean valid = Palindrome.isPalindrome2(palindromeString);
        System.out.println("Valid Palindrome Results - "+valid);

    }
}
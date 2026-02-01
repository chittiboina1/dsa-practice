package com.main;


import com.arrays.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         System.out.println("Hello and welcome!");

         // Input values
         int[] numbers = {4,2,5,1,2};
         int target = 6;
         int k = 2;
         String s = "anagram";
         String t = "nagaram";
         String longSubstring = "zxyzxyz";
         String palindromeString = "A man, a plan, a canal: Panama";
         int[] twoNumbers = {2,3,4};
         int[] threeSumNums = {-1,0,1,2,-1,-4};
         int[] heights = {1,7,2,5,4,7,3,6};
         int[] prices = {10,1,5,6,7,1};

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

        // Two Sum II Input Array Sorted problem
        int[] twoSumRes = TwoSumII.twoSum1(twoNumbers, target);
        System.out.println("Two Sum II Results - "+Arrays.toString(twoSumRes));

        // 3 Sum problem
        List<List<Integer>> threeSumRes = ThreeSum.threeSum2(threeSumNums);
        System.out.println("Three Sum Results - "+threeSumRes);

        // Container with Most Water problem
        int maxArea = ContainerWithMostWater.maxArea2(heights);
        System.out.println("Container with Most Water Results - "+maxArea);

        // Best time to Buy and Sell Stocks problem
        int maxProfit = BestTimeToSellAndBuyStocks.maxProfit3(prices);
        System.out.println("Best time to Buy and Sell Stocks Results - "+maxProfit);

        // Calling Stack Main class for all stack related problems
        StackMain.executeAll();

        // Calling Binary Main class for all binary search related problems
        BinaryMain.executeAll();

    }
}
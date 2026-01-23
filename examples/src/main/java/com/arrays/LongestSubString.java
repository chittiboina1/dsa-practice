package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestSubString {


    /**
     * Solution 1 to find out the longest substring in a given input using brute force
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring1(String s){
        int result = 0;
        for(int i=0; i<s.length(); i++){
            HashSet<Character> charSet = new HashSet<>();
            for(int j=i; j<s.length(); j++){
                if(charSet.contains(s.charAt(j))){
                    break;
                }
                charSet.add(s.charAt(j));
            }
            result = Math.max(result, charSet.size());
        }
        return result;
    }


    /**
     * Solution 2 to find out the longest substring in a given input using sliding window
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring2(String s){
        int result = 0;
        int l = 0;
        HashSet<Character> charSet = new HashSet<>();
        for(int r=0; r<s.length(); r++){
            while(charSet.contains(s.charAt(r))){
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            result = Math.max(result, r-l+1);
        }
        return result;
    }


    /**
     * Solution 3 to find out the longest substring in a given input using sliding window with optimized
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring3(String s){
        int result = 0;
        int l = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int r=0; r<s.length(); r++){
            if(map.containsKey(s.charAt(r))){
               l = Math.max(map.get(s.charAt(r))+1, l);
            }
            map.put(s.charAt(r),r);
            result = Math.max(result, r-l+1);
        }
        return result;
    }
}

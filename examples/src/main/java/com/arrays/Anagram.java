package com.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {


    /**
     * Solution 1 to find out if given 2 strings are anagram or not using Sorting
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram1(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = s.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }


    /**
     * Solution 1 to find out if given 2 strings are anagram or not using HashMap
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram2(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0)+1);
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0)+1);
        }
        return sCount.equals(tCount);
    }


    /**
     * Solution 1 to find out if given 2 strings are anagram or not using Counter or HashTable
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram3(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] counter = new int[26];
        for(int i=0; i<s.length(); i++){
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<counter.length; i++){
            if(counter[i]!=0){
                return false;
            }
        }
        return true;
    }
}

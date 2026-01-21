package com.arrays;

import java.util.*;

public class GroupAnagrams {


    /**
     * Solution 1 to group anagrams using standard process
     * @param strs
     * @return
     */
    public static List<List<String>> groupAnagrams1(String[] strs){
        List<List<String>> output = new ArrayList<>();
        Set<String> words = new HashSet<>();
        for(int i=0; i<strs.length; i++){
            if(!words.contains(strs[i])){
                List<String> innerList = new ArrayList<>();
                words.add(strs[i]);
                innerList.add(strs[i]);
                for(int j=i+1; j<strs.length; j++){
                    if(Anagram.isAnagram3(strs[i], strs[j])){
                        words.add(strs[j]);
                        innerList.add(strs[j]);
                    }
                }
                output.add(innerList);
            }
        }
        return output;
    }


    /**
     * Solution 2 to group anagrams using HashMap
     * @param strs
     * @return
     */
    public static List<List<String>> groupAnagrams2(String[] strs){
        HashMap<String, List<String>> outputMap = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            int[] count = new int[26];
            String s = strs[i];
            for(int j=0; j<s.length(); j++){
                count[s.charAt(j)-'a']++;
            }
            String mapKey = Arrays.toString(count);
            outputMap.putIfAbsent(mapKey, new ArrayList<>());
            outputMap.get(mapKey).add(s);
        }
        return new ArrayList<>(outputMap.values());
    }

}

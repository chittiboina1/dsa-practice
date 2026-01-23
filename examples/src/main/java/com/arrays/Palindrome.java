package com.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class Palindrome {


    /**
     * Solution 1 to find whether it's a valid palindrome or not using reverse string operation
     * @param s
     * @return
     */
    public static boolean isPalindrome1(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }


    /**
     * Solution 2 to find whether it's a valid palindrome or not using two pointers
     * @param s
     * @return
     */
    public static boolean isPalindrome2(String s){
        int l = 0, r = s.length() - 1;
        while(l<r){
            while(l<r && !isAlphaNum(s.charAt(l))){
                l++;
            }
            while(r>l && !isAlphaNum(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++; r--;
        }
        return true;
    }

    /**
     * This method is used to find out whether given character is a alpha numeric or not using ASCII value
     * @param c
     * @return
     */
    public static boolean isAlphaNum(char c){
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}

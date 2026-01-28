package com.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    /**
     * Solution 1 to find out if given string has all the valid parentheses or not using brute force.
     * @param s
     * @return
     */
    public static boolean isValid1(String s){
        while(s.contains("{}") || s.contains("[]") || s.contains("()")){
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            s = s.replace("()", "");
        }
        return s.isEmpty();
    }

    /**
     * Solution 2 to find out if given string has all the valid parentheses or not using stack solution.
     * @param s
     * @return
     */
    public static boolean isValid2(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');
        closeToOpen.put(')', '(');
        char[] charArray = s.toCharArray();
        for(int i=0; i<charArray.length; i++){
            char c = charArray[i];
            if(closeToOpen.containsKey(c)){
                if(!stack.isEmpty() && stack.peek()==closeToOpen.get(c)){
                    stack.pop();
                }else {
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

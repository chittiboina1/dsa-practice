package com.stack;

import java.util.Stack;

public class EvaluateRPN {

    /**
     * Solution to find out the integer that represents the evaluation of the expression using stack
     * RPN - Reverse Polish Notation
     * @param tokens
     * @return
     */
    public static int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            String token = tokens[i];
            if("+".equals(token)){
                stack.push(stack.pop()+stack.pop());
            }else if("*".equals(token)){
                stack.push(stack.pop()*stack.pop());
            }else if("-".equals(token)){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }else if("/".equals(token)){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.get(0);
    }
}

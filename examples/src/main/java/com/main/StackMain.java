package com.main;

import com.arrays.BestTimeToSellAndBuyStocks;
import com.stack.MinStack;
import com.stack.ValidParentheses;

public class StackMain {
    /**
     * this method is used to execute all stack related problems from one place.
     */
    public static void executeAll(){
        String s = "[{(}]";


        // Valid Parentheses problem
        boolean valid = ValidParentheses.isValid2(s);
        System.out.println("Valid Parentheses Results - "+valid);

        // Min Stack Implementation
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(0);
        minStack.getMin(); // return 0
        minStack.pop();
        minStack.top();    // return 2
        minStack.getMin(); // return 1

        System.out.println("Min Stack Results - "+minStack.getMin());
    }
}

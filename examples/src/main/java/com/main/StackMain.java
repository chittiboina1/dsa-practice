package com.main;

import com.arrays.BestTimeToSellAndBuyStocks;
import com.stack.DailyTemperatures;
import com.stack.EvaluateRPN;
import com.stack.MinStack;
import com.stack.ValidParentheses;

import java.util.Arrays;

public class StackMain {
    /**
     * this method is used to execute all stack related problems from one place.
     */
    public static void executeAll(){
        String s = "[{(}]";
        int[] temps = {30,38,30,36,35,40,28};
        String[] tokens = {"1","2","+","3","*","4","-"};


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

        // Daily Temperatures problem
        int[] output = DailyTemperatures.dailyTemperatures2(temps);
        System.out.println("Daily Temperatures Results - "+Arrays.toString(output));

        // Evaluate RPN problem
        int value = EvaluateRPN.evalRPN(tokens);
        System.out.println("Evaluate RPN Results - "+value);
    }
}

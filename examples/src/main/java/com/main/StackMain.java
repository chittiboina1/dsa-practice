package com.main;

import com.arrays.BestTimeToSellAndBuyStocks;
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
    }
}

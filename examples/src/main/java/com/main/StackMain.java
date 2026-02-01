package com.main;

import com.arrays.BestTimeToSellAndBuyStocks;
import com.stack.*;

import java.util.Arrays;

public class StackMain {
    /**
     * this method is used to execute all stack related problems from one place.
     */
    public static void executeAll(){
        String s = "[{(}]";
        int[] temps = {30,38,30,36,35,40,28};
        String[] tokens = {"1","2","+","3","*","4","-"};
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int target = 10;
        int[] position = {4,1,0,7};
        int[] speed = {2,2,1,1};


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

        // Next Greater Element 1 problem
        int[] result = NextGreaterElement1.nextGreaterElement1(nums1, nums2);
        System.out.println("Next Greater Element 1 Results - "+Arrays.toString(result));


        // Car Fleet problem
        int fleets = CarFleet.carFleet2(target, position, speed);
        System.out.println("Car Fleets Results - "+fleets);
    }
}

package com.stack;

import java.util.Stack;

public class DailyTemperatures {

    /**
     * Solution 1 to find out the next warmest day from current and calculate difference days and add it to output results using brute force solution
     * @param temps
     * @return
     */
    public static int[] dailyTemperatures1(int[] temps){
        int len = temps.length;
        int[] results = new int[len];
        for(int i=0; i<len; i++){
            int numOfDays = 0;
            for(int j=i+1; j<len; j++){
                if(temps[i] < temps[j]){
                    numOfDays = j-i;
                    break;
                }
            }
            results[i]=numOfDays;
        }
        return results;
    }

    /**
     * Solution 2 to find out the next warmest day from current and calculate difference days and add it to output results using stack.
     * @param temps
     * @return
     */
    public static int[] dailyTemperatures2(int[] temps){
        int len = temps.length;
        int[] results = new int[len];
        Stack<int[]> stack = new Stack<>();
        for(int i=0; i<len; i++){
           while(!stack.isEmpty() && temps[i] > stack.peek()[0]){
               int[] pair = stack.pop();
               results[pair[1]] = i-pair[1];
           }
           stack.push(new int[]{temps[i], i});
        }
        return results;
    }
}

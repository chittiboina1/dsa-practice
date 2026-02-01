package com.stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {

    /**
     * Solution 1 to find out the total car fleets in a given input using brute force (car fleet - cars driving at the same position and speed)
     * @param target
     * @param position
     * @param speed
     * @return
     */
    public static int carFleet1(int target, int[] position, int[] speed){
        int[][] pair = new int[position.length][2];
        for(int i=0; i<position.length; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b) -> Integer.compare(b[0], a[0]));
        int fleets = 1;
        double previousTime = (double) (target-pair[0][0])/pair[0][1];
        for(int i=0; i<position.length; i++){
            double currentTime = (double) (target-pair[i][0])/pair[i][1];
            if(currentTime>previousTime){
                fleets++;
                previousTime = currentTime;
            }
        }
        return fleets;
    }


    /**
     * Solution 2 to find out the total car fleets in a given input using stack (car fleet - cars driving at the same position and speed)
     * @param target
     * @param position
     * @param speed
     * @return
     */
    public static int carFleet2(int target, int[] position, int[] speed){
        int[][] pair = new int[position.length][2];
        for(int i=0; i<position.length; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        for(int i=0; i<pair.length; i++){
            int[] p = pair[i];
            stack.push((double) (target-p[0])/p[1]);
            if(stack.size()>=2 && stack.peek()<=stack.get(stack.size()-2)){
                stack.pop();
            }
        }
        return stack.size();
    }
}

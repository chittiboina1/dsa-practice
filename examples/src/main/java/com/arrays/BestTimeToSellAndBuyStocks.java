package com.arrays;

public class BestTimeToSellAndBuyStocks {


    /**
     * Solution 1 to find out max profit to get if we buy and sell stocks using brute force.
     * @param prices
     * @return
     */
    public static int maxProfit1(int[] prices){
        int maxProfit=0;
        for(int l=0; l<prices.length; l++){
            for(int r=l+1; r<prices.length; r++){
                int profit = prices[r]-prices[l];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }


    /**
     * Solution 2 to find out max profit to get if we buy and sell stocks using two pointers.
     * @param prices
     * @return
     */
    public static int maxProfit2(int[] prices){
        int maxProfit=0;
        int l=0, r=1;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                int profit = prices[r]-prices[l];
                maxProfit = Math.max(maxProfit, profit);
            }else {
                l=r;
            }
            r++;
        }
        return maxProfit;
    }

    /**
     * Solution 3 to find out max profit to get if we buy and sell stocks using one loop with dynamic programming.
     * @param prices
     * @return
     */
    public static int maxProfit3(int[] prices){
        int maxProfit=0;
        int minBuy=prices[0];
        for(int i=0; i<prices.length; i++){
           maxProfit = Math.max(maxProfit, prices[i]-minBuy);
           minBuy = Math.min(minBuy, prices[i]);
        }
        return maxProfit;
    }
}

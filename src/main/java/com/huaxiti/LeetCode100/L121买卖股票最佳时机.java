package com.huaxiti.LeetCode100;

public class L121买卖股票最佳时机 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices1 = {2,5,1,3};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxprice = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < min){
                min = prices[i];
            }else if (prices[i] - min > maxprice){
                maxprice = prices[i] - min;
            }
        }
        return maxprice;
    }
}

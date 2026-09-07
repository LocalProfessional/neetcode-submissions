/**
 * Best Time to Buy and Sell Stock
 *
 * Starting from the last possible day, I keep track of the highest price seen so far, which
 * represents the best future selling price for the current day. For each day, I compute the profit
 * from buying at the current price and selling at that highest future price, then return the
 * maximum profit found at the end.
 *
 * @author Ahmad Saleh
 * Sept 6th, 2026
 */

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int maxPrice = 0;
        for (int buy = prices.length - 1; buy >= 0; buy--) {
            int currentPrice = prices[buy];
            if (maxPrice < prices[buy]) {
                maxPrice = prices[buy];
            }

            if (maxProfit < maxPrice - currentPrice) {
                maxProfit = maxPrice - currentPrice;
            }
        }

        return maxProfit;
    }
}

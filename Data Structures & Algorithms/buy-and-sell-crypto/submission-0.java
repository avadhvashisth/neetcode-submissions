class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int currMin = prices[0];
        for(int i = 0; i < prices.length; i++){
            int profit = prices[i] - currMin;
            max = Math.max(max, profit);

            currMin = Math.min(currMin, prices[i]);
        }
        return max;
    }
}

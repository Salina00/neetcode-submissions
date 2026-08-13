class Solution {
    public int maxProfit(int[] prices) {
        int l=0, r=1, max_profit = 0;
        while(r < prices.length){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                max_profit = Math.max(profit, max_profit);
            }else{
                l = r;
            }
            r++;
        }
        return max_profit;
    }
}

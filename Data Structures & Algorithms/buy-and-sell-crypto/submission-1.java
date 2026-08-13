class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int profit = 0;
        for(int j=1; j<prices.length; j++){
            if(prices[j]<min_price){
                min_price = prices[j];
            }else{
                profit = Math.max(profit, prices[j] - min_price);
            }
        }
        return profit;
    }
}

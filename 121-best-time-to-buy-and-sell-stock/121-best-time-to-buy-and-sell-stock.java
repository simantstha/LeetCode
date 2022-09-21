class Solution {
    public int maxProfit(int[] prices) {
       int profit=0;
        int curr =0;
        for(int i=1;i<prices.length;i++)
        {
            curr=Math.max(0,curr+=prices[i]-prices[i-1]);
            profit=Math.max(curr,profit);
        }
        return profit;
    }
}
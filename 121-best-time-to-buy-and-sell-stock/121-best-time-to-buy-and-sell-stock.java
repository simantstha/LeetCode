class Solution {
    public int maxProfit(int[] prices) {
       int max = 0;
        int minPos = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[minPos] < prices[i]){
                if(prices[i] - prices[minPos] > max){
                    max = prices[i] - prices[minPos];
                }  
            }else{
                minPos = i;  
            }
            
            
        }
        return max;
}
}
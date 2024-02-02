class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int low = prices[0];
        
        if(prices.length == 1){
            return 0;
        }
        
        for(int i=1; i<prices.length; i++){
            low = Math.min(low, prices[i]);
            max = Math.max(max, prices[i] - low);
        }
        
        return max;
    }
}
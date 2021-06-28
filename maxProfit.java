class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int n = prices.length - 1;
        int peak = 0;
        int valley = 0;
        int max = 0;
        int i = 0;
        
        while(i < n){
            while(i < n && prices[i] >= prices[i + 1]){
                i++;
            }
            valley = prices[i];
            while(i < n && prices[i] <= prices[i + 1]){
                i++;
            }
            peak = prices[i];
            max += peak - valley;
        }
        return max;
    }
}

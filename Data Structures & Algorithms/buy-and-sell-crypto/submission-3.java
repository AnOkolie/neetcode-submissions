class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int l = 0; 
        int r = 1;
        int profit = 0;
        while(r<n){
            while(l < n && prices[l] > prices[r]){
                l++;
            }
            if(l >= r){
                r = l+1;
            }
            if(r >= n) return profit;
            profit = Math.max(profit,prices[r]-prices[l]);
            r++;
        }
        return profit;
    }
}

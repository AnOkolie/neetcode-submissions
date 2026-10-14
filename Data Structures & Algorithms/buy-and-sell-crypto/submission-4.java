class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] dp = new int[n];
        dp[0] = 0;
        int min = prices[0];
        for(int i=1; i<n; i++){
            dp[i] = Math.max(prices[i] - min,dp[i-1]);
            min = Math.min(min,prices[i]);
        }
        return dp[n-1];
    }
}

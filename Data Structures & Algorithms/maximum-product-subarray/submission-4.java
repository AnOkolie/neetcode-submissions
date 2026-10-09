class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        if(n == 1){
            return nums[0];
        }
        dp[0] = nums[0];
        int max = dp[0];
        int f = nums[0];
        int g = nums[0];
        for(int i=1; i<n; i++){
            int currMax = f;
            int currMin = g;
            f = Math.max(currMax*nums[i],Math.max(currMin*nums[i],nums[i]));
            g = Math.min(currMax*nums[i],Math.min(currMin*nums[i],nums[i]));
            max = Math.max(max,f);
        }
        return max;
    }
}

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int max = 0;
        Arrays.fill(dp,1);
        for(int i=0; i<n; i++){
            int res = 0;
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i]){
                    res = Math.max(dp[j],res);
                }
            }
            dp[i] = res+1;
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}

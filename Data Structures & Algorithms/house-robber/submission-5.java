class Solution {
    private int[] dp;
    public int rob(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return dfs(nums,0);
    }
    public int dfs(int[] nums, int i){
        int n = nums.length;
        if(i >= n){
            return 0;
        }
        if(dp[i] >= 0){
            return dp[i];
        }
        dp[i] = Math.max(dfs(nums,i+1), nums[i]+dfs(nums,i+2));
        return dp[i];
    }
}

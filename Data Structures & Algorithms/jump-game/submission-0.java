class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean dp[] = new boolean[n];
        dp[0] = true;
        for(int i=0; i<n;i++){
            int j = i+1;
            while(j<n && j<=i+nums[i]){
                dp[j] = dp[i];
                j++;
            }
        }
        return dp[n-1];
    }
}

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[n] = true;
        for(int i=n-1; i>=0; i--){
            for(String str:wordDict){
                if(i+str.length()-1 < n && s.substring(i,i+str.length()).equals(str)){
                    dp[i] = dp[i+str.length()];
                    if(dp[i] == true){
                        break;
                    }
                }else{
                    dp[i] = false;
                }
            }

        }
        return dp[0];
    }
}

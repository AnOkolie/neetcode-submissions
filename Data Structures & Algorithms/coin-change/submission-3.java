class Solution {
    public int coinChange(int[] coins, int amount) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        int res = dfs(coins,amount,map);
        if(res == Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }
    public int dfs(int[] coins, int amount, Map<Integer,Integer> map){
        if(map.containsKey(amount)){
            return map.get(amount);
        }
        if(amount < 0){
            return Integer.MAX_VALUE;
        }
        int res = Integer.MAX_VALUE;
        for(int i=0; i<coins.length;i++){
            int cost = dfs(coins,amount-coins[i],map);
            if(cost != Integer.MAX_VALUE){
                res = Math.min(cost+1,res);
            }
        }
        map.put(amount,res);
        return res;
    }
}

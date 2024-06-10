class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int length = cost.length + 1;
        
        int dp[] = new int[length];
        
        for(int i = 0; i < cost.length; i++){
            dp[i] = cost[i];
        }
        
        dp[length-1] = 0;
        
        
        for(int i = length-3; i>=0; i--){
            dp[i] = Math.min(dp[i] + dp[i+1],dp[i] + dp[i+2]);
        }
        
        return Math.min(dp[0],dp[1]);
    }
}
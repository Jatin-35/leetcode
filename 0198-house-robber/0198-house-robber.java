class Solution {
    public int rob(int[] nums) {

        int dp [] = new int [nums.length+1];
        Arrays.fill(dp,-1);
        return helper(nums , nums.length - 1, dp);
        
    }

    public int helper(int [] nums , int i , int [] dp){

        if(i == 0) return nums[i];

        if(i < 0) return 0;

        if(dp[i] != -1) return dp[i];

        int pick = helper(nums , i - 2, dp) + nums[i];

        int notPick = helper(nums , i - 1, dp) + 0;

        return dp[i] = Math.max(pick , notPick);
    }
}
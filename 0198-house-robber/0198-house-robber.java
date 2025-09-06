class Solution {
    public int rob(int[] nums) {

        int n = nums.length;
        int dp [] = new int [nums.length+1];
        // Arrays.fill(dp,-1);
        // return helper(nums , nums.length - 1, dp);

        dp[0] = nums[0];

        for(int i = 1; i < n ; i++){

            int pick = nums[i];
            if(i>1) pick += dp[i-2];

            int notPick = dp[i-1] + 0;

            dp[i] = Math.max(pick , notPick);
        }
        

        return dp[n-1];
    }

    // public int helper(int [] nums , int i , int [] dp){

    //     if(i == 0) return nums[i];

    //     if(i < 0) return 0;

    //     if(dp[i] != -1) return dp[i];

    //     int pick = helper(nums , i - 2, dp) + nums[i];

    //     int notPick = helper(nums , i - 1, dp) + 0;

    //     return dp[i] = Math.max(pick , notPick);
    // }
}
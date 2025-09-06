class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int prev1 = nums[0]; // best till house i-1
        int prev2 = 0;       // best till house i-2

        for (int i = 1; i < n; i++) {
            int pick = nums[i] + (i > 1 ? prev2 : 0); // take current + dp[i-2]
            int notPick = prev1;                      // skip current, take dp[i-1]

            int curr = Math.max(pick, notPick);

            // shift forward
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}

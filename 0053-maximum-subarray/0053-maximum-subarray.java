class Solution {
    public int maxSubArray(int[] nums) {
        

        int n = nums.length;

        int max = nums[0];
        int maxEnding = nums[0];


        for(int i = 1; i < n ; i++){

            maxEnding = Math.max(nums[i] , maxEnding + nums[i]);
            max = Math.max(max , maxEnding);
        }

        return max;
    }
}
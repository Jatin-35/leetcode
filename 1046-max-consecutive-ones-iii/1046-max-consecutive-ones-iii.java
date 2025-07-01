class Solution {
    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int maxLen = 0;
        int zeros = 0;
        int len = 0;
        int l = 0;
        for(int r = 0 ; r < n ; r++){

            if(nums[r] == 0){
                zeros++;
            }

            while(zeros > k){
                if(nums[l] == 0){
                    zeros--;
                }
                l++;
            }

            maxLen = Math.max(maxLen , r - l +1);
        }
        return maxLen;
        
    }
}
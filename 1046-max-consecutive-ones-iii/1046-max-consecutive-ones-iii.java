class Solution {
    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int maxLen = 0;

        for(int i = 0 ; i < n ; i++){

            int len = 0;
            int zeros = 0;
            for(int j = i ; j < n ; j++){

                if(nums[j] == 0){
                    zeros++;
                }

                if(zeros <= k){
                    len = j -i + 1;
                }else{
                    break;
                }
            }

            maxLen = Math.max(maxLen , len);
            

        }

        return maxLen;
        
    }
}
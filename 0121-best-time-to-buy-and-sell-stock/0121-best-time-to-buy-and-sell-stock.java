class Solution {
    public int maxProfit(int[] nums) {

        int buy = nums[0];
        int maxProfit = 0;

        for(int i = 1 ; i < nums.length ; i++){

            if(buy > nums[i]){
                buy = nums[i];
            }else{
                maxProfit = Math.max(maxProfit , nums[i] - buy);
            }

        }
        
        return maxProfit;
    }
}
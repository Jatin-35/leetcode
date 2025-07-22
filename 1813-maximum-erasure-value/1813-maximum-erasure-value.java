class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        int n = nums.length;
        int maxSum = 0;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        int l = 0;

        for(int r = 0; r < n ; r++){

            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            set.add(nums[r]);
            sum += nums[r];

            maxSum = Math.max(maxSum , sum);
        }

        return maxSum;
        
    }
}
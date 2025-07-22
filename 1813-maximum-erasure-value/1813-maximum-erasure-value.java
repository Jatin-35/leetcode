class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        int n = nums.length;
        int maxSum = 0;
        int sum = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        while(r < n){
            sum += nums[r];
            map.put(nums[r] , map.getOrDefault(nums[r] , 0) + 1);
            
            while(map.get(nums[r]) > 1){
                sum -= nums[l];
                map.put(nums[l], map.get(nums[l]) - 1 );
                l++;
            }
            maxSum = Math.max(maxSum , sum);
            r++;
        }

        return  maxSum;
    }
}
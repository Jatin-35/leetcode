class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int sum = 0;
        int n = nums.length;

        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            int rem = sum - goal;

        count += map.getOrDefault(rem,0);
        map.put(sum , map.getOrDefault(sum,0) + 1);
        }

        return count;
    }
}
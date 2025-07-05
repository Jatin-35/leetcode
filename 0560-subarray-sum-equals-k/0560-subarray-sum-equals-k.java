class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // for cases when subarray starts from index 0

        for (int num : nums) {
            sum += num;
            int rem = sum - k;
            count += map.getOrDefault(rem, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;

    }
}
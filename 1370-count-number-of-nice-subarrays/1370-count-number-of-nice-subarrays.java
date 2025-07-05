class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int n = nums.length;
        for(int i = 0; i < n ; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }else{
                nums[i] = 1; 
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        map.put(0,1);
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            int rem = sum - k;
            count += map.getOrDefault(rem , 0);
            map.put(sum , map.getOrDefault(sum , 0) + 1);
        }
        
        return count;
    }
}
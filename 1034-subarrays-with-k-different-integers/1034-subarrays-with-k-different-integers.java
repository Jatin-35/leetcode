class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        return atMost(nums , k) - atMost(nums , k-1);
        
    }

    private int atMost(int [] nums , int k){

        int n = nums.length;
        int l = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int r = 0 ;r < n ; r++){

            map.put(nums[r] , map.getOrDefault(nums[r] , 0) + 1);

            if(map.get(nums[r]) == 1) k--;


            while(k < 0){
                map.put(nums[l] , map.get(nums[l]) - 1);
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);              
                    k++;
                }
                l++;
            }

            count += r-l+1;

        }

        return count;
    }
}
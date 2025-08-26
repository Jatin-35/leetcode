class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        int n = nums.length;
        List<List<Integer>>  list = new ArrayList<>();

        List<Integer> l = new ArrayList<>();

        helper(0 , nums , n , list , l);

        return list;
    }

    public void helper(int i , int [] nums , int n , List<List<Integer>>  list , List<Integer> l){

        if(i >= n){
            list.add(new ArrayList<>(l));
            return;
        }

        l.add(nums[i]);

        helper(i+1 , nums , n , list , l);

        l.remove(l.size() - 1);

        helper(i+1 , nums , n , list , l);
    }
}
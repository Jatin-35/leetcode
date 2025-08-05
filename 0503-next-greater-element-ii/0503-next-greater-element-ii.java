class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int [] ans = new int[n];

        for(int i = 2*n - 1 ; i >= 0 ; i--){

            //i = i % n;
            
            while(!stack.isEmpty() && nums[i % n] >= stack.peek()){
                stack.pop();
            }

            if(i < n){
                ans[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(nums[i% n]);
        }
        

        return ans;
    }
}
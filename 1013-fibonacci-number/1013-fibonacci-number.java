class Solution {
    public int fib(int n) {
        
        int [] dp = new int[n+1];
        Arrays.fill(dp , -1);

        return helper(n , dp );

    }

    public int helper(int n , int [] dp){
        if(n == 1 || n == 0){
            return n;
        }
        
        if(dp[n] != -1) return dp[n];

        return dp[n] = fib(n-1) + fib(n-2);
    }
}
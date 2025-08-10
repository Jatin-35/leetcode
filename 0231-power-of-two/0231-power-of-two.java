class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false; // ✅ Changed from n == 0 to n <= 0
        
        if((n & n-1) == 0) return true;

        return false;
        
    }
}
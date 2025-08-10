class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false; // ✅ Changed from n == 0 to n <= 0
        
        String s = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        
        return count == 1; // ✅ Simplified condition
    }
}
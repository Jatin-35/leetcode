class Solution {
    public String minWindow(String s, String t) {

        if(s.length() < t.length()){
            return "";
        }

        int l = 0 ; int r = 0 ; int minLen = Integer.MAX_VALUE ; int startIndex = -1;
        int count = 0;
        int []hash = new int[128];

        
        for(int i = 0 ; i < t.length() ; i++){
            hash[t.charAt(i)]++;
        }

        while(r < s.length()){

            if(hash[s.charAt(r)] > 0) {
                count++;
                
            }
            hash[s.charAt(r)]--;

            while(count == t.length()){

                if(r - l + 1 < minLen) {
                    minLen = r-l+1;
                    startIndex = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0) count--; 
                l++;
            }

            r++;
        }

        return startIndex == -1 ? "" : s.substring(startIndex , startIndex + minLen);
    }
}
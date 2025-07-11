class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        StringBuilder sb = new StringBuilder();

        String first = strs[0];
        String last = strs[strs.length - 1];

        
        int i = 0;
        for(char s : first.toCharArray()){

            if(last.charAt(i) != s){
                break;
            }else{
                sb.append(last.charAt(i));
                i++;
            }
        }
        
        return sb.toString();
    }
}
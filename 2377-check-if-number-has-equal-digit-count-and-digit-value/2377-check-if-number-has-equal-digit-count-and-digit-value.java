class Solution {
    public boolean digitCount(String num) {
        int[] count = new int[10]; // digits 0-9

        // Count frequency of each digit
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            count[digit]++;
        }

        // Check condition for each index
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) - '0' != count[i]) {
                return false;
            }
        }

        return true;
    }
}

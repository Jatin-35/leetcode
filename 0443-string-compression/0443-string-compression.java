class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int l = 0;
        int count = 1;

        for (int r = 1; r < n; r++) {
            if (chars[r] == chars[r - 1]) {
                count++;
            } else {
                chars[l++] = chars[r - 1];
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[l++] = c;
                    }
                }
                count = 1;
            }
        }

        // Final group
        chars[l++] = chars[n - 1];
        if (count > 1) {
            for (char c : Integer.toString(count).toCharArray()) {
                chars[l++] = c;
            }
        }

        return l;
    }
}

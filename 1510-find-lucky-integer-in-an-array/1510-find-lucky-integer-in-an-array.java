class Solution {
    public int findLucky(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = -1; // default if no lucky number found

        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find lucky number
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (key == value) {
                maxFreq = Math.max(maxFreq, key);
            }
        }

        return maxFreq;
    }
}

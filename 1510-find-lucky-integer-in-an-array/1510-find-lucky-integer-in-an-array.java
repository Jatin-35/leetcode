class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501]; // Since arr[i] ∈ [1, 500]

        for (int num : arr) {
            freq[num]++;
        }

        for (int i = 500; i >= 1; i--) {
            if (freq[i] == i) {
                return i; // largest lucky number will be found first
            }
        }

        return -1;
    }
}

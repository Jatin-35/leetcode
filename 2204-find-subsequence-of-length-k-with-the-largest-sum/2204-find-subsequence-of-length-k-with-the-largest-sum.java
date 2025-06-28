class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        // Step 1: Min-heap of (value, index)
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Step 2: Extract indices
        List<Integer> indices = new ArrayList<>();
        while (!pq.isEmpty()) {
            indices.add(pq.poll()[1]);
        }

        // Step 3: Sort indices to preserve order
        Collections.sort(indices);

        // Step 4: Build result
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[indices.get(i)];
        }

        return result;
    }
}

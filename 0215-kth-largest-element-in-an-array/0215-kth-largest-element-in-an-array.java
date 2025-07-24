class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int n = nums.length;

        PriorityQueue<Integer> Heap = new PriorityQueue<>();

        for(int x : nums){
            Heap.add(x);
            if(Heap.size() > k){
                Heap.poll();
            }
        }

        return Heap.peek();
    }
}
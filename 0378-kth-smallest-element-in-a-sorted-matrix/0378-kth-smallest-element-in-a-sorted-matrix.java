class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<Integer> heap= new PriorityQueue<>(
            (a,b) -> b - a
        );

        for (int[] row : matrix) {
            for (int value : row) {
                heap.add(value);
                if(heap.size() > k){
                    heap.poll();
                }
            }
            
        }

        return heap.peek();
        
    }
}
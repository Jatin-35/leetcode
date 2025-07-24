class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        

        int n = nums.length;
        if(n == k){
            return nums;
        }
        HashMap<Integer , Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num , freq.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> Heap = new PriorityQueue<>(
            (a,b) -> freq.get(a) - freq.get(b)
        );

        for(int x : freq.keySet()){
            Heap.add(x);
            if(Heap.size() > k){
                Heap.poll();
            }
        }

        int [] result = new int [k];

        for(int i = 0 ; i < k ; i++){
            result[i] = Heap.poll();
        }

        return result;
    }
}
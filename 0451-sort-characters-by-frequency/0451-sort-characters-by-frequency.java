class Solution {
    public String frequencySort(String s) {
        

        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0; i < s.length() ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }

        PriorityQueue<Map.Entry<Character , Integer>> queue = new PriorityQueue<>(
            (a,b) -> a.getValue() - b.getValue()
        );

        queue.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();

        while(!queue.isEmpty()){
            Map.Entry<Character, Integer> e = queue.poll();
            int val = e.getValue();
            char ch = e.getKey();

            while(val-- > 0 ) sb.append(ch);
        }

        return sb.reverse().toString();

    }

}
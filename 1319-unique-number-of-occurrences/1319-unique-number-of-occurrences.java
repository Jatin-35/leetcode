class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
       Map<Integer, Integer> map = new HashMap<>();

       for(int a : arr){
            map.put(a , map.getOrDefault(a, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            int freq = entry.getValue();
            if(set.contains(freq)){
                return false;
            }

            set.add(freq);
        }

        return true;
    }
}
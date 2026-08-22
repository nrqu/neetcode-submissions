class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> bucket = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < nums.length; ++i){
            bucket.put(nums[i],bucket.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] entries = new List[nums.length + 1];
        int[] result = new int[k];
        for(Map.Entry<Integer,Integer> entry: bucket.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(entries[value] == null){
                entries[value] = new ArrayList<Integer>();
            }
            entries[value].add(key);
        }
        int index = 0 ;
        for(int i = entries.length - 1 ; k >= 0; --i){
            if(entries[i] != null){
                for(int val: entries[i]){
                    result[index] = val;
                    ++index;
                }
                if(index == k) break;
            }
        }
        return result;
    }
}

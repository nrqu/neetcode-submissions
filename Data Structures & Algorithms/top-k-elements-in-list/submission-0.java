class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> bucket = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < nums.length; ++i){
            bucket.put(nums[i],bucket.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(bucket.entrySet());
        
        entries.sort((a, b)-> Integer.compare(b.getValue(),a.getValue()));
        int[] result = new int[k];
        for(int i = 0; i < k; ++i){
            result[i] = entries.get(i).getKey();
        }
        return result;
    }
}

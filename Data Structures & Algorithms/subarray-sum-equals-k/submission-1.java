class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int result = 0;
        map.put(0,1);
        int total = 0;
        for(var val: nums){
            total += val;
            int needed = total - k;
            if(map.containsKey(needed)) {
                result+= map.get(needed);
            }
            map.put(total,map.getOrDefault(total,0)+1);
        }
        return result;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(var val: nums){
            m.put(val,m.getOrDefault(val,0)+1);
        }
        int target = nums.length / 3;
        for(Map.Entry<Integer,Integer> entry: m.entrySet()){
            if(entry.getValue() > target){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
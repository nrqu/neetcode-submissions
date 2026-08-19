class Solution {
    public int majorityElement(int[] nums) {
        int topKey = nums[0];
        int topCount = 1;
        Map<Integer, Integer> counts = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length; ++i){
            counts.put(nums[i], counts.getOrDefault(nums[i], 0)+1);
            if(nums[i]== topKey){
                ++topCount;
            }else{
                if(topCount<= counts.get(nums[i])){
                    topCount = counts.get(nums[i]);
                    topKey = nums[i];
                }
            }
        }
        return topKey;
    }
}
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> bucket = new HashSet<Integer>();
        for(int i = 0; i < nums.length;++i){
            if(!bucket.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
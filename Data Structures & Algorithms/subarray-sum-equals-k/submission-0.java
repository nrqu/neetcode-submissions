class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        for(int i = 0; i < nums.length; ++i){
            int total = 0;
            int j = i;
            while(j < nums.length){
                total+=nums[j];
                if(total == k){
                    ++result;
                }
                ++j;
            }
        }
        return result;
    }
}


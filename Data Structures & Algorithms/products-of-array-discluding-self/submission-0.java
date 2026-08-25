class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int[] result = new int[nums.length];

        int left = 1;
        int right = 1;

        for(int i =1; i <= nums.length;++i){
            leftProduct[i-1] = left;
            left *= nums[i-1];
        }
        for(int i = nums.length - 2; i >=-1 ;--i){
            rightProduct[i+1] = right;
            right *= nums[i+1];
        }
        for(int i = 0 ; i < nums.length; ++i){
            result[i] = leftProduct[i] * rightProduct[i];
        }
        return result;
    }
}  

class Solution {
    public int trap(int[] height) {
        int total = 0;
        int left = height[0];
        int right = height[height.length-1];
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        leftMax[0] = height[0];
        rightMax[height.length - 1] = height[height.length - 1];
        for(int i = 1; i < height.length ; ++i){
            if(height[i] > left){
                left = height[i];
            }
            leftMax[i] = left;
        }
        for(int i = height.length - 2; i >= 0 ; --i){
            if(height[i] > right){
                right = height[i];
            }
            rightMax[i] = right;
        }
        for(int i = 0; i < height.length;++i){
            total += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return total;
    }
}

class Solution {
    public int maxArea(int[] heights) {
        int  result = 0;
        int left = 0;
        int right = heights.length -1;
        while(left < right) {
            int min_num = Math.min(heights[left],heights[right]);
            int index_diff = right - left;
            result = Math.max(index_diff * min_num,result);
            if(heights[left] < heights[right])++left;
            else if(heights[right] < heights[left])--right;
            else if(heights[right] == heights[left])++left;

        }
        return result;
    }
}

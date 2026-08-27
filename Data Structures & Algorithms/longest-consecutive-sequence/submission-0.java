class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for(var val: nums){
            values.add(val);
        }
        int longest = 0;
        for(var val : nums){
            if(!values.contains(val-1)){
                int count = 0;
                int num = val;
                while(values.contains(num++)){
                    ++count;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}

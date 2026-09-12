class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0;
        int max = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0 ;i < s.length(); ++i){
            Character c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
            max = Math.max(max, map.get(c));
            while((i - left + 1) - max > k){
                Character leftC = s.charAt(left);
                map.put(leftC, map.get(leftC)-1);
                ++left;
            }
            result = i - left + 1;
        }
        return result;
    }
}

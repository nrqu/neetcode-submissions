class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length( ) > s2.length()) return false;
        int[] s1count = new int[26];
        int[] window = new int[26];
        int windowSize = s1.length();
        for(int i = 0 ; i < s1.length(); ++i) {
            s1count[s1.charAt(i)-'a']++;
        }
        for(int i = 0; i < windowSize; ++i){
            window[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(window,s1count)) return true;

        for(int i = windowSize; i < s2.length();++i){
            window[s2.charAt(i)-'a']++;
            window[s2.charAt(i-windowSize)-'a']--;
            if(Arrays.equals(window,s1count)) return true;
        }
        return false;
    }
}

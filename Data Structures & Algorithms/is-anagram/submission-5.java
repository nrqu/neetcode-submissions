class Solution {
    public boolean isAnagram(String s, String t) {
        int[] aBucket = new int[26];
        if(s.length() != t.length())
            return false;
        int size = s.length();
        for(int i = 0; i < size; i++ ){
           aBucket[Character.toLowerCase(s.charAt(i)) - 'a'] += 1;
           aBucket[Character.toLowerCase(t.charAt(i)) - 'a'] -= 1;
        }
        for(int i : aBucket){
            if(i != 0) return false;
        }
        return true;
    }
}

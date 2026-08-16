class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Character c;
        String result = "";
        for(int i  = 0; i < strs[0].length();++i){
            c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length() <= i || strs[j].charAt(i) != c)
                    return strs[0].substring(0,i);
            }
            result = strs[0].substring(0,i);
        }
        return strs[0];
    }
}


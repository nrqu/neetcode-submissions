class Solution {
    public boolean isPalindrome(String s) {
        String temp = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>(); 
        for(int i = 0; i < temp.length(); ++i){
            stack.push(temp.charAt(i));
        }
        for(int i = 0; i < temp.length();++i){
            if(temp.charAt(i) != stack.pop()) return false;
        }
        return true;
    }
}

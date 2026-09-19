class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(']','[');
        map.put(')','(');
        map.put('}','{');

        for(var curr: s.toCharArray()){
             if (map.containsKey(curr)) {
                if (!stack.isEmpty() && stack.peek() == map.get(curr)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(curr);
            }
        }
        return stack.isEmpty();
    }
}

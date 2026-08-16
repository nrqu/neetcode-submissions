class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> table = new HashMap<String, List<String>>();
        for(String str: strs){
            char[] curr = str.toCharArray();
            Arrays.sort(curr);
            String key = new String(curr);
            table.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }  
        return new ArrayList<>(table.values());
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            
            // Convert count array to string key
            StringBuilder key = new StringBuilder();
            for (int num : count) {
                key.append(num).append('#');
            }

            result.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
        }
        
        return new ArrayList<>(result.values());
    }
}

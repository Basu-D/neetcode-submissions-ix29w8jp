class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> result = new HashMap<>();
        
        for (String s : strs) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            
            List<Integer> countList = new ArrayList<>(26);
            for (int num : count) {
                countList.add(num);
            }

            result.computeIfAbsent(countList, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(result.values());
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        /** approach */
        //2 conditions for s and t to be anagram
        //1. t should have all the characters that s has
        //2. frequency of characters should match
        //iterate over s and store character with its frequency
        //interate over t and check if the character is present in hashmap, 
        //if present then deduct the freuency
        //at the end frequency of all the characters in the hashmap should be 0
        
        /** solution */
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c:s.toCharArray()) {
            if(freqMap.containsKey(c)) {
                freqMap.put(c, freqMap.get(c)+1);
            } else {
                freqMap.put(c, 1);
            }
        } 
        
        for(char c:t.toCharArray()) {
            if(freqMap.containsKey(c)) {//validate condition 1
                freqMap.put(c, freqMap.get(c)-1);
            } else { //condition 1 failed
                return false;
            }
        }

        //validate condition 2  
        for(Map.Entry<Character, Integer> entry: freqMap.entrySet()) {
            if(entry.getValue() != 0) return false; //condtion 2 failed
        }
        return true;
    }
}

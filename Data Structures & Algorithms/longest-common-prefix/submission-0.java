class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder commonPrefixSb = new StringBuilder();
        String smallestStr = strs[0]; //assume
        int smallestStrLength = smallestStr.length();
        for(int i=0; i<strs.length; i++) {
            if(strs[i].length()<smallestStrLength) {
                smallestStrLength = strs[i].length();
            }
        }
        for(int i=0; i<smallestStrLength; i++) {
            char currChar = smallestStr.charAt(i);
            for(int j=0; j<strs.length; j++) {
                String currStr = strs[j];
                if(currStr.charAt(i)!=currChar) {
                    return commonPrefixSb.toString();
                }
            }
            commonPrefixSb.append(currChar);
        }
        return commonPrefixSb.toString();
    }
}
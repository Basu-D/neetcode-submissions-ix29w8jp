class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstStr = strs[0];
        for(int i=0; i<firstStr.length(); i++) {
            char currChar = firstStr.charAt(i);
            for(int j=0; j<strs.length; j++) {
                if(i >= strs[j].length() || strs[j].charAt(i)!=currChar) {
                    return firstStr.substring(0, i);
                }
            }
        }
        return firstStr;
    }
}
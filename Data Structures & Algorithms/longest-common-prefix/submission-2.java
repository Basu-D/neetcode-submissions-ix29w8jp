class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); //sorts lexicographically
        String firstStr = strs[0];
        String lastStr = strs[strs.length - 1];
        int i=0;
        while(i < firstStr.length() && i < lastStr.length() 
               && firstStr.charAt(i) == lastStr.charAt(i)) {
            i++;
        }
        return firstStr.substring(0, i);
    }
}
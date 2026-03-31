class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
int[] result = new int[2 * n];
// Copy nums to result starting at index 0
System.arraycopy(nums, 0, result, 0, n);
// Copy nums to result starting at index n
System.arraycopy(nums, 0, result, n, n);
        return result;
    }
}
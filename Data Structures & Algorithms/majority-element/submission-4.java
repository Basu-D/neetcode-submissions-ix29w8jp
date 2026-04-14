class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            // If num matches candidate, increase weight, else decrease weight
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
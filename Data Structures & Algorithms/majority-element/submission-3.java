class Solution {
    public int majorityElement(int[] nums) {
        int leader = nums[0]; int vote = 0;
        for (int i = 0; i<nums.length; i++) {
            if(nums[i] == leader) {
                vote++;
            } else {
                vote--;
            }
            if(vote <= 0) {
                leader = nums[i];
            }
        }
        return leader; 
    }
}
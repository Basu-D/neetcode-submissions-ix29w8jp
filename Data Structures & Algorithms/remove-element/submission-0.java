class Solution {
    public int removeElement(int[] nums, int val) {
        int p1 = 0, p2 = 0;
        while(p1 < nums.length) {
            if(nums[p1] != val && nums[p2] != val) {
                p1++; p2++;
            } else if(nums[p1] != val) {
                int temp = nums[p2];
                nums[p2] = nums[p1];
                nums[p1] = temp;
                p1++; p2++;
            } else {
                p1++;
            }
        }
        return p2;
    }
}
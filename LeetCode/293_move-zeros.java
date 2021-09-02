/**
 * 283. Move Zeroes
 * Easy
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int wIdx = 0;

        for (int idx=0; idx<nums.length; idx++) {
            if (nums[idx] != 0) {
                nums[wIdx] = nums[idx];
                wIdx++;
            }
        }

        // setZeroes();
        for (; wIdx<nums.length; wIdx++) {
            nums[wIdx] = 0;
        }
    }
}
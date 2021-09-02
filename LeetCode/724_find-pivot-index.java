/**
 * 724. Find Pivot Index
 * Easy
 */
class Solution {
    public int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int leftSum = 0;
        int rightSum = sum;

        int pastPivotNum = 0;
        for (int idx=0; idx<nums.length; idx++) {
            int num = nums[idx];
            rightSum = rightSum - num;
            leftSum = leftSum + pastPivotNum;

            if (leftSum == rightSum) {
                return idx;
            }
            pastPivotNum = num;
        }

        return -1;
    }
}
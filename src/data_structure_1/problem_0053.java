package data_structure_1;

/**
 Given an integer array nums, find the subarray with the largest sum, and return its sum.
 */
public class problem_0053 {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum <= 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public int maxSubArrayNotMy(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for (int i = 1; i<nums.length; i++) {
            maxEndingHere = Math.max(maxEndingHere+nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}

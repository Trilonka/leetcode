package easy;

import java.util.HashMap;
import java.util.Map;

public class problem_0001 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> metNums = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (metNums.containsKey(target - nums[i])) {
                return new int[] {metNums.get(target - nums[i]), i};
            }
            metNums.put(nums[i], i);
        }

        return new int[] {};
    }
}

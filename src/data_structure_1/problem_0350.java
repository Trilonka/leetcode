package data_structure_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 Given two integer arrays nums1 and nums2, return an array of their intersection.
 Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */
public class problem_0350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums = new HashMap<>();
        for (int i : nums1) {
            nums.computeIfPresent(i, (k, v) -> v+1);
            nums.putIfAbsent(i, 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int i : nums2) {
            nums.computeIfPresent(i, (k, v) -> {
                if (v>0) result.add(i);
                return v-1;
            });
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}

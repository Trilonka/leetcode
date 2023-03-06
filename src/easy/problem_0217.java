package easy;

import java.util.HashSet;
import java.util.Set;

/**
 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
public class problem_0217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int num : nums) {
            if (uniques.contains(num)) return true;
            uniques.add(num);
        }
        return false;
    }
}

package easy;

/**
 Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You must write an algorithm with O(log n) runtime complexity.
 */
public class problem_0035 {

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1, mid;
        while (left < right) {
            mid = (left + right)/2 + 1;
            if (nums[mid] > target) {
                right = mid-1;
            } else {
                left = mid;
            }
        }
        return nums[left] == target ? left : left+1;
    }
}

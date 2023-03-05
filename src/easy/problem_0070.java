package easy;

/**
 You are climbing a staircase. It takes n steps to reach the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class problem_0070 {

    public int climbStairs(int n) {
        int left = 1, right = 0;
        while (n-- > 0) {
            right = right + left;
            left = right - left;
        }
        return right;
    }
}

package medium;

/**
 Given a signed 32-bit integer x, return x with its digits reversed.
 If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

 Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class problem_0007 {

    public static int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
        int result = 0;
        while (x > 0) {
            if (Integer.MAX_VALUE/10 < result || (Integer.MAX_VALUE - result*10) < x%10) {
                return 0;
            }
            result = result*10 + x%10;
            x /= 10;
        }
        return sign*result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(Integer.MIN_VALUE+8));
    }
}

package medium;

/**
 Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

 The algorithm for myAtoi(string s) is as follows:

 Read in and ignore any leading whitespace.
 Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
 Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 Return the integer as the final result.
 Note:

 Only the space character ' ' is considered a whitespace character.
 Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 */
public class problem_0008 {

    public int myAtoi(String s) {
        s = s.trim();
        if (s.length()<1) return 0;
        int sIndex = 0, sign = 1, result = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = 1 - 2*(s.charAt(sIndex++)=='-' ? 1 : 0);
        }
        while (sIndex < s.length() && s.charAt(sIndex)>='0' && s.charAt(sIndex)<='9') {
            if (Integer.MAX_VALUE/10 < result || (Integer.MAX_VALUE-result*10) < (s.charAt(sIndex)-'0')) {
                if (sign>0) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            result = result*10 + (s.charAt(sIndex++)-'0');
        }
        return sign*result;
    }
}

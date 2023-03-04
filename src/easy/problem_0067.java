package easy;

/**
 Given two binary strings a and b, return their sum as a binary string.
 */
public class problem_0067 {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0, i = a.length()-1, j = b.length()-1;
        while (i>=0 || j>=0) {
            if (i >= 0) carry += a.charAt(i--) - '0';
            if (j >= 0) carry += b.charAt(j--) - '0';
            result.append(carry%2);
            carry /= 2;
        }
        if (carry > 0) result.append('1');
        return result.reverse().toString();
    }
}

package easy;

public class problem_0009 {

    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int i = 0, j = num.length()-1;
        while (i<j) {
            if (num.charAt(i++) != num.charAt(j--)) {
                return false;
            }
        }
        return (i > j) || num.charAt(i) == num.charAt(j);
    }

    public boolean isPalindromeNotMy(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev) {
            rev = rev*10 + x%10;
            x /= 10;
        }
        return (x==rev || x==rev/10);
    }
}

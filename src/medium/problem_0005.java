package medium;

/**
 Given a string s, return the longest palindromic substring in s.
 */
public class problem_0005 {

    int leftIndex, maxLen;

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            palindromeLenFromIndex(s, i, i);
            palindromeLenFromIndex(s, i, i+1);
        }
        return s.substring(leftIndex, leftIndex+maxLen);
    }

    private void palindromeLenFromIndex(String s, int left, int right) {
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (maxLen < right-left-1) {
            maxLen = right-left-1;
            leftIndex = left+1;
        }
    }
}

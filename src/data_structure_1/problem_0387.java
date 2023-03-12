package data_structure_1;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 */
public class problem_0387 {

    public int firstUniqChar(String s) {
        int[] repeats = new int[26];
        for (char c : s.toCharArray()) {
            repeats[c-'a']++;
        }
        for (int i = 0; i<s.length(); i++) {
            if (repeats[s.charAt(i)-'a'] == 1) return i;
        }
        return -1;
    }
}

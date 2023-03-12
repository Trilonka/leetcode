package data_structure_1;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class problem_0242 {

    public boolean isAnagram(String s, String t) {
        int[] lettersCount = new int[26];
        for (char c : s.toCharArray()) {
            lettersCount[c-'a']++;
        }
        for (char c : t.toCharArray()) {
            lettersCount[c-'a']--;
        }
        for (int i : lettersCount) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}

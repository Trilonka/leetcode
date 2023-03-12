package data_structure_1;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 */
public class problem_0383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineLetters = new int[26];
        for (char c : magazine.toCharArray()) {
            magazineLetters[c-'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (--magazineLetters[c-'a'] < 0) return false;
        }
        return true;
    }
}

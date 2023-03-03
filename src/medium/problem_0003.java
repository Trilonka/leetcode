package medium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class problem_0003 {

    public int lengthOfLongestSubstring(String s) {
        LinkedHashSet<Character> symbols = new LinkedHashSet<>();

        int current = 0;
        int result = 0;

        while (current < s.length()) {
            if (symbols.contains(s.charAt(current))) {
                Iterator<Character> it = symbols.iterator();
                while (it.hasNext()) {
                    boolean flag = it.next()==s.charAt(current);
                    it.remove();
                    if (flag) break;
                }
            }
            symbols.add(s.charAt(current++));
            result = Math.max(result, symbols.size());
        }

        return result;
    }

    public int lengthOfLongestSubstringNotMy(String s) {
        HashMap<Character, Integer> symbols = new HashMap<>();
        int max = 0;
        for (int i=0, j=0; j < s.length(); ++j) {
            if (symbols.containsKey(s.charAt(j))) {
                i = Math.max(i, symbols.get(s.charAt(j))+1);
            }
            symbols.put(s.charAt(j), j);
            max = Math.max(max, j-i+1);
        }
        return max;
    }
}

package easy;

import java.util.HashMap;
import java.util.Map;

/**
 Given a roman numeral, convert it to an integer.
 */
public class problem_0013 {

    public int romanToInt(String s) {
        Map<Character, Integer> sym = new HashMap<>();
        sym.put('I', 1); sym.put('V', 5);
        sym.put('X', 10); sym.put('L', 50);
        sym.put('C', 100); sym.put('D', 500);
        sym.put('M', 1000);

        int result = 0;

        for (int i = 0; i<s.length(); i++) {
            if (i>0 && sym.get(s.charAt(i-1)) < sym.get(s.charAt(i))) {
                result += sym.get(s.charAt(i)) - 2*sym.get(s.charAt(i-1));
            } else {
                result += sym.get(s.charAt(i));
            }
        }
        return result;
    }
}

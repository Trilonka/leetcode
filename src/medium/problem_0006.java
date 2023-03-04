package medium;

import java.util.Arrays;

/**
 The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R

 And then read line by line: "PAHNAPLSIIGYIR"

 Write the code that will take a string and make this conversion given a number of rows:
 */
public class problem_0006 {

    public static String convert(String s, int numRows) {
        if (s.length() < 2 || numRows < 2) return s;
        String[] result = new String[numRows];
        Arrays.fill(result, "");
        int div = 2*numRows-2;
        for (int i = 0; i<s.length(); i++) {
            int ost = i%div;
            result[ost < numRows ? ost : div-ost] += s.charAt(i);
        }
        return String.join("", result);
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }
}

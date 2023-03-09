package easy;

import java.util.ArrayList;
import java.util.List;

/**
 Given an integer numRows, return the first numRows of Pascal's triangle.

 In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 */
public class problem_0118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(result.get(i-1).size());
            row.add(1);
            for (int j = 0; j < result.get(i-1).size()-1; j++) {
                row.add(result.get(i-1).get(j)+result.get(i-1).get(j+1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}

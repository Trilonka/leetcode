package data_structure_1;

/**
 You are given an m x n integer matrix matrix with the following two properties:

 Each row is sorted in non-decreasing order.
 The first integer of each row is greater than the last integer of the previous row.
 Given an integer target, return true if target is in matrix or false otherwise.

 You must write a solution in O(log(m * n)) time complexity.
 */
public class problem_0074 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, highRow = matrix.length-1;
        while (row < highRow) {
            int midRow = (row+highRow)/2 + 1;
            if (target < matrix[midRow][0]) {
                highRow = midRow - 1;
            } else {
                row = midRow;
            }
        }
        int column = 0, highColumn = matrix[0].length-1;
        while (column < highColumn) {
            int midColumn = (column+highColumn)/2 + 1;
            if (target < matrix[row][midColumn]) {
                highColumn = midColumn - 1;
            } else {
                column = midColumn;
            }
        }
        return target == matrix[row][column];
    }
}

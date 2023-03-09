package easy;

/**
 In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

 You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

 The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

 If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
 */
public class problem_0566 {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length, m = mat[0].length;
        if (r*c != n*m) return mat;
        int[][] newMat = new int[r][c];
        for (int i = 0; i<n*m; i++) {
            newMat[i/c][i%c] = mat[i/m][i%m];
        }
        return newMat;
    }
}

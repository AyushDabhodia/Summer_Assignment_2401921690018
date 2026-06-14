public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[] flatArray = new int[m * n];
        int k = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                flatArray[k] = mat[i][j];
                k++;
            }
        }

        int[][] result = new int[r][c];
        int index = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = flatArray[index];
                index++;
            }
        }

        return result;
    }
}

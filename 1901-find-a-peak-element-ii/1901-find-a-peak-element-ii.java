class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {

            int maxCol = 0;

            for (int j = 1; j < cols; j++) {

                if (mat[i][j] > mat[i][maxCol])
                    maxCol = j;
            }

            boolean up = (i == 0) || (mat[i][maxCol] > mat[i - 1][maxCol]);
            boolean down = (i == rows - 1) || (mat[i][maxCol] > mat[i + 1][maxCol]);

            if (up && down)
                return new int[]{i, maxCol};
        }

        return new int[]{-1, -1};
    }
}
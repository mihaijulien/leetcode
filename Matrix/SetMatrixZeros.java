class Solution {
    public void setZeroes(int[][] matrix) {
        
        Set<Integer> zero_rows = new HashSet<>();
        Set<Integer> zero_cols = new HashSet<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; ++i) {
          for (int j = 0; j < cols; ++j) {
            if (matrix[i][j] == 0) {
                zero_rows.add(i);  
                zero_cols.add(j);  
            }
          }
        }

        for (int r : zero_rows) {
          for (int c = 0; c < cols; ++c) {
            matrix[r][c] = 0;
          }
        }

        for (int c : zero_cols) {
          for (int r = 0; r < rows; ++r) {
            matrix[r][c] = 0;
          }
        }
    }
}

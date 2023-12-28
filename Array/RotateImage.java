class Solution {
    public void rotate(int[][] matrix) {
        
        // Transpose 2d matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //reverse each row
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - j -1];
                matrix[i][matrix[0].length - j - 1] = temp;
            }
        }
    }
}
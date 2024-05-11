class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if (mat.length * mat[0].length != r * c){
            return mat;
        }
        
        int[][] output_mat = new int[r][c];
        
        int output_r = 0;
        int output_c = 0;
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                output_mat[output_r][output_c] = mat[i][j];
                output_c++;
                
                if(output_c == c){
                    output_c = 0;
                    output_r ++;
                }
            }
        }
        
        return output_mat;
    }
}
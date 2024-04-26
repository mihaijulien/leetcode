class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int start = 0;
        int end = rows * columns - 1;
        
        while(start <= end) {
            int mid = (start + end) / 2;
            int midValue = matrix[mid/columns][mid%columns];
            
            if (target == midValue){
                return true;
            } else if (target > midValue){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return false;
    }
}

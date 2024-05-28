class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        int[] result = new int[nums.length];
        int idx = 0;
        
        while(left <= right){
             if (Math.abs(nums[left]) > Math.abs(nums[right])){
                result[idx] = nums[left] * nums[left];
                left++;
            } else {
                result[idx] = nums[right] * nums[right];
                right--;
            }
            idx++;
        }
    
        // reverse array in place
        for(int i=0; i<result.length/2; i++){
            int temp = result[i];
            result[i] = result[(result.length - 1) -i];
            result[(result.length-1) -i] = temp;
        }
        
        return result;
    }
}


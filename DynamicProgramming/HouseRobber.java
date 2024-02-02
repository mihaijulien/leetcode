class Solution {
    public int rob(int[] nums) {
        int [] robbed = new int[nums.length];
        
        // nums   = [2, 7, 9, 3, 1]
        //                 i ->
        // robbed = [2, 7, 11, 11, 12]
        
        if(nums.length == 1){
            return nums[0];
        }
        
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        
        robbed[0] = nums[0];
        robbed[1] = nums[1];
        
        for(int i=2; i < nums.length; i++){
            robbed[i] = Math.max(robbed[i-1], robbed[i-2] + nums[i]);        
        }
        
        return robbed[robbed.length -1];
    }
}
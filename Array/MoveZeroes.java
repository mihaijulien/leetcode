class Solution {
    public void moveZeroes(int[] nums) { 
        int L = 0; // keep this pointer at the left most zero
        int R = 1; // move this pointer at the first non-zero element in order to swap values with leftPointer
        
        //[0,0,1,2,3]
        // L
        //   R
        while(R < nums.length){
            if(nums[L] != 0){
                L++;
                R++;
            }
            else if(nums[R] == 0){
                R++;     
            } else {
                int temp = nums[L];
                nums[L] = nums[R];
                nums[R] = temp;
            }
        }
    }
}
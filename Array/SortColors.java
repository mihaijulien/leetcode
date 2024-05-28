class Solution {
    public void sortColors(int[] nums) {
        int p0 = 0;
        int current = 0;
        int p2 = nums.length - 1;
        
        int tmp;
        
        while(current <= p2){
            if(nums[current] == 0){
                tmp = nums[p0];
                nums[p0] = nums[current];
                nums[current] = tmp;
                
                p0++;
                current++;
            } else if(nums[current] == 2){
                tmp = nums[current];
                nums[current] = nums[p2];
                nums[p2] = tmp;
                
                p2--;
            } else {
                current++;
            }
        }
    }
}

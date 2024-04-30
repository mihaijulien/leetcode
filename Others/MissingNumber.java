class Solution {
    public int missingNumber(int[] nums) {
        
        int numsSum = 0;
        int totalSum = 0;
        
        for (int i=1; i<=nums.length; i++){
            totalSum += i;
        }
        
        for (int i=0; i<nums.length; i++){
            numsSum += nums[i];
        }
        
        
        return totalSum - numsSum;
    }
}
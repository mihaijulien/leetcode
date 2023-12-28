class Solution {
    public int removeDuplicates(int[] nums) {
        int lastUniqueElement = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[lastUniqueElement] != nums[i]){
                nums[lastUniqueElement+1] = nums[i];
                lastUniqueElement++;
            }
        }
        return lastUniqueElement+1;
    }
}
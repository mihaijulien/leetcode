class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}

import java.util.HashSet;

class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            unique.add(nums[i]);
        }
        return unique.size() != nums.length;
    }
}
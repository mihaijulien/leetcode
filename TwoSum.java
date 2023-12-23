class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[1];
    }
}

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>(); // key: value, value: index
        for(int i=0; i<nums.length; i++) {
            if(numsMap.containsKey(target - nums[i])){
                return new int[] {numsMap.get(target - nums[i]), i};
            }
            numsMap.put(nums[i], i);
        }
        return new int[1];
    }
}
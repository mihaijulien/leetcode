class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            frequencyMap.put(nums[i],frequencyMap.getOrDefault(nums[i], 0) + 1);
        }
        
        for(int element : frequencyMap.keySet()){
            if(frequencyMap.get(element) > nums.length / 2){
                return element;
            }
        }
        
        return -1;
    }
}

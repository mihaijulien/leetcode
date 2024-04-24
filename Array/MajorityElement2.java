class Solution {
    public  List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> majorityElements = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            frequencyMap.put(nums[i],frequencyMap.getOrDefault(nums[i], 0) + 1);
        }
        
        for(int element : frequencyMap.keySet()){
            if(frequencyMap.get(element) > nums.length / 3){
                majorityElements.add(element);
            }
        }
        
        return majorityElements;
    }
}

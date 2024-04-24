class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int mostFrequent = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                frequencyMap.put(nums[i],frequencyMap.getOrDefault(nums[i], 0) + 1);
                if(frequencyMap.get(nums[i]) > mostFrequent){
                    mostFrequent = frequencyMap.get(nums[i]);
                } 
            }
        }
        
        int item = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            if(entry.getValue() == mostFrequent){
                item = Math.min(item, entry.getKey());
            }
        }
        
        if(item == Integer.MAX_VALUE){
            return -1;
        }
        
        return item; 
    }
}

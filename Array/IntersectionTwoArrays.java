class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numsMap = new HashMap<>(); // <value : frequency>
        List<Integer> intersectionResult = new ArrayList<>();
        
        for(int i=0; i<nums1.length; i++){
            if(numsMap.containsKey(nums1[i])){
                numsMap.put(nums1[i], numsMap.get(nums1[i]) + 1);
            } else {
                numsMap.put(nums1[i], 1);
            }
        }
        
        for(int i=0; i<nums2.length; i++){
            if(numsMap.containsKey(nums2[i])){
                intersectionResult.add(nums2[i]);
                numsMap.put(nums2[i], numsMap.get(nums2[i]) - 1);
                if(numsMap.get(nums2[i]) == 0){  // frequency = 0 => remove entry
                    numsMap.remove(nums2[i]);
                }
            }
        }
        int[] result = new int[intersectionResult.size()];
        for(int i=0; i<result.length; i++){
            result[i] = intersectionResult.get(i);
        }
        return result;
    }
}
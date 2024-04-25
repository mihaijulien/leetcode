class Solution {
    
    List<Integer> currentCombination = new ArrayList<>();
    List<List<Integer>> allCombinations = new ArrayList<>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        combinationSum(candidates, target, 0);
        return allCombinations;
    }
    
    private void combinationSum(int[] candidates, int target, int index){
        if(target == 0){
            allCombinations.add(new ArrayList<>(currentCombination));
            return;
        }
        
        for (int i = index; i < candidates.length && candidates[i] <= target; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) { // avoid duplicates
                 continue;
             }
            currentCombination.add(candidates[i]);
            combinationSum(candidates, target - candidates[i], i+1); 
            currentCombination.remove(currentCombination.size() - 1); 
        }
    }
}

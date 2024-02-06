import java.util.Random;

class Solution {
    
    int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int[] shuffled = nums.clone();
        Random rand = new Random();
        for(int i=0; i<shuffled.length; i++){
            int randomNum = rand.nextInt(shuffled.length);
            int temp = shuffled[randomNum];
            shuffled[randomNum] = shuffled[i];
            shuffled[i] = temp;
        }

        return shuffled;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
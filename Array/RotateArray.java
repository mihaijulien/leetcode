class Solution {
    public void rotate(int[] nums, int k) {
        while(k>0){
            int last = nums[nums.length -1];
            for(int i=nums.length-1; i>0; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = last;
            k--;
        }
    }
}

class Solution2 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        // Input: nums = [1,2,3,4,5,6,7], k = 3
        // Output: [5,6,7,1,2,3,4]
        
        // Reverse the entire array
        // [7,6,5,4,3,2,1]
        
        // Reverse the first k elements
        // [5,6,7,4,3,2,1]
        
        // Reverse the last nums.length - k elements
        // [5,6,7,1,2,3,4]
        
        reverse(0, nums.length - 1, nums);
        reverse(0, k - 1, nums);
        reverse(k, nums.length - 1, nums);
    }
    
    private void reverse(int start, int end, int[] nums){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
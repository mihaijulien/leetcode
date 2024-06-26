class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWaterAmount = 0;
        
        while(left < right){
            maxWaterAmount = Math.max(maxWaterAmount, Math.min(height[left], height[right]) * (right - left));
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        
        return maxWaterAmount;
    }
}

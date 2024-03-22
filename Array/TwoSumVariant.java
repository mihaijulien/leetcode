/**
 * 
 * Given an array of integers arr and an integer k, create a boolean function that checks if there exist two elements in arr such that we get k when we add them together.

Example 1:

    Input: arr = [4, 5, 1, -3, 6], k = 11

    Output: true

    Explanation: 5 + 6 is equal to 11

Example 2:

    Input: arr = [4, 5, 1, -3, 6], k = -2

    Output: true

    Explanation: 1 + (-3) is equal to -2

Example 3:

    Input: arr = [4, 5, 1, -3, 6], k = 8

    Output: false

    Explanation: there is no pair that sums up to 8
 * 
 * **/


class Solution {
    public boolean twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        
        while(leftIndex < rightIndex){
            if(nums[leftIndex] + nums[rightIndex] == target){
                return true;
            } else if (nums[leftIndex] + nums[rightIndex] > target) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }
        return false;
    }
}
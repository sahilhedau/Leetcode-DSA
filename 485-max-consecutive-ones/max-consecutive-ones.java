class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = Integer.MIN_VALUE;
        int left = 0;
        int right = nums.length-1;
        int count = 0;
        while(left <= right){
            if(nums[left] == 1){
                count++;
            }else{
                count = 0;
            }
            maxCount = Math.max(count,maxCount);
            left++;
        }
    return maxCount;
    }
}
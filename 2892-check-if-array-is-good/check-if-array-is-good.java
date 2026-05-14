class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = nums[nums.length - 1];
        if (max != n - 1) {
            return false;
        }
        for(int i=0;i<nums.length-1;i++){
            if(i+1 != nums[i]){
                return false;
            }
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return false;
        }
    return true;
    }
}
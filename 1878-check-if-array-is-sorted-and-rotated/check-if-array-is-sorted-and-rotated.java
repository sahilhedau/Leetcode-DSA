class Solution {
    public boolean check(int[] nums) {
        int condition_check = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                condition_check += 1;
                if(condition_check > 1){
                    return false;
                }
                if(nums[0] < nums[nums.length-1]){
                    return false;
                }
            }
        }
    return true;
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int ans[] = new int[nums.length];
        int count0 = 0;
        int a = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                count0++;
            }else{
                ans[a] = nums[i];
                a++;
            }
        }
        for(int i = a+1;i<nums.length;i++){
            ans[a] = 0;
            a++;
        }
        for(int i = 0;i<nums.length;i++){
            nums[i] = ans[i];
        }
    }
}